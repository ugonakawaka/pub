package crypto.pbe;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.HexFormat;
import java.util.function.BiConsumer;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import org.ietf.jgss.GSSException;

public class TestPBEKeySpec {

	static class Consts {

	}

	static final HexFormat hexFormat = HexFormat.of().withUpperCase().withDelimiter("");
	static final BiConsumer<String, byte[]> printerHex = (header, bs) -> {
		System.out.printf("%s %s%n", header, hexFormat.formatHex(bs));
	};

	static final String PBEWithHmacSHA256AndAES_256 = "PBEWithHmacSHA256AndAES_256";

	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException,
			InvalidKeySpecException, InvalidAlgorithmParameterException, NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException, IOException, GSSException {

		final var text = "i am test!";
		final var password = "12345678";
		final byte[] salt = new byte[32];
		final var count = 4096;
		// Salt
		new SecureRandom().nextBytes(salt);
		byte[] encrypted = encrypt(text, password.toCharArray(), salt, count);
		byte[] decrypted = decrypt(encrypted, password.toCharArray(), salt, count);

		System.out.println(new String(decrypted));
	}

	static byte[] encrypt(String text, char[] password, byte[] salt, /* Iteration count */int count)
			throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException,
			InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException,
			IOException, GSSException {

		var pbeKeySpec = new PBEKeySpec(password);

		var iv = new IvParameterSpec("123456789abcdefg".getBytes());

		var pbeParamSpec = new PBEParameterSpec(salt, count, iv);

		SecretKeyFactory keyFac = SecretKeyFactory.getInstance(PBEWithHmacSHA256AndAES_256);

		SecretKey pbeKey = keyFac.generateSecret(pbeKeySpec);

		// Create PBE Cipher
		Cipher cipher = Cipher.getInstance("PBEWithHmacSHA256AndAES_256");

		// Initialize PBE Cipher with key and parameters
		cipher.init(Cipher.ENCRYPT_MODE, pbeKey, pbeParamSpec);

		// Our cleartext
		byte[] cleartext = text.getBytes(Charset.forName("utf8"));

		// Encrypt the cleartext
		byte[] ciphertext = cipher.doFinal(cleartext);

		{
			printerHex.accept("parameter", cipher.getParameters().getEncoded());


		}

		return ciphertext;
	}

	static byte[] decrypt(byte[] encrypted, char[] password, byte[] salt, /* Iteration count */int count)
			throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException,
			InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
		var pbeKeySpec = new PBEKeySpec(password);

		var iv = new IvParameterSpec("123456789abcdefg".getBytes());

		var pbeParamSpec = new PBEParameterSpec(salt, count, iv);

		SecretKeyFactory keyFac = SecretKeyFactory.getInstance(PBEWithHmacSHA256AndAES_256);

		SecretKey pbeKey = keyFac.generateSecret(pbeKeySpec);

		Cipher pbeCipher = Cipher.getInstance(PBEWithHmacSHA256AndAES_256);

		pbeCipher.init(Cipher.DECRYPT_MODE, pbeKey, pbeParamSpec);
		byte[] ciphertext = pbeCipher.doFinal(encrypted);

		return ciphertext;
	}
}
