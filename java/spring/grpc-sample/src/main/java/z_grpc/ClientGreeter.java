package z_grpc;

import java.util.concurrent.TimeUnit;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import z_grpc.grpc.GreeterGrpc;
import z_grpc.grpc.GreetClass.HelloRequest;
import z_grpc.grpc.GreeterGrpc.GreeterBlockingStub;

public class ClientGreeter {

	GreeterBlockingStub greeterBlockingStub;
	ManagedChannel channel;

	public static void main(String... args) throws InterruptedException {

		loopSend(0);

		if (true) {

			ClientGreeter simpleClient = ClientGreeter.create("localhost", 6565);
			simpleClient.name("yooo");
			simpleClient.shutdown();
		}
	}

	static void loopSend(int max) {
		System.out.println("loop send start");
		long start = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			Thread thread = new Thread(runnable("sleep" + i));
			thread.start();
		}
		long end = System.currentTimeMillis();

		System.out.println(("time:" + (end - start) / 1000));
	}

	static Runnable runnable(String name) {
		return new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ClientGreeter simpleClient = ClientGreeter.create("localhost", 6565);
				simpleClient.name(name);
				try {
					simpleClient.shutdown();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
	}

	public void name(String name) {
		HelloRequest request = HelloRequest.newBuilder().setName(name).build();
		greeterBlockingStub.sayHello(request);
	}

	public static ClientGreeter create(String host, int port) {
		ClientGreeter simpleClient = new ClientGreeter();
		simpleClient.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		simpleClient.greeterBlockingStub = GreeterGrpc.newBlockingStub(simpleClient.channel);

		return simpleClient;
	}

	public void shutdown() throws InterruptedException {

		channel.shutdown().awaitTermination(5L, TimeUnit.SECONDS);
	}
}
