import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.HexFormat;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.crypto.KeyAgreement;

public class TestEllipticCurveDiffieHellman {

	@FunctionalInterface
	interface TrySupplier<T, E1 extends Throwable, E2 extends Throwable> {
		T get() throws E1, E2;
	}

	public static void main(String[] args)
			throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, InvalidKeyException {
		a();
	}

	static void a() throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, InvalidKeyException {
		// 共通鍵暗号の実験

		var keyPair = (TrySupplier<KeyPair, InvalidAlgorithmParameterException, NoSuchAlgorithmException>) () -> {
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

		byte[] sharedKeyA = sharedKey(keyPair1.getPublic(), keyPair2.getPrivate());
		byte[] sharedKeyB = sharedKey(keyPair2.getPublic(), keyPair1.getPrivate());

		// 同じ鍵が生成される
		printHex.accept(sharedKeyA);
		printHex.accept(sharedKeyB);

	}

	static byte[] sharedKey(PublicKey publicKey, PrivateKey privateKey)
			throws NoSuchAlgorithmException, InvalidKeyException {

		var keyAgreement = KeyAgreement.getInstance("ECDH");
		keyAgreement.init(privateKey);
		keyAgreement.doPhase(publicKey, true);

		return keyAgreement.generateSecret();
	}

}
