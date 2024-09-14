import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public abstract class MyCriptUtils {

	@FunctionalInterface
	public interface TrySupplier<T, E1 extends Throwable, E2 extends Throwable, E3 extends Throwable> {
		T get() throws E1, E2, E3;
	}

	// ===================
	@FunctionalInterface
	public interface BiFunctionThtrows2<T, U, R, E1 extends Throwable, E2 extends Throwable> {
		R apply(T t, U u) throws E1, E2;
	}

	// ===================

	@FunctionalInterface
	public interface FunctionThtrows1<T, R, E1 extends Throwable> {
		R apply(T t) throws E1;
	}

	@FunctionalInterface
	public interface FunctionThtrows5<T, R, E1 extends Throwable, E2 extends Throwable, E3 extends Throwable, E4 extends Throwable, E5 extends Throwable> {
		R apply(T t) throws E1, E2, E3, E4, E5;
	}

	@FunctionalInterface
	public interface FunctionThtrows6<T, R, E1 extends Throwable, E2 extends Throwable, E3 extends Throwable, E4 extends Throwable, E5 extends Throwable, E6 extends Throwable> {
		R apply(T t) throws E1, E2, E3, E4, E5, E6;
	}

	public static byte[] sharedKey(String algorithm, PublicKey publicKey, PrivateKey privateKey)
			throws NoSuchAlgorithmException, InvalidKeyException {

		var keyAgreement = KeyAgreement.getInstance(algorithm);
		keyAgreement.init(privateKey);
		keyAgreement.doPhase(publicKey, true);

		return keyAgreement.generateSecret();
	}

	public static KeyPair generateKeyPair() throws NoSuchAlgorithmException {
		KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");
		generator.initialize(256);

		return generator.generateKeyPair();
	}

	public static byte[] encrypt(byte[] plaintext, SecretKey key)
			throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		final int GCM_IV_LENGTH = 12;
		final int GCM_TAG_LENGTH = 16;
		byte[] IV = new byte[GCM_IV_LENGTH];

		var cipher = Cipher.getInstance("AES/GCM/NoPadding");

		var gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, IV);

		cipher.init(Cipher.ENCRYPT_MODE, key, gcmParameterSpec);

		return cipher.doFinal(plaintext);
	}

}
