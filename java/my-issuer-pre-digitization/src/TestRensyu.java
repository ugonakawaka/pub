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

	public static void main(String[] args) throws KeyStoreException, UnrecoverableKeyException,
			NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, SignatureException {
		// 練習)
		// PKCSを扱う流れをいろいろ試してみる
		//
		// 参考)
		// https://one-it-thing.com/5624/

		final var TARGET_STRING = "うまくできたかな are you ok?";

		Path path = Path.of("cert/forTest.p12");
		var keystore = getKeyStorePkcs12(path, "test");
		System.out.println(keystore.getType());
		var type = KeyStore.getDefaultType();
		KeyStore.getDefaultType();

		final var PASSWORD = "test";

		{
			// 証明書から公開鍵をロード
			Enumeration<String> e = keystore.aliases();
			var alias = e.nextElement();
			var aX509Certificate = getCertificate(keystore, alias);
			System.out.println(aX509Certificate.getSigAlgName());
			var publicKey = aX509Certificate.getPublicKey();
			System.out.println(publicKey);

//			// 署名対象データをバイナリに変換
//			byte[] sigByte = Hex.decodeHex(sigVal);

			{ //
				// PKCS12Attribute
				var key = keystore.getKey(alias, PASSWORD.toCharArray());
				var privateKey = (PrivateKey) key;
				var keyPair = new KeyPair(publicKey, privateKey);

//				Cipher cipher = Cipher.getInstance(key.getAlgorithm());
//				cipher.init(Cipher.ENCRYPT_MODE, key);

				var signature = Signature.getInstance("SHA256WithRSA");
				signature.initSign(privateKey);
				signature.update(TARGET_STRING.getBytes());
				byte[] bs = signature.sign();

				signature.initVerify(publicKey);

				signature.update(TARGET_STRING.getBytes());
				var b = signature.verify(bs);
				System.out.println(b);

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
