import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PKCS12Attribute;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.Enumeration;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class TestRensyuSigniture {

	final static String TARGET_STRING = "1234うまくできたかな are you ok?";
	final static String PASSWORD = "test";
	final static String PATH_P12 = "cert/forTest.p12";

	public static void main(String[] args)
			throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, SignatureException, CertificateException, IOException {

		var bs = sign();
		var b = verify(bs);

		System.out.printf("result=> %s%n", b);

	}

	static byte[] sign() throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException,
			InvalidKeyException, SignatureException, CertificateException, IOException {

		// 1.keystore
		// 2.aliasname
		// 3.privatekey sign

		var path = Path.of(PATH_P12);
		var keyStore = getKeyStorePkcs12(path, PASSWORD);

		var privateKey = privateKey(keyStore, PASSWORD);
		var signature = Signature.getInstance("SHA256WithRSA");
		signature.initSign(privateKey);
		signature.update(TARGET_STRING.getBytes());
		return signature.sign();

	}

	static boolean verify(byte[] bs) throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException,
			InvalidKeyException, SignatureException, CertificateException, IOException {

		// 1.keystore
		// 2.aliasname, X509Certificate, publickey
		// 3.verify

		var path = Path.of(PATH_P12);
		var keystore = getKeyStorePkcs12(path, PASSWORD);
		var publicKey = publicKey(keystore);
		var signature = Signature.getInstance("SHA256WithRSA");
		signature.initVerify(publicKey);
		signature.update(TARGET_STRING.getBytes());
		return signature.verify(bs);
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
