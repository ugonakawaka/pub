import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HexFormat;
import java.util.function.Consumer;

import javax.crypto.KeyAgreement;

// 楕円曲線ディフィー・ヘルマン鍵共有
public class TestEllipticCurveDiffieHellman {

	@FunctionalInterface
	interface TrySupplier<T, E1 extends Throwable, E2 extends Throwable, E3 extends Throwable> {
		T get() throws E1, E2, E3;
	}

	public static void main(String[] args) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException,
			InvalidKeyException, InvalidKeySpecException, IOException {
		// 楕円曲線ディフィー・ヘルマン鍵共有

		a();
		b();
	}

	static void b() throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, InvalidKeyException,
			InvalidKeySpecException, IOException {
		// opensslコマンドと連携して試す
		// 事前準備
//		openssl ecparam -genkey -name secp256r1 -out keypair.pem
//		openssl ec -in keypair.pem -outform DER -pubout -out keypublic.der
//		openssl pkcs8 -topk8 -inform pem -in keypair.pem -nocrypt -outform DER -out keyprivate.der

		var keyPairGen = (TrySupplier<KeyPair, InvalidAlgorithmParameterException, NoSuchAlgorithmException, /* dummy */RuntimeException>) () -> {
			var keyPairGenerator = KeyPairGenerator.getInstance("EC");
			var ecGenParameterSpec = new ECGenParameterSpec("NIST P-256");
			keyPairGenerator.initialize(ecGenParameterSpec);

			return keyPairGenerator.generateKeyPair();
		};
		var keyPairFile = (TrySupplier<KeyPair, InvalidKeySpecException, NoSuchAlgorithmException, IOException>) () -> {
			byte[] bytesPublickey = Files.readAllBytes(Paths.get("mycert/keypublic.der"));
			byte[] bytesPrivatekey = Files.readAllBytes(Paths.get("mycert/keyprivate.der"));

			var keySpec1 = new X509EncodedKeySpec(bytesPublickey);
			var keySpec2 = new PKCS8EncodedKeySpec(bytesPrivatekey);
			var kf = KeyFactory.getInstance("EC");

			return new KeyPair(kf.generatePublic(keySpec1), kf.generatePrivate(keySpec2));
		};

		var printHex = (Consumer<byte[]>) (bs) -> {
			var hexFormat = HexFormat.ofDelimiter(" ").withPrefix("0x");
			System.out.println(hexFormat.formatHex(bs));
		};
		// キーペアを２つ作成して
		var keyPair1 = keyPairGen.get();
		var keyPair2 = keyPairFile.get();

		byte[] sharedKeyA = sharedKey("ECDH", keyPair1.getPublic(), keyPair2.getPrivate());
		byte[] sharedKeyB = sharedKey("ECDH", keyPair2.getPublic(), keyPair1.getPrivate());

		// 同じ鍵が生成される
		printHex.accept(sharedKeyA);
		printHex.accept(sharedKeyB);
	}

	static void a() throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, InvalidKeyException {
		// 共通鍵暗号の実験

		var keyPair = (TrySupplier<KeyPair, InvalidAlgorithmParameterException, NoSuchAlgorithmException, /* dummy */RuntimeException>) () -> {
			var keyPairGenerator = KeyPairGenerator.getInstance("EC");
			var ecGenParameterSpec = new ECGenParameterSpec("NIST P-256");
			keyPairGenerator.initialize(ecGenParameterSpec);
			return keyPairGenerator.generateKeyPair();
		};

		var printHex = (Consumer<byte[]>) (bs) -> {
			var hexFormat = HexFormat.ofDelimiter(" ").withPrefix("0x");
			System.out.println(hexFormat.formatHex(bs));
		};

		// キーペアを２つ作成して
		var keyPair1 = keyPair.get();
		var keyPair2 = keyPair.get();

		byte[] sharedKeyA = sharedKey("ECDH", keyPair1.getPublic(), keyPair2.getPrivate());
		byte[] sharedKeyB = sharedKey("ECDH", keyPair2.getPublic(), keyPair1.getPrivate());

		// 同じ鍵が生成される
		printHex.accept(sharedKeyA);
		printHex.accept(sharedKeyB);

	}

	public static byte[] sharedKey(String algorithm, PublicKey publicKey, PrivateKey privateKey)
			throws NoSuchAlgorithmException, InvalidKeyException {

		var keyAgreement = KeyAgreement.getInstance(algorithm);
		keyAgreement.init(privateKey);
		keyAgreement.doPhase(publicKey, true);

		return keyAgreement.generateSecret();
	}

}
