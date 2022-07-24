import java.io.ByteArrayInputStream;
import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Enumeration;
import java.util.HexFormat;

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

public class TestApplePay {

	@FunctionalInterface
	interface TrySupplier<T, E1 extends Throwable, E2 extends Throwable> {
		T get() throws E1, E2;
	}

	public static void main(String[] args) throws IOException, InvalidAlgorithmParameterException,
			NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException, KeyStoreException,
			CertificateException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {

		a();
	}

	// https://neilmadden.blog/2016/05/20/ephemeral-elliptic-curve-diffie-hellman-key-agreement-in-java/
	static void a() throws NoSuchAlgorithmException, InvalidKeySpecException, KeyStoreException, CertificateException,
			IOException, InvalidAlgorithmParameterException, InvalidKeyException, NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException {
		// Step 1: Extract Public Key from Leaf Certificate
		var publickey = step1();

		// Step 2: Ephemeral Key Pairs: On the issuer server, generate the Ephemeral Key
		// Pairs.

		var keyPair = step2().get();

		// Step 3: Elliptic-curve Diffie–Hellman:The Elliptic-curve Diffie–Hellman
		// algorithm is used to generate the Shared Secret. As input keys
		// use the Apple Public Key from the leaf certificate and the Ephemeral Private
		// Key generated on the
		// issuer server.

		var sharedsecret = step3(publickey, keyPair.getPrivate());

		// Step 4: NIST Single-step KDF The NIST Single-step KDF parameterized with the
		// SHA-256 hash function is used to derive a 256
		// bit key. The following are the inputs to the KDF.

		SecretKey AESKEY = step4(sharedsecret, keyPair.getPublic());

		// Step 5: Symmetric AES Key: From the KDF input, the issuer can generate the
		// AES key which is used for encryption in Step 6.

		// Step 6: AES GCM Encryption: The AES symmetric key is used to encrypt the JSON
		// payload with the AES cypher in GCM mode
		// with null byte IV. The resulting output shall include the AES GCM Message
		// Authentication Code
		// (MAC) after the encrypted data.
		String json = "{ok:'o_o!'}";
		byte[] IV = new byte[GCM_IV_LENGTH];
		// SecureRandom random = new SecureRandom();
		// random.nextBytes(IV);
		byte[] cipherText = encrypt(json.getBytes(), AESKEY, IV);

		byte[] decryptedText = decrypt(cipherText, AESKEY, IV, null);
		System.out.println("Decrypted Text : " + new String(decryptedText));

		System.out.println("*** ok");
	}

	final static String PASSWORD = "test";
	final static String PATH_P12 = "cert/forTest.p12";

	/**
	 * dummy code
	 * 
	 * @return
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeySpecException
	 * @throws CertificateException
	 * @throws KeyStoreException
	 */
	static PublicKey step1() throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, KeyStoreException,
			CertificateException {

		{

			var kf = KeyFactory.getInstance("EC");

			var publicPem = Files.readString(Path.of("cert/public.pem")).replaceAll("-----.+?-----", "")
					.replaceAll("\\r?\\n", "").trim();
			;
			var publicDer = Base64.getDecoder().decode(publicPem);

			var publicKeySpec = new X509EncodedKeySpec(publicDer);
			var publicKey = (ECPublicKey) kf.generatePublic(publicKeySpec);
			return publicKey;
		}
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
	static byte[] step3(PublicKey appleleaf, PrivateKey ephimeralprivateKey)
			throws NoSuchAlgorithmException, InvalidKeyException {
		KeyPairGenerator kpg = null;
		byte[] sharedsecret = null;

		KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
		keyAgreement.init(ephimeralprivateKey);
		keyAgreement.doPhase(appleleaf, true);
		sharedsecret = keyAgreement.generateSecret();

		return sharedsecret;
	}

	static SecretKey step4(byte[] sharedsecret, PublicKey publicKey)
			throws NoSuchAlgorithmException, InvalidKeySpecException {

		HexFormat format = HexFormat.of();
		var hex_sharedSecret = format.formatHex(sharedsecret);

		var singlestepKDFParam = new StringBuilder();
		singlestepKDFParam.append("00000001"); // Counter (4 bytes):
		singlestepKDFParam.append(hex_sharedSecret);// Shared Secret (From Step 3, 32 bytes):
		singlestepKDFParam.append("0D");// Algorithm ID Length (1 byte):
		singlestepKDFParam.append("69642D6165733235362D47434D");// Algorithm ID ("id-aes256-GCM", 13 bytes):
		singlestepKDFParam.append("4170706C65");// Party U Info ("Apple", 5 bytes):
		singlestepKDFParam.append(format.formatHex(publicKey.getEncoded()));// Ephemeral Public Key (From
		// Step 2, 65 bytes):

		var SALT = "AAAAA";

		return generateAESfromKDF(singlestepKDFParam.toString(), SALT);
	}

	public static final int AES_KEY_SIZE = 256;
	public static final int GCM_IV_LENGTH = 12;
	public static final int GCM_TAG_LENGTH = 16;

	public static byte[] decrypt(byte[] cipherData, SecretKey key, byte[] nonce, byte[] aad)
			throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException,
			InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");

		// Create SecretKeySpec
		SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");

		// Create GCMParameterSpec
		GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, nonce);

		// Initialize Cipher for DECRYPT_MODE
		cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmParameterSpec);

//		if (aad != null) {
//			// Update AAD to verify additional auth (Optional)
//			cipher.updateAAD(aad);
//		}

		// Perform Decryption
		byte[] decryptedData = cipher.doFinal(cipherData);

		return decryptedData;

	}

	public static byte[] encrypt(byte[] plaintext, SecretKey key, byte[] IV)
			throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		// Get Cipher Instance
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
		// Create SecretKeySpec
		SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");
		// Create GCMParameterSpec
		GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, IV);
		// Initialize Cipher for ENCRYPT_MODE
		cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmParameterSpec);
		// Perform Encryption
		byte[] cipherText = cipher.doFinal(plaintext);
		return cipherText;
	}

	public static SecretKey generateAESfromKDF(String password, String salt)
			throws NoSuchAlgorithmException, InvalidKeySpecException {
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
		KeySpec spec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), 65536, 256);
		SecretKey secret = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
		return secret;
	}

	static X509Certificate getX509Certificate(KeyStore keyStore, String alias) throws KeyStoreException {
		return (X509Certificate) keyStore.getCertificate(alias);
	}

	static PrivateKey privateKey(KeyStore keyStore, String password)
			throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException {
		Enumeration<String> enumeration = keyStore.aliases();

		var alias = enumeration.nextElement();
		var key = keyStore.getKey(alias, password.toCharArray());
		return (PrivateKey) key;
	}

	static PublicKey publicKey(KeyStore keyStore) throws KeyStoreException {
		Enumeration<String> enumeration = keyStore.aliases();
		var alias = enumeration.nextElement();
		var aX509Certificate = getX509Certificate(keyStore, alias);
		return aX509Certificate.getPublicKey();
	}

	public static KeyStore getKeyStorePkcs12(Path file, String password)
			throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {

		return getKeyStore(file, password, "pkcs12");
	}

	public static KeyStore getKeyStore(Path file, String password, String type)
			throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {

		try (var keyStoreStream = Files.newInputStream(file)) {

			var keyStore = KeyStore.getInstance(type);
			keyStore.load(keyStoreStream, password.toCharArray());
			return keyStore;
		}

	}

}
