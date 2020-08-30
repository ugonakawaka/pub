package z_grpc;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;
import z_grpc.grpc.SleepClass.SleepReply;
import z_grpc.grpc.SleepClass.SleepRequest;
import z_grpc.grpc.SleeperGrpc.SleeperImplBase;

@GRpcService
public class endpointSleeper extends SleeperImplBase {

	@Override
	public void doSleep(SleepRequest request, StreamObserver<SleepReply> responseObserver) {
		// super.sayHello(request, responseObserver);
		final String name = request.getName();
		System.out.println("************");
		System.out.println(Thread.currentThread() + "==>" + name);
		System.out.println(request.getTime());
		SleepReply reply = SleepReply.newBuilder().setMessage("o_o! good sleep! " + name).build();

		{
			final int time = request.getTime();

			try {
				final long start = System.currentTimeMillis();
				System.out.println(name + "just sleep!");
				Thread.currentThread().sleep(time);
				System.out.println(name + " just i am wake up! " + ((System.currentTimeMillis() - start) / 1000.));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		responseObserver.onNext(reply);
		responseObserver.onCompleted();

	}

}
