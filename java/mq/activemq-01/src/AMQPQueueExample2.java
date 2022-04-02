/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.qpid.jms.JmsConnectionFactory;

public class AMQPQueueExample2 {

	@FunctionalInterface
	interface func {
		public func a(func f);
	}

	@FunctionalInterface
	interface consumerThrowsException<T> {

		void accept(T t) throws Exception;

	}

	static IntConsumer consumer(consumerThrowsException<Integer> c) {
		return new IntConsumer() {

			@Override
			public void accept(int t) {
				if (c == null)
					return;
				try {
					c.accept(t);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		};
	}

	public static void main(String[] args) throws Exception {

		ConnectionFactory connectionFactory = new JmsConnectionFactory("amqp://localhost:5672");

		try (Connection connection = connectionFactory.createConnection()) {
			connection.start();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue queue = session.createQueue("exampleQueue3");
			
			{
				MessageProducer sender = session.createProducer(queue);

				IntStream.range(0, 10).forEach((IntConsumer) consumer(i -> {
					sender.send(session.createTextMessage("Hello world " + i));

				}));

			}
			
			{
				MessageConsumer consumer = session.createConsumer(queue);

				IntStream.range(0, 2000).forEach((IntConsumer) consumer(i -> {
					TextMessage m = (TextMessage) consumer.receive(100);

					System.out.println("message = " + m.getText());
				}));
				
			}


		}
	}

}
