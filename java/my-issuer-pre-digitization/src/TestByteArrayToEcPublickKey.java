import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECGenParameterSpec;

public class TestByteArrayToEcPublickKey {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		a();
	}

	static void a() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {

		// keypar作ってそれからpuclickkeyをとりだす

		// キーペアを作成
		var keyPairGenerator = KeyPairGenerator.getInstance("EC");
		var ecGenParameterSpec = new ECGenParameterSpec("NIST P-256");
		keyPairGenerator.initialize(ecGenParameterSpec);
		KeyPair keyPair = keyPairGenerator.generateKeyPair();
		
		byte[] bs = keyPair.getPublic().getEncoded();
		System.out.println(bs.length);
	}
}
