import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.stream.IntStream;

public class UDPIPV4TosClient {

	interface TOS {

		final int IPTOS_LOWCOST = (0x02);
		final int IPTOS_RELIABILITY = (0x04);
		final int IPTOS_THROUGHPUT = (0x08);
		final int IPTOS_LOWDELAY = (0x10);

	}

	public static void main(String[] args) throws UnknownHostException, SocketException {

		final int port = 55501;
		final InetAddress laddr = InetAddress.getByName(args[1]);

		final DatagramSocket socket = new DatagramSocket();

		final int max = Integer.parseInt(args[0]);
		final IntStream intStream = IntStream.range(1, max/* exclusive */);

		// final int[] tos = { TOS.IPTOS_LOWCOST, TOS.IPTOS_RELIABILITY,
		// TOS.IPTOS_THROUGHPUT, TOS.IPTOS_LOWDELAY, };
		final long start = System.currentTimeMillis();
		intStream.forEach(i -> {
			System.out.print(".");
			byte[] buf = (String.format("%04d", i)).getBytes();
			final DatagramPacket p = new DatagramPacket(buf, buf.length, laddr, port);
			final int j = new Random(System.nanoTime()).nextInt(256/* exclusive */);

			try {
				socket.setTrafficClass(j/* 0 <= tc <= 255 */);
				socket.send(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if ((i % 30) == 0)
				System.out.println();
		});
		final long end = System.currentTimeMillis();
		System.out.printf("%nms:%f", ((end - start) / 1000.));
	}

}
