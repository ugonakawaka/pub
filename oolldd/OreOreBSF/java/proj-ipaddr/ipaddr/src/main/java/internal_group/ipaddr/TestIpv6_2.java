package internal_group.ipaddr;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

import com.googlecode.ipv6.IPv6Address;
import com.googlecode.ipv6.IPv6Network;

import internal_group.ipaddr.Test1.Ipv4Range;

public class TestIpv6_2 {

	interface IIpv6RangeCompareBase {

		public BigInteger lstart();

		public BigInteger lend();
	}

	static class Ipv6RangeKey implements IIpv6RangeCompareBase {

		public final String stringIpv6OrIpv6Prefix;
		public final BigInteger startBigInteger;
		public final BigInteger endBigInteger;

		public Ipv6RangeKey(String stringIpv6OrIpv6Prefix) {
			this.stringIpv6OrIpv6Prefix = stringIpv6OrIpv6Prefix;

			if (stringIpv6OrIpv6Prefix.contains("/")) {
				IPv6Network iPv6Network = IPv6Network.fromString(stringIpv6OrIpv6Prefix);
				this.startBigInteger = iPv6Network.getFirst().toBigInteger();
				this.endBigInteger = iPv6Network.getLast().toBigInteger();

				return;
			}

			IPv6Address iPv6Address = IPv6Address.fromString(stringIpv6OrIpv6Prefix);
			this.startBigInteger = iPv6Address.toBigInteger();
			this.endBigInteger = this.startBigInteger;

		}

		public BigInteger lstart() {
			return startBigInteger;
		}

		public BigInteger lend() {
			return endBigInteger;
		}

	}

	static class Ipv6Range implements IIpv6RangeCompareBase {

		public final String start;
		public final String end;
		public final BigInteger startBigInteger;
		public final BigInteger endBigInteger;
		public final String startLongFormat;
		public final String endLongFormat;

		public Ipv6Range(String startIpv6prefix, String endIpv6prefix) {
			this.start = startIpv6prefix;
			this.end = endIpv6prefix;

			{
				IPv6Network iPv6Network = IPv6Network.fromString(startIpv6prefix);
				this.startBigInteger = iPv6Network.getFirst().toBigInteger();
				this.startLongFormat = iPv6Network.getFirst().toLongString();
			}

			{
				IPv6Network iPv6Network = IPv6Network.fromString(endIpv6prefix);
				this.endBigInteger = iPv6Network.getLast().toBigInteger();
				this.endLongFormat = iPv6Network.getLast().toLongString();
			}

		}

		public BigInteger lstart() {
			return this.startBigInteger;
		}

		public BigInteger lend() {
			return this.endBigInteger;
		}

		public String toString() {

			return String.format("%s (%s)(%s) - %s (%s)(%s)", this.start, this.startLongFormat, this.startBigInteger,
					this.end, this.endLongFormat, this.endBigInteger);
		}
	}

	public static void main(String[] args) {
		a();

	}

	static void a() {

		{
			String end = "250e:006a:0000:0000::/32";

			IPv6Network iPv6Network = IPv6Network.fromString(end);
			System.out.println(iPv6Network);
			System.out.println(iPv6Network.toLongString());
			System.out.println(iPv6Network.getFirst().toBigInteger());

		}

		{
			String end = "250e:006a:0000:0000::/32";

			IPv6Network iPv6Network = IPv6Network.fromString(end);
			System.out.println(iPv6Network);
			System.out.println(iPv6Network.toLongString());
			System.out.println(iPv6Network.getLast().toLongString());
			System.out.println(iPv6Network.getLast().toBigInteger());

		}

		{

			String start = "240e:006a:0000:0000::/32";
			String end = "250e:006a:0000:0000::/32";
			Ipv6Range ipv6Range = new Ipv6Range(start, end);
			System.out.println(ipv6Range);
		}

		{

			String start = "240e:006a:0000:0000::/32";
			String end = "250e:006a:0000:0000::/32";
			Ipv6Range ipv6Range = new Ipv6Range(start, end);
			System.out.println(ipv6Range);

			Ipv6Range[] ipv6Ranges = { new Ipv6Range(start, end), };

			Arrays.sort(ipv6Ranges, new Comparator<Ipv6Range>() {

				public int compare(Ipv6Range o1, Ipv6Range o2) {
					return o1.lstart().compareTo(o2.lstart());
				}
			});

			// Ipv6RangeKey ipv6RangeKey = new
			// Ipv6RangeKey("250e:0060:0000:0000:0000:0000:0000:0001");
			Ipv6RangeKey ipv6RangeKey = new Ipv6RangeKey("250e:006c:0000:0001::/32");
			//

			final int pos = Arrays.binarySearch(ipv6Ranges, ipv6RangeKey, new Comparator<IIpv6RangeCompareBase>() {

				public int compare(IIpv6RangeCompareBase o1, IIpv6RangeCompareBase key) {

					if (0 >= o1.lstart().compareTo(key.lstart()) && 0 >= key.lend().compareTo(o1.lend())) {
						return 0;
					}

					if (0 <= o1.lstart().compareTo(key.lstart()))
						return 1;
					return -1;
				}
			});

			System.out.println(pos);
		}

	}
}
