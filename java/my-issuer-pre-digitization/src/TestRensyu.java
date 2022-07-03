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

public class TestRensyu {

	final static String TARGET_STRING = "1234うまくできたかな are you ok?";
	final static String PASSWORD = "test";
	final static String PATH_P12 = "cert/forTest.p12";

	public static void main(String[] args) throws KeyStoreException, UnrecoverableKeyException,
			NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, SignatureException {

		// 練習)
		// PKCSを扱う流れをいろいろ試してみる
		//
		// 参考)
		// https://one-it-thing.com/5624/

		var bs = sign();
		var b = verify(bs);

		System.out.printf("result=> %s%n", b);

	}

	static byte[] sign() throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException,
			InvalidKeyException, SignatureException {

		// 1.keystore
		// 2.aliasname
		// 3.privatekey sign

		var path = Path.of(PATH_P12);
		var keystore = getKeyStorePkcs12(path, PASSWORD);

		{
			// 証明書から公開鍵をロード
			Enumeration<String> e = keystore.aliases();
			var alias = e.nextElement();
			{ //
				var key = keystore.getKey(alias, PASSWORD.toCharArray());
				var privateKey = (PrivateKey) key;
				var signature = Signature.getInstance("SHA256WithRSA");
				signature.initSign(privateKey);
				signature.update(TARGET_STRING.getBytes());
				return signature.sign();
			}

		}

	}

	static boolean verify(byte[] bs) throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException,
			InvalidKeyException, SignatureException {

		// 1.keystore
		// 2.aliasname, X509Certificate, publickey
		// 3.verify

		var path = Path.of(PATH_P12);
		var keystore = getKeyStorePkcs12(path, PASSWORD);

		{
			Enumeration<String> enumeration = keystore.aliases();
			var alias = enumeration.nextElement();
			var aX509Certificate = getCertificate(keystore, alias);
			var publicKey = aX509Certificate.getPublicKey();
			{
				var signature = Signature.getInstance("SHA256WithRSA");
				signature.initVerify(publicKey);
				signature.update(TARGET_STRING.getBytes());
				return signature.verify(bs);
			}
		}
	}

	static X509Certificate getCertificate(KeyStore keyStore, String alias) {
		try {
			return (X509Certificate) keyStore.getCertificate(alias);
		} catch (KeyStoreException e) {
			throw new RuntimeException(e);
		}
	}

	public static KeyStore getKeyStorePkcs12(Path file, String password) {

		return getKeyStore(file, password, "pkcs12");
	}

	public static KeyStore getKeyStore(Path file, String password, String type) {

		try (var keyStoreStream = Files.newInputStream(file)) {

			var keyStore = KeyStore.getInstance(type);
			keyStore.load(keyStoreStream, password.toCharArray());
			return keyStore;
		} catch (IOException | NoSuchAlgorithmException | CertificateException | KeyStoreException e) {
			throw new RuntimeException(e);
		}

	}
}
