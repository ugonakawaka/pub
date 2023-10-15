package internal_group.ipaddr;

import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

import com.googlecode.ipv6.IPv6Address;
import com.googlecode.ipv6.IPv6AddressRange;
import com.googlecode.ipv6.IPv6Network;

public class Test2 {

	public static void main(String[] args) throws UnknownHostException {
		a();

	}

	static void a() throws UnknownHostException {
		{
			final IPv6Network strangeNetwork = IPv6Network.fromString("dead:beef:1::/128");

			System.out.println(strangeNetwork);
			System.out.println(strangeNetwork.toLongString());
			System.out.println(strangeNetwork.getFirst().toLongString());
			IPv6Address iPv6Address = IPv6Address.fromString(strangeNetwork.getFirst().toLongString());
			System.out.println(iPv6Address.toBigInteger());

		}

		{

			IPv6AddressRange range = IPv6AddressRange.fromFirstAndLast(IPv6Address.fromString("::1:ffcc"),
					IPv6Address.fromString("::2:0"));

			System.out.println(range);

		}
		
		{

			IPv6AddressRange range = IPv6AddressRange.fromFirstAndLast(IPv6Address.fromString("240e:006a:0000:0000::"),
					IPv6Address.fromString("250e:006a:0000:0000::"));

			System.out.println(range);

		}
		
		{
			IPv6Address iPv6Address = IPv6Address
					.fromBigInteger(new BigInteger("295990755014133383690938178081940045824"));
			System.out.println(iPv6Address);
			System.out.println(iPv6Address.toBigInteger());

		}
	}

}
