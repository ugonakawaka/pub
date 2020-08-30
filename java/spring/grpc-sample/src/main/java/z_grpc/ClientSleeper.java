package z_grpc;

import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import z_grpc.grpc.SleepClass;
import z_grpc.grpc.SleepClass.SleepReply;
import z_grpc.grpc.SleeperGrpc;

import z_grpc.grpc.SleeperGrpc.SleeperBlockingStub;

public class ClientSleeper {

	SleeperBlockingStub sleeperBlockingStub;
	ManagedChannel channel;

	public static void main(String... args) throws InterruptedException {

	}

	static Runnable runnable(String name) {
		return new Runnable() {

			@Override
			public void run() {

			}
		};
	}

	public SleepReply sleep(String name, int time) {
		SleepClass.SleepRequest request = SleepClass.SleepRequest.newBuilder().setTime(time).setName(name).build();
		// sleeperBlockingStub.withDeadlineAfter(100/* duration */,
		// TimeUnit.MILLISECONDS).doSleep(request);
		SleepReply sleepReply = sleeperBlockingStub.doSleep(request);
		return sleepReply;
	}

	public static ClientSleeper create(String host, int port) {
		ClientSleeper simpleClient = new ClientSleeper();
		simpleClient.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		simpleClient.sleeperBlockingStub = SleeperGrpc.newBlockingStub(simpleClient.channel);

		return simpleClient;
	}

	public void shutdown() throws InterruptedException {

		channel.shutdown().awaitTermination(5L, TimeUnit.SECONDS);
	}
}
