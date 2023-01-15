package crypto.pbe;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.HexFormat;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SealedObject;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class TestSealedObject {

	static class Consts {

		static final String PBEWithHmacSHA256AndAES_256 = "PBEWithHmacSHA256AndAES_256";
	}

	// Password-Based Cryptography
	// https://docs.oracle.com/javase/jp/18/security/java-cryptography-architecture-jca-reference-guide.html
	// https://www.rfc-editor.org/rfc/rfc8018
	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException, IOException, InvalidKeySpecException,
			InvalidAlgorithmParameterException, ClassNotFoundException {

		final var hexFormat = HexFormat.of();

		final var text = "This is another example";
		final var password = "aBcd1234";
		var bs = encrypt(password, text);

		System.out.println(bs.length);
		System.out.printf("%s%n", hexFormat.formatHex(bs));

		var decryptedText = decrypt(password, bs);
		System.out.println(new String(decryptedText));
	}

	static byte[] encrypt(String password, String text)
			throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException,
			BadPaddingException, IOException, InvalidKeySpecException, InvalidAlgorithmParameterException {

		var keySpec = new PBEKeySpec(password.toCharArray());

		var keyFactory = SecretKeyFactory.getInstance(Consts.PBEWithHmacSHA256AndAES_256);

		var myKey = keyFactory.generateSecret(keySpec);

		Cipher c = Cipher.getInstance(Consts.PBEWithHmacSHA256AndAES_256);

		c.init(Cipher.ENCRYPT_MODE, myKey);

		var sealedObject = new SealedObject(text.getBytes(), c);

		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos)) {

			oos.writeObject(sealedObject);
			oos.flush();

			return baos.toByteArray();
		}

	}

	static byte[] decrypt(String password, byte[] buf) throws IOException, ClassNotFoundException, InvalidKeyException,
			NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException,
			BadPaddingException, InvalidAlgorithmParameterException {
		try (ByteArrayInputStream bis = new ByteArrayInputStream(buf);
				ObjectInputStream ois = new ObjectInputStream(bis)) {
			var sealedObject = (SealedObject) ois.readObject();

			return decrypt(password, sealedObject);

		}
	}

	static byte[] decrypt(String password, SealedObject sealedObject) throws NoSuchAlgorithmException,
			InvalidKeySpecException, NoSuchPaddingException, ClassNotFoundException, IllegalBlockSizeException,
			BadPaddingException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {

		var keySpec = new PBEKeySpec(password.toCharArray());

		var keyFactory = SecretKeyFactory.getInstance(Consts.PBEWithHmacSHA256AndAES_256);

		var myKey = keyFactory.generateSecret(keySpec);

		Cipher c = Cipher.getInstance(Consts.PBEWithHmacSHA256AndAES_256);

		{

			Cipher c2 = Cipher.getInstance(Consts.PBEWithHmacSHA256AndAES_256);

			c2.init(Cipher.ENCRYPT_MODE, myKey);

			AlgorithmParameters algParams = c2.getParameters();
			c.init(Cipher.DECRYPT_MODE, myKey, algParams);
		}

		byte[] bs = (byte[]) sealedObject.getObject(myKey);

		return bs;
	}

}
