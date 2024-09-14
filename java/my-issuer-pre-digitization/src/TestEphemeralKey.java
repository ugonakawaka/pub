import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.util.HexFormat;
import java.util.function.Consumer;

import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

public class TestEphemeralKey {
	public static void main(String[] args) throws NoSuchAlgorithmException, GSSException {
		a();
	}

	static void a() throws NoSuchAlgorithmException, GSSException {

		var format = HexFormat.of().withUpperCase();

		var printer = (Consumer<byte[]>) (bs) -> {
			System.out.printf("len:[%d] [%s]%n", bs.length, format.formatHex(bs));

		};

		// 楕円曲線ディフィー・ヘルマン鍵共有

		var keyPair = generateKeyPair();
		System.out.println(keyPair.getPublic());
		System.out.println(keyPair.getPrivate());
		{
			var ecPublicKey = (ECPublicKey) keyPair.getPublic();

			printer.accept(ecPublicKey.getEncoded());
			System.out.println();
			//ecPublicKey.getParams().
		}

		// 1.2.840.10045.3.1.7
		var parameter = "1.2.840.10045.3.1.7";
		Oid oid = new Oid(parameter);
		System.out.println(oid);
		// System.out.println(oid.);
	}

	public static KeyPair generateKeyPair() throws NoSuchAlgorithmException {
		KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");
		generator.initialize(256);

		return generator.generateKeyPair();
	}
}
