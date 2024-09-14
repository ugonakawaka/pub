import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.util.HexFormat;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import at.favre.lib.crypto.SingleStepKdf;

import static org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME;

public class TestKDF {

	public static void main(String[] args)
			throws NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, IOException,
			NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {

		a();

	}

	static void a() throws InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException, IOException,
			NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {

		// ２つのOSSで結果が同じになるよーということをためしたい

		// KeyPair1
		var keyPair1 = MyCriptUtils.generateKeyPair();
		var keyPair2 = MyCriptUtils.generateKeyPair();

		var sharedKey = MyCriptUtils.sharedKey("ECDH", keyPair1.getPublic(), keyPair2.getPrivate());
		
		

		
		
		byte[] bs1 = Aaa.performKDF(sharedKey, "o_o!".getBytes());
		byte[] bs2 = Bbb.performKDF(sharedKey, "o_o!".getBytes());

		var hexFormat = HexFormat.of().withUpperCase();

		var printer = (Consumer<byte[]>) (bs) -> {
			System.out.println(hexFormat.formatHex(bs));
		};
		var encyrpter = (MyCriptUtils.FunctionThtrows6<byte[], byte[], NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException>) (
				bs) -> {
			var secretKey = new SecretKeySpec(bs, "AES");
			byte[] encrypted = MyCriptUtils.encrypt("ok!".getBytes(), secretKey);
			return encrypted;
		};

		// System.out.println(hexFormat.formatHex(encrypted2));

	}

	// https://stackoverflow.com/questions/58020641/apple-pay-payment-token-decryption-in-java
	static class Aaa {

		static {
			Security.addProvider(new BouncyCastleProvider());
		}

		private static final byte[] APPLE_OEM = "Apple".getBytes(Charset.forName("US-ASCII"));
		private static final byte[] COUNTER = { 0x00, 0x00, 0x00, 0x01 };
		private static final byte[] ALG_IDENTIFIER_BYTES = "id-aes256-GCM".getBytes(Charset.forName("US-ASCII"));

		/**
		 * 00000001_16 || sharedSecret || length("AES/GCM/NoPadding") ||
		 * "AES/GCM/NoPadding" || "Apple" || merchantID
		 * 
		 * @throws IOException
		 * @throws NoSuchProviderException
		 * @throws NoSuchAlgorithmException
		 */
		private static byte[] performKDF(byte[] sharedSecret, byte[] merchantId)
				throws IOException, NoSuchAlgorithmException, NoSuchProviderException {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			baos.write(COUNTER);
			baos.write(sharedSecret);
			baos.write(ALG_IDENTIFIER_BYTES.length);
			baos.write(ALG_IDENTIFIER_BYTES);
			baos.write(APPLE_OEM);
			baos.write(merchantId);
			MessageDigest messageDigest = MessageDigest.getInstance("SHA256", PROVIDER_NAME);
			return messageDigest.digest(baos.toByteArray());
		}
	}

	static class Bbb {

		private static byte[] performKDF(byte[] sharedSecret, byte[] merchantId) throws IOException {
			var baos = new ByteArrayOutputStream();
//			baos.write(COUNTER);
//			baos.write(sharedSecret);
			final byte[] ALG_IDENTIFIER_BYTES = "id-aes256-GCM".getBytes();

			baos.write(ALG_IDENTIFIER_BYTES.length);
			baos.write(ALG_IDENTIFIER_BYTES);
			baos.write("Apple".getBytes());
			baos.write(merchantId);
			baos.flush();
			var fixedInfo = baos.toByteArray();

			byte[] keyMaterial = SingleStepKdf.fromSha256().derive(sharedSecret, 32, fixedInfo);
			return keyMaterial;
		}
	}
}
