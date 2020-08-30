package z_grpc;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import io.grpc.stub.StreamObserver;
import z_grpc.grpc.GreetClass.HelloReply;
import z_grpc.grpc.GreetClass.HelloRequest;
import z_grpc.grpc.GreeterGrpc.GreeterImplBase;
import z_grpc.grpc.SleepClass.SleepReply;

@GRpcService
public class endpointGreeter extends GreeterImplBase {

	
	@Autowired
	TaskExecutor taskExecutor;
	
	@Override
	public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
		final String name = request.getName();
		// super.sayHello(request, responseObserver);
		System.out.println("************");
		System.out.println(Thread.currentThread());
		System.out.println(name);
		HelloReply helloReply = HelloReply.newBuilder().setMessage("o_o!").build();

		if (request.getName().contains("sleep")) {
			try {

				kick2(name, 100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//
		
		
		
		
		responseObserver.onNext(helloReply);
		responseObserver.onCompleted();
	}

	protected void kick2(String name, int time) throws InterruptedException {
		
		System.out.println("kick start " + name);
		ClientSleeper client = ClientSleeper.create("localhost", 6566);

		SleepReply reply = client.sleep(name, time);

		System.out.println("kick end " + reply.getMessage());
		
		client.shutdown();
	}

}
