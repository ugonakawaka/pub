package z_grpc;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import io.grpc.stub.StreamObserver;
import z_grpc.grpc.CmdClass.CmdReply;
import z_grpc.grpc.CmdClass.CmdRequest;
import z_grpc.grpc.CmdGrpc.CmdImplBase;
import z_grpc.grpc.GreetClass.HelloReply;
import z_grpc.grpc.GreetClass.HelloRequest;
import z_grpc.grpc.GreeterGrpc.GreeterImplBase;
import z_grpc.grpc.SleepClass.SleepReply;

@GRpcService
public class endpointCmd extends CmdImplBase {

	@Autowired
	TaskExecutor taskExecutor;

	@Override
	public void doCmd(CmdRequest request, StreamObserver<CmdReply> responseObserver) {

		CmdReply cmdReply = CmdReply.newBuilder().setMessage("o_o!").build();

		responseObserver.onNext(cmdReply);
		responseObserver.onCompleted();
	}

	@Override
	public void startEcho(CmdRequest request, StreamObserver<CmdReply> responseObserver) {

		final String address = request.getAddress();
		taskExecutor.startEcho(address);

		CmdReply cmdReply = CmdReply.newBuilder().setMessage("o_o!").build();

		responseObserver.onNext(cmdReply);
		responseObserver.onCompleted();
	}

	@Override
	public void stopEcho(CmdRequest request, StreamObserver<CmdReply> responseObserver) {
		final String address = request.getAddress();
		taskExecutor.stopEcho(address);
		final CmdReply cmdReply = CmdReply.newBuilder().setMessage("o_o!").build();

		responseObserver.onNext(cmdReply);
		responseObserver.onCompleted();
	}

}
