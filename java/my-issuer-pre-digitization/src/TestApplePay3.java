import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.HexFormat;
import java.util.function.Consumer;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.KDFParameters;

import at.favre.lib.crypto.SingleStepKdf;

public class TestApplePay3 {
	static record Data(byte[] encryptedData, PublicKey ephemeralPublicKey) {
	}

	static final Consumer<byte[]> printHex = (bs) -> {
		var hexFormat = HexFormat.ofDelimiter(" ").withPrefix("0x");
		System.out.println(hexFormat.formatHex(bs));
	};

	@FunctionalInterface
	interface TrySupplier<T, E1 extends Throwable, E2 extends Throwable> {
		T get() throws E1, E2;
	}

	public static void main(String[] args) throws IOException, InvalidAlgorithmParameterException,
			NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException, KeyStoreException,
			CertificateException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {

		var keyPair = step2().get();
		var json = "{ok:'o_o!'}";
		Data data = encrypt(keyPair.getPublic(), json);
		{

			var sharedsecret = step3(data.ephemeralPublicKey, keyPair.getPrivate());
			printHex.accept(sharedsecret);
			SecretKey AESKEY = step4_2(sharedsecret, data.ephemeralPublicKey);

			byte[] decryptedText = CryptUtils.decrypt(data.encryptedData, AESKEY);
			System.out.println("Decrypted Text : " + new String(decryptedText));
		}
	}

	// https://neilmadden.blog/2016/05/20/ephemeral-elliptic-curve-diffie-hellman-key-agreement-in-java/
	static Data encrypt(PublicKey step1, String json) throws NoSuchAlgorithmException, InvalidKeySpecException,
			KeyStoreException, CertificateException, IOException, InvalidAlgorithmParameterException,
			InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {

		// Step 1: Extract Public Key from Leaf Certificate
		var publickey = step1;

		// Step 2: Ephemeral Key Pairs: On the issuer server, generate the Ephemeral Key
		// Pairs.
		var keyPair = step2().get();

		// Step 3: Elliptic-curve Diffie–Hellman:The Elliptic-curve Diffie–Hellman
		// algorithm is used to generate the Shared Secret. As input keys
		// use the Apple Public Key from the leaf certificate and the Ephemeral Private
		// Key generated on the
		// issuer server.

		var sharedsecret = step3(publickey, keyPair.getPrivate());
		printHex.accept(sharedsecret);
		// Step 4: NIST Single-step KDF The NIST Single-step KDF parameterized with the
		// SHA-256 hash function is used to derive a 256
		// bit key. The following are the inputs to the KDF.
		// Step 5: Symmetric AES Key: From the KDF input, the issuer can generate the
		// AES key which is used for encryption in Step 6.
		SecretKey AESKEY = step4_2(sharedsecret, keyPair.getPublic());

		// Step 6: AES GCM Encryption: The AES symmetric key is used to encrypt the JSON
		// payload with the AES cypher in GCM mode
		// with null byte IV. The resulting output shall include the AES GCM Message
		// Authentication Code
		// (MAC) after the encrypted data.

		byte[] encrypted = CryptUtils.encrypt(json.getBytes(), AESKEY);

		byte[] decryptedText = CryptUtils.decrypt(encrypted, AESKEY);

		System.out.println("Decrypted Text : " + new String(decryptedText));

		System.out.println("*** ok");

		return new Data(encrypted, keyPair.getPublic());
	}

	static TrySupplier<KeyPair, InvalidAlgorithmParameterException, NoSuchAlgorithmException> step2()
			throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {
		// NIST（米国立標準技術研究所）推奨パラメータ
		// P-256
		// secp256r1

		// キーペアを作成
		var funcKeyPairGenerator = (TrySupplier<KeyPair, InvalidAlgorithmParameterException, NoSuchAlgorithmException>) () -> {
			var keyPairGenerator = KeyPairGenerator.getInstance("EC");
			var ecGenParameterSpec = new ECGenParameterSpec("NIST P-256");
			keyPairGenerator.initialize(ecGenParameterSpec);
			return keyPairGenerator.generateKeyPair();
		};

		return funcKeyPairGenerator;
	}

	// generateSharedSecret
	static byte[] step3(PublicKey publickKey, PrivateKey privatekey)
			throws NoSuchAlgorithmException, InvalidKeyException {

		final String ALGORITHM = "ECDH";

		KeyAgreement keyAgreement = KeyAgreement.getInstance(ALGORITHM);
		keyAgreement.init(privatekey);
		keyAgreement.doPhase(publickKey, true);

		return keyAgreement.generateSecret();
	}

	static SecretKey step4(byte[] sharedSecret, PublicKey publicKey)
			throws NoSuchAlgorithmException, InvalidKeySpecException, IOException {

		HexFormat format = HexFormat.of();
		// var hex_sharedSecret = format.formatHex(sharedsecret);

		var byteArrayOutputStream = new ByteArrayOutputStream();

		byteArrayOutputStream.write(0x13);// Algorithm ID Length (1 byte):
		byteArrayOutputStream.write("id-aes256-GCM".getBytes()); // Algorithm ID ("id-aes256-GCM", 13 bytes):
		byteArrayOutputStream.write("Apple".getBytes()); // Party U Info ("Apple", 5 bytes):
		// byteArrayOutputStream.write(publicKey.getEncoded()); // Ephemeral Public Key
		// (From
		byteArrayOutputStream.write(publicKey.getEncoded()); // Ephemeral Public Key (From

		// Step 2, 65 bytes):
		byte[] keyMaterial = SingleStepKdf.fromHmacSha256().derive(sharedSecret, 32,
				byteArrayOutputStream.toByteArray());
		SecretKey secretKey = new SecretKeySpec(keyMaterial, "AES");

		return secretKey;
	}

	static SecretKey step4_2(byte[] sharedSecret, PublicKey publicKey) throws IOException {
		HexFormat format = HexFormat.of();
		// var hex_sharedSecret = format.formatHex(sharedsecret);

		var byteArrayOutputStream = new ByteArrayOutputStream();

		// singlestepKDFParam.append(counter); // Counter (4 bytes):
		// singlestepKDFParam.append(hex_sharedSecret);// Shared Secret (From Step 3, 32
		// bytes):
		byteArrayOutputStream.write(0x13);// Algorithm ID Length (1 byte):
		byteArrayOutputStream.write("id-aes256-GCM".getBytes()); // Algorithm ID ("id-aes256-GCM", 13 bytes):
		byteArrayOutputStream.write("Apple".getBytes()); // Party U Info ("Apple", 5 bytes):
		// byteArrayOutputStream.write(publicKey.getEncoded()); // Ephemeral Public Key
		// (From
		byteArrayOutputStream.write(publicKey.getEncoded()); // Ephemeral Public Key (From

		byte[] keyMaterial = derive(sharedSecret, byteArrayOutputStream.toByteArray());
		SecretKey secretKey = new SecretKeySpec(keyMaterial, "AES");
		return secretKey;
	}

	public static class CryptUtils {
		public static final int AES_KEY_SIZE = 256;
		public static final int GCM_IV_LENGTH = 12;
		public static final int GCM_TAG_LENGTH = 16;

		public static byte[] decrypt(byte[] cipherData, SecretKey key)
				throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException,
				InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException {

			byte[] IV = new byte[GCM_IV_LENGTH];

			var cipher = Cipher.getInstance("AES/GCM/NoPadding");

			// Create SecretKeySpec
			var keySpec = new SecretKeySpec(key.getEncoded(), "AES");

			// Create GCMParameterSpec
			var gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, IV);

			// Initialize Cipher for DECRYPT_MODE
			cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmParameterSpec);

			return cipher.doFinal(cipherData);

		}

		public static byte[] encrypt(byte[] plaintext, SecretKey key)
				throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
				InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {

			byte[] IV = new byte[GCM_IV_LENGTH];

			// Get Cipher Instance
			var cipher = Cipher.getInstance("AES/GCM/NoPadding");
			// Create SecretKeySpec
			var keySpec = new SecretKeySpec(key.getEncoded(), "AES");
			// Create GCMParameterSpec
			var gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, IV);
			// Initialize Cipher for ENCRYPT_MODE
			cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmParameterSpec);

			return cipher.doFinal(plaintext);
		}
	}

	public static byte[] derive(byte[] initialSecret, byte[] ephemeralKeyBytes) {
		KDF2BytesGenerator kdfGenerator = new KDF2BytesGenerator(new SHA256Digest());
		kdfGenerator.init(new KDFParameters(initialSecret, ephemeralKeyBytes));
		byte[] kdfOut = new byte[32];
		kdfGenerator.generateBytes(kdfOut, 0, 32);
		return kdfOut;
	}

	public static SecretKey generateAESfromKDF(String password, String salt)
			throws NoSuchAlgorithmException, InvalidKeySpecException {
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
		KeySpec spec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), 65536, 256);
		SecretKey secret = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
		return secret;
	}

}
