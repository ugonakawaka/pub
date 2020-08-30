package z_grpc;

import java.util.concurrent.TimeUnit;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import z_grpc.grpc.GreeterGrpc;
import z_grpc.grpc.CmdClass.CmdRequest;
import z_grpc.grpc.CmdGrpc;
import z_grpc.grpc.CmdGrpc.CmdBlockingStub;
import z_grpc.grpc.GreetClass.HelloRequest;
import z_grpc.grpc.GreeterGrpc.GreeterBlockingStub;

public class ClientCmd {

	CmdBlockingStub blockingStub;
	ManagedChannel channel;

	public static void main(String... args) throws InterruptedException {

		if (true) {

			ClientCmd simpleClient = ClientCmd.create("localhost", 6565);
			
			{
				
				final String address = "o_o!2";
				// simpleClient.startEcho("ok!");
				simpleClient.startEcho(address);
				simpleClient.stopEcho(address);
				
			}
			{
			
				final String address = "o_o!";
				// simpleClient.startEcho("ok!");
				// simpleClient.startEcho(address);
				simpleClient.stopEcho(address);
				
			}
			
			
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

	static Runnable runnable(String command) {
		return new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ClientCmd simpleClient = ClientCmd.create("localhost", 6565);
				simpleClient.command(command);
				try {
					simpleClient.shutdown();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
	}

	public void command(String command) {
		CmdRequest request = CmdRequest.newBuilder().setCommand(command).build();
		blockingStub.doCmd(request);
	}

	public void startEcho(String address) {
		CmdRequest request = CmdRequest.newBuilder().setAddress(address).build();

		blockingStub.startEcho(request);
	}

	public void stopEcho(String address) {
		CmdRequest request = CmdRequest.newBuilder().setAddress(address).build();
		blockingStub.stopEcho(request);
	}

	public static ClientCmd create(String host, int port) {
		ClientCmd simpleClient = new ClientCmd();
		simpleClient.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		simpleClient.blockingStub = CmdGrpc.newBlockingStub(simpleClient.channel);

		return simpleClient;
	}

	public void shutdown() throws InterruptedException {

		channel.shutdown().awaitTermination(5L, TimeUnit.SECONDS);
	}
}
