import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.GeneralSecurityException;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCertificateChain {

	public static void main(String[] args) throws IOException, GeneralSecurityException {
		a();
		// b();
	}

	static void b() throws IOException, GeneralSecurityException {
		// https://www.apple.com/certificateauthority/
		var p0 = Path.of("apple-pki/root.crl"); //
		var p1 = Path.of("apple-pki/AppleRootCA-G3.cer"); // root
		var p2 = Path.of("apple-pki/AppleAAICAG3.cer"); // 中間
		{
			List<CRL> crls = CRLs(p0);
			crls.forEach(System.out::println);
		}

		List<X509Certificate> x509Certificates = Arrays.asList(x509(p2), x509(p1));
		for (int i = 0; i < x509Certificates.size() - 1; i++) {
			var result = validatePath(x509Certificates.get(i + 1), x509Certificates.get(i));
			System.out.println(result);
		}
	}

	static void a() throws IOException, GeneralSecurityException {
		var p1 = Path.of("oreore-ssl/cacert.der"); // root
		var p2 = Path.of("oreore-ssl/subcert.der"); // 中間
		var p3 = Path.of("oreore-ssl/leafcert.der"); // リーフ

		System.out.println(x509(p3));
		System.out.println("===========");
		List<X509Certificate> x509Certificates = Arrays.asList(x509(p3), x509(p2), x509(p1));

		{
			x509Certificates.stream().forEach(c -> {
				// System.out.println(c);
			});

		}

		{
			for (int i = 0; i < x509Certificates.size() - 1; i++) {
				var result = validatePath(x509Certificates.get(i + 1), x509Certificates.get(i));
				System.out.println(result);
			}

		}
		if (false) {

			List<TrustAnchor> trustAnchors = x509Certificates.stream().map(x -> new TrustAnchor(x, null)).toList();

			// validatePath(x509Certificates, new HashSet<TrustAnchor>(trustAnchors));
			validatePath(x509Certificates, new HashSet<TrustAnchor>(Arrays.asList(new TrustAnchor(x509(p2), null))));
		}
	}

	public static PKIXCertPathValidatorResult validatePath(Set<TrustAnchor> trustAnchors,
			List<X509Certificate> certificates) throws GeneralSecurityException {
		var certPathValidator = CertPathValidator.getInstance("PKIX");

		var params = new PKIXParameters(trustAnchors);
		params.setRevocationEnabled(false);

		var certificateFactory = CertificateFactory.getInstance("X509");

		var path = certificateFactory.generateCertPath(certificates);

		return (PKIXCertPathValidatorResult) certPathValidator.validate(path, params);
	}

	public static PKIXCertPathValidatorResult validatePath(X509Certificate high, X509Certificate low)
			throws GeneralSecurityException {
		var certPathValidator = CertPathValidator.getInstance("PKIX");

		var params = new PKIXParameters(new HashSet<>(Arrays.asList(new TrustAnchor(high, null))));
		params.setRevocationEnabled(false);

		var certificateFactory = CertificateFactory.getInstance("X509");

		var path = certificateFactory.generateCertPath(Arrays.asList(low));

		return (PKIXCertPathValidatorResult) certPathValidator.validate(path, params);
	}

	public static PKIXCertPathValidatorResult validatePath(List<X509Certificate> certs, Set<TrustAnchor> trustAnchors)
			throws GeneralSecurityException {
		CertPathValidator cpv = CertPathValidator.getInstance("PKIX");
		PKIXParameters params = new PKIXParameters(trustAnchors);
		params.setRevocationEnabled(false);

		CertificateFactory cf = CertificateFactory.getInstance("X509");
		CertPath path = cf.generateCertPath(certs);

		return (PKIXCertPathValidatorResult) cpv.validate(path, params);
	}

	public static X509Certificate x509(Path path) throws IOException, CertificateException {
		var certFactory = CertificateFactory.getInstance("X.509");
		try (InputStream in = Files.newInputStream(path)) {
			return (X509Certificate) certFactory.generateCertificate(in);
		}
	}

	public static List<CRL> CRLs(Path path) throws IOException, CertificateException, CRLException {
		var certFactory = CertificateFactory.getInstance("X.509");
		try (InputStream in = Files.newInputStream(path)) {

			Collection<CRL> collection = (Collection<CRL>) certFactory.generateCRLs(in);
			return new ArrayList<CRL>(collection);
		}
	}
}
