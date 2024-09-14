import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.HexFormat;

import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

public class TestNistP256 {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException,
			InvalidAlgorithmParameterException, IOException, GSSException {

		a();
	}

	static void printBase64(byte[] bytes) {
		var bs = Base64.getEncoder().encode(bytes);
		System.out.println(new String(bs));
		printHex(bs);
	}

	static void printHex(byte[] bytes) {
		{// The formatted string is: "#00, #01, #02, #03, #7c, #7d, #7e, #7f"
			HexFormat commaFormat = HexFormat.ofDelimiter(" ").withPrefix("0x");
			HexFormat hexFormat = HexFormat.of().withUpperCase();
			var str = commaFormat.formatHex(bytes);

			System.out.println(hexFormat.formatHex(bytes));
			System.out.println(str);
			
			byte[] parsed = commaFormat.parseHex(str);
			assert (Arrays.equals(bytes, parsed));

		}
	}

	static void a() throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidAlgorithmParameterException,
			IOException, GSSException {

		// NIST（米国立標準技術研究所）推奨パラメータ
		// P-256
		// secp256r1
		var keyPairGenerator = KeyPairGenerator.getInstance("EC");
		// keyPairGenerator.initialize(256);
		var ecGenParameterSpec = new ECGenParameterSpec("NIST P-256");
		keyPairGenerator.initialize(ecGenParameterSpec);
		var keyPair = keyPairGenerator.generateKeyPair();

		// castしないといけない...
		var privateKey = (ECPrivateKey) keyPair.getPrivate();
		var publicKey = (ECPublicKey) keyPair.getPublic();
		System.out.printf("private %d%n", privateKey.getEncoded().length);
		System.out.printf("private %d%n", privateKey.getS().toByteArray().length);
		{
			System.out.printf("public %d%n", publicKey.getEncoded().length);
			System.out.println(publicKey.getParams().getCurve().getField().getFieldSize());
			byte[] encoded = publicKey.getEncoded();
			byte[] bs = Arrays.copyOf(encoded, encoded.length - 2 * (256 / Byte.SIZE));
			System.out.println(bs.length);
			ECPoint ecPoint = publicKey.getW();
			System.out.printf(" %d - %d = %d   %n", encoded.length, bs.length, encoded.length - bs.length);
			
			
			{
				var name = "NIST P-256";
				var size = 256;
				byte[] head = createHeadForNamedCurve(name, size);
				// head分をひく
				byte[] bs2 = Arrays.copyOfRange(encoded, head.length, encoded.length);
				System.out.println("-----> " + bs2.length);
			
				
			}
			
			
			System.out.println("***");
			System.out.println(publicKey.getW().getAffineX().toByteArray().length);
			System.out.println(publicKey.getW().getAffineY().toByteArray().length);
			printHex(publicKey.getW().getAffineX().toByteArray());
			printHex(publicKey.getW().getAffineY().toByteArray());
			System.out.println("***");
			printHex(bs);
			System.out.println("*** OID");
			printHex(new Oid("1.2.840.10045.2.1").getDER());
			printHex(new Oid("1.2.840.10045.3.1.7").getDER());
			printHex(encoded);
			printBase64(encoded);// final byte[] pubBytes = ecPoint

			// Arrays.copyOfRange(pubBytes, 1, pubBytes.length);
			System.out.println("========");
			{
				KeyFactory kf = KeyFactory.getInstance("EC");
				X509EncodedKeySpec pkSpec = new X509EncodedKeySpec(encoded);
				PublicKey otherPublicKey = kf.generatePublic(pkSpec);
				System.out.println(otherPublicKey.getEncoded().length);
				// otherPublicKey.
			}
			{
				String name = "NIST P-256";
				int size = 256;
				byte[] head = createHeadForNamedCurve(name, size);
				System.out.println(Base64.getEncoder().encodeToString(head));
				System.out.println(head.length);

				System.out.println(publicKey.getAlgorithm());
				System.out.println(publicKey.getFormat());
				System.out.println(new Oid("1.2.840.10045.3.1.7").toString());
				System.out.println(new Oid("1").getDER());
				printHex(new Oid("1.2.840.10045.3.1.7").getDER());

				System.out.println("=======");
				printHex(new Oid("1.2.840.10045.4").getDER());

			}

		}

	}

	// https://stackoverflow.com/questions/30445997/loading-raw-64-byte-long-ecdsa-public-key-in-java
	private static byte[] P256_HEAD = Base64.getDecoder().decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE");

	/**
	 * Converts an uncompressed secp256r1 / P-256 public point to the EC public key
	 * it is representing.
	 * 
	 * @see https://stackoverflow.com/questions/30445997/loading-raw-64-byte-long-ecdsa-public-key-in-java
	 * @param w a 64 byte uncompressed EC point consisting of just a 256-bit X and Y
	 * @return an <code>ECPublicKey</code> that the point represents
	 * @throws NoSuchAlgorithmException
	 */
	public static ECPublicKey generateP256PublicKeyFromFlatW(byte[] w)
			throws InvalidKeySpecException, NoSuchAlgorithmException {
		byte[] encodedKey = new byte[P256_HEAD.length + w.length];
		System.arraycopy(P256_HEAD, 0, encodedKey, 0, P256_HEAD.length);
		System.arraycopy(w, 0, encodedKey, P256_HEAD.length, w.length);
		KeyFactory eckf = KeyFactory.getInstance("EC");

		X509EncodedKeySpec ecpks = new X509EncodedKeySpec(encodedKey);
		return (ECPublicKey) eckf.generatePublic(ecpks);
	}

	private static byte[] createHeadForNamedCurve(String name, int size)
			throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, IOException {
		var keyPairGenerator = KeyPairGenerator.getInstance("EC");
		var ecGenParameterSpec = new ECGenParameterSpec(name);

		keyPairGenerator.initialize(ecGenParameterSpec);
		var keyPair = keyPairGenerator.generateKeyPair();
		byte[] encoded = keyPair.getPublic().getEncoded();
		return Arrays.copyOf(encoded, encoded.length - 2 * (size / Byte.SIZE));
	}
}
