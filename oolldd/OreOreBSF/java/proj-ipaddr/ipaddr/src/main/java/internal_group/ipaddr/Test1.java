package internal_group.ipaddr;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test1 {

	static class Ipv4Range {
		public final String start;
		public final String end;

		public Ipv4Range(String start, String end) {
			this.start = start;
			this.end = end;
		}

		public Long lstart() {
			return lval(this.start);
		}

		public Long lend() {
			return lval(this.end);
		}

		static long lval(String sipv4) {

			String[] ipAddressInArray = sipv4.split("\\.");

			long result = 0;
			for (int i = 0; i < ipAddressInArray.length; i++) {

				int power = 3 - i;
				int ip = Integer.parseInt(ipAddressInArray[i]);
				result += ip * Math.pow(256, power);

			}

			return result;

		}


		public String toString() {
			return String.format("%s(%d) %s(%d)", start, lval(start), end, lval(end));
		}
	}

	public static void main(String[] args) throws UnknownHostException {

		check("192.168.1.0", "192.168.1.254", "192.168.1.100");
		check("192.168.1.0", "192.168.1.254", "10.168.1.100");
		check("192.168.1.0", "192.168.1.99", "192.168.1.100");
		check("192.168.1.0", "192.168.2.0", "192.168.1.100");

		final Ipv4Range[] ipv4Ranges = { new Ipv4Range("192.168.2.0", "192.168.2.100"),
				new Ipv4Range("192.168.5.0", "192.168.5.100"), new Ipv4Range("192.168.4.0", "192.168.4.100"),
				new Ipv4Range("192.168.2.101", "192.168.2.200"), new Ipv4Range("192.168.3.0", "192.168.3.100"),

		};

		Arrays.sort(ipv4Ranges, new Comparator<Ipv4Range>() {

			public int compare(Ipv4Range o1, Ipv4Range o2) {
				return o1.lstart().compareTo(o2.lstart());
			}
		});

		System.out.println();
		for (Ipv4Range ipv4Range : ipv4Ranges) {
			System.out.println(ipv4Range);
		}

		Ipv4Range ipv4Range = new Ipv4Range("192.168.2.0", "192.168.2.0");

		System.out.println("aaa " + ipv4Range);
		final int pos = Arrays.binarySearch(ipv4Ranges, ipv4Range, new Comparator<Ipv4Range>() {

			public int compare(Ipv4Range o1, Ipv4Range key) {

				if (0 >= o1.lstart().compareTo(key.lstart()) && 0 >= key.lend().compareTo(o1.lend())) {
					return 0;
				}

				if (0 <= o1.lstart().compareTo(key.lstart()))
					return 1;
				return -1;
			}
		});
		System.out.println();
		System.out.println(pos);
		if (pos >= 0) {
			System.out.println(ipv4Ranges[pos]);
		} else {
			System.out.println("not hit!");
		}

	}

	static long lval(String sipv4) {

		final String[] ss = sipv4.split("\\.");

		long result = 0;
		for (int i = 0; i < ss.length; i++) {

			int power = 3 - i;
			int ip = Integer.parseInt(ss[i]);
			result += ip * Math.pow(256, power);

		}

		return result;

	}

	static boolean check(String start, String end, String target) throws UnknownHostException {

		final long istart = lval(start);
		final long iend = lval(end);
		final long itarget = lval(target);

		System.out.printf("%s(%d) < %s(%d) < %s(%d) == %b %n", start, istart, target, itarget, end, iend,
				(istart <= itarget && itarget <= iend));

		return false;
	}

}
