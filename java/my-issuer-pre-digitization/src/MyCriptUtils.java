import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.KeyAgreement;

public class MyCriptUtils {

	@FunctionalInterface
	public interface TrySupplier<T, E1 extends Throwable, E2 extends Throwable, E3 extends Throwable> {
		T get() throws E1, E2, E3;
	}

	public static byte[] sharedKey(String algorithm, PublicKey publicKey, PrivateKey privateKey)
			throws NoSuchAlgorithmException, InvalidKeyException {

		var keyAgreement = KeyAgreement.getInstance(algorithm);
		keyAgreement.init(privateKey);
		keyAgreement.doPhase(publicKey, true);

		return keyAgreement.generateSecret();
	}

}
