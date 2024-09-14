package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class TestKeystore {

	public static void main(String[] args) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
		a();
	}

	
	static void a() throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
		
		Path file = Path.of("clientA.p12");
		
		System.out.println(file.toFile().exists());
		
		KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
		
		ks.load(Files.newInputStream(file, StandardOpenOption.READ), new char[] {});
	}
}
