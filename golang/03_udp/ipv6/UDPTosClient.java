import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.stream.IntStream;

public class UDPTosClient {

	static final int IPTOS_LOWCOST = (0x02);
	static final int IPTOS_RELIABILITY = (0x04);
	static final int IPTOS_THROUGHPUT = (0x08);
	static final int IPTOS_LOWDELAY = (0x10);

	public static void main(String[] args) throws UnknownHostException, SocketException {

		final int port = 55501;
		final InetAddress laddr = InetAddress.getByName("fe80::a00:27ff:fecd:b9ac%en1");

		final DatagramSocket socket = new DatagramSocket();

		final int max = Integer.parseInt("101");// 0 < i < max 
		final int tos_max = 16;// 0 <= tc < tos_max
		
		try {
			
			final IntStream intStream = IntStream.range(1, max/* exclusive */);

			// final int[] tos = { TOS.IPTOS_LOWCOST, TOS.IPTOS_RELIABILITY,
			// TOS.IPTOS_THROUGHPUT, TOS.IPTOS_LOWDELAY, };
			final long start = System.currentTimeMillis();
			intStream.forEach(i -> {
				System.out.print(".");
				byte[] buf = (String.format("%04d", i)).getBytes();
				final DatagramPacket p = new DatagramPacket(buf, buf.length, laddr, port);
				final int j = new Random(System.nanoTime()).nextInt(tos_max/* exclusive */);

				try {
					socket.setTrafficClass(j);
					socket.send(p);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if ((i % 30) == 0)
					System.out.println();
			});
			final long end = System.currentTimeMillis();
			System.out.printf("%nms:%f", ((end - start) / 1000.));
		} finally {
			socket.close();
		}
	}

}
