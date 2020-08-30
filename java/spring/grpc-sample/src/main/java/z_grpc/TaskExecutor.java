package z_grpc;



public interface TaskExecutor {

	public void startEcho(String address);
	public void stopEcho(String address);
}
