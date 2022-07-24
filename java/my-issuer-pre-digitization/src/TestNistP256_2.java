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
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

public class TestNistP256_2 {

	// https://tech.wayne-chu.com/archives/111549
	// https://stackoverflow.com/questions/58020641/apple-pay-payment-token-decryption-in-java
	// https://stackoverflow.com/questions/30445997/loading-raw-64-byte-long-ecdsa-public-key-in-java
	public static void main(String[] args) throws Throwable {

		a();
	}

	@FunctionalInterface
	interface TrySupplier<T, E1 extends Throwable, E2 extends Throwable> {
		T get() throws E1, E2;
	}

	@FunctionalInterface
	interface TryFunction<T1, T2, E1 extends Throwable, E2 extends Throwable> {
		T2 apply(T1 t) throws E1, E2;
	}

	static void printBase64(byte[] bytes) {
		var bs = Base64.getEncoder().encode(bytes);
		System.out.println(new String(bs));
		printHex(bs);
	}

	static void printHex(byte... bytes) {
		{// The formatted string is: "#00, #01, #02, #03, #7c, #7d, #7e, #7f"
			HexFormat commaFormat = HexFormat.ofDelimiter(" ").withPrefix("0x");

			var str = commaFormat.formatHex(bytes);

			System.out.println(str);
			byte[] parsed = commaFormat.parseHex(str);
			assert (Arrays.equals(bytes, parsed));

		}
	}

	static void a() throws Throwable {

		// NIST（米国立標準技術研究所）推奨パラメータ
		// P-256
		// secp256r1

		// キーペアを作成
		var funcKeyPairGenerator = (TrySupplier<KeyPair, InvalidAlgorithmParameterException, NoSuchAlgorithmException>) () -> {
			var keyPairGenerator = KeyPairGenerator.getInstance("EC");
			// keyPairGenerator.initialize(256);
			var ecGenParameterSpec = new ECGenParameterSpec("NIST P-256");
			keyPairGenerator.initialize(ecGenParameterSpec);
			return keyPairGenerator.generateKeyPair();
		};

		var keyPair = funcKeyPairGenerator.get();

		// castしないといけない...
		var privateKey = (ECPrivateKey) keyPair.getPrivate();
		var publicKey = (ECPublicKey) keyPair.getPublic();
		{// private key
			// encodedで取得したサイズ
			System.out.printf("private %d%n", privateKey.getEncoded().length);

			// Sからバイトを取得したサイズ
			System.out.printf("private %d%n", privateKey.getS().toByteArray().length);

		}
		{ // public key
			System.out.printf("public %d%n", publicKey.getEncoded().length);

			//
			System.out.printf("public X %d%n", publicKey.getW().getAffineX().toByteArray().length);
			System.out.printf("public Y %d%n", publicKey.getW().getAffineY().toByteArray().length);
			System.out.println(publicKey.getParams().getCurve().getField().getFieldSize());
			System.out.println(publicKey.getParams().getCurve().getField().getFieldSize());

			byte[] encoded = publicKey.getEncoded();

			byte[] head = Arrays.copyOf(encoded, encoded.length - (2 * (256 / Byte.SIZE)));
			byte[] body = Arrays.copyOfRange(encoded, head.length, encoded.length);
			printHex(encoded);
			printHex(head);
			printHex(body);

			System.out.printf("%d %d %d%n", encoded.length, head.length, body.length);

			// bodyからpublic keyができるか
			ECPublicKey publicKey2 = Utils.generateP256PublicKeyFromFlatW(body);
			System.out.println("===============");
			printHex(encoded);
			printHex(publicKey2.getEncoded());

			System.out.println(Arrays.equals(encoded, publicKey2.getEncoded()));
			System.out.println("===============");

		}
		{

			byte[] encoded = publicKey.getEncoded();
			byte[] head = Arrays.copyOf(encoded, encoded.length - (2 * (256 / Byte.SIZE)));
			System.out.println(head.length);

			print(encoded);
			ECPoint ecPoint = publicKey.getW();

			System.out.println("***");
			System.out.println(publicKey.getW().getAffineX().toByteArray().length);
			System.out.println(publicKey.getW().getAffineY().toByteArray().length);
			printHex(publicKey.getW().getAffineX().toByteArray());
			printHex(publicKey.getW().getAffineY().toByteArray());
			System.out.println("***");

			// System.out.println(new Oid(new byte[] { 0x30, 0x59, 0x30, 0x13
			// }).toString());
			;

			printHex(head);
			printHex(new Oid("1.2.840").getDER());
			printHex(new Oid("1.2.840.10045.2.1").getDER());

			// https://tex2e.github.io/rfc-translater/html/rfc3279.html
			// https://tex2e.github.io/rfc-translater/html/rfc5280.html
			// 2. Subject Public Key Information Fields
//			SubjectPublicKeyInfo  ::=  SEQUENCE  {
//			       algorithm         AlgorithmIdentifier,
//			       subjectPublicKey  BIT STRING
//			     }
//			AlgorithmIdentifier  ::=  SEQUENCE  {
//		        algorithm   OBJECT IDENTIFIER,
//		        parameters  ANY DEFINED BY algorithm OPTIONAL
//		      }
//			id-ecPublicKey OBJECT IDENTIFIER ::= {
//				       iso(1) member-body(2) us(840) ansi-X9-62(10045) keyType(2) 1 }
			// 2.1.1.1. Named Curve
//			secp256r1 OBJECT IDENTIFIER ::= {
//				       iso(1) member-body(2) us(840) ansi-X9-62(10045) curves(3)
//				       prime(1) 7 }

			// 名前付き楕円曲線
//			secp256r1 OBJECT IDENTIFIER ::= {
//				     iso(1) member-body(2) us(840) ansi-X9-62(10045) curves(3)
//				     prime(1) 7 }
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
				// byte[] head = createHeadForNamedCurve(name, size);
				System.out.println(Base64.getEncoder().encodeToString(head));
				System.out.println(head.length);

				System.out.println(publicKey.getAlgorithm());
				System.out.println(publicKey.getFormat());
				System.out.println(new Oid("1.2.840.10045.3.1.7").toString());
				// System.out.println(new Oid("1").getDER());
				printHex(new Oid("1.2.840.10045.3.1.7").getDER());

				System.out.println("=======");
				// printHex(new Oid("1.2.840.10045.4").getDER());

			}

		}

	}

	static void print(byte[] encoded) throws GSSException, Throwable {
		//
//		0x30 SEQUENCE
//		0x59 89バイト
//		0x30 SEQUENCE
//		0x13 19バイト
//		0x06 0x07 0x2a 0x86 0x48 0xce 0x3d 0x02 0x01 
//		0x06 0x08 0x2a 0x86 0x48 0xce 0x3d 0x03 0x01 0x07
//		0x03 BIT STRING
//		0x42 66バイト

		var commaFormat = HexFormat.ofDelimiter(" ").withPrefix("0x");

		byte[][] bss = { new byte[] { encoded[0] } };

		final var f = (TryFunction<byte[], byte[], GSSException, ?>) (bs) -> {

			for (int i = 0; i < bs.length; i++) {
				switch (bs[i]) {
				case 0x30: {// SEQUENCE
					var len = (int) bs[++i];

					System.out.printf("SEQUENCE 0x30 len:%d%n", len);
					// Arrays.copyOfRange(encoded, i, len);

					break;
				}
				case 0x06: {// OBJECT IDENTIFIER
					var len = (int) bs[++i];
					var oid = new Oid(Arrays.copyOfRange(encoded, i - 1, i + 1 + len));
					System.out.printf("OBJECT IDENTIFIER 0x06 len:%d oid:%s%n", len, oid);
					i += len;

					break;
				}
				case 0x03: { // BIT STRING
					var len = (int) bs[++i];
					System.out.printf("BIT STRING 0x03 len:%d%n", len);
					break;
				}
				}
			}
			return null;
		};

		f.apply(encoded);

	}

	static String tohex(byte[] bs) {
		
	}
	
	public static class Utils {
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
