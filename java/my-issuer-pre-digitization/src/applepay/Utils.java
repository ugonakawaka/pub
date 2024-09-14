package applepay;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.KeyAgreement;

public class Utils {

	public static class Consts {
		public static final String ALOGRITHM_EC = "EC";
		public static final int KEYSIZE_256 = 256;
	}

	
	public static KeyPair ephemeralKeyPair() throws NoSuchAlgorithmException {
		return generateECDHKeyPair();
	}
	
	public static KeyPair generateECDHKeyPair() throws NoSuchAlgorithmException {

		KeyPairGenerator kpg = KeyPairGenerator.getInstance(Consts.ALOGRITHM_EC);
		kpg.initialize(Consts.KEYSIZE_256);

		return kpg.generateKeyPair();

	}

	public static byte[] sharedKey(String algorithm, PublicKey publicKey, PrivateKey privateKey)
			throws NoSuchAlgorithmException, InvalidKeyException {

		var keyAgreement = KeyAgreement.getInstance(algorithm);
		keyAgreement.init(privateKey);
		keyAgreement.doPhase(publicKey, true);

		return keyAgreement.generateSecret();
	}

}
