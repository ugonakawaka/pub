package java17newclass;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HexFormat;

public class TestHexFormat {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		a();
	}

	static void a() throws NoSuchAlgorithmException {
		{ // // The hexadecimal digits are: "7f"
			HexFormat hex = HexFormat.of();
			byte b = 127;
			String byteStr = hex.toHexDigits(b);
			System.out.println(byteStr);
		}
		{// The formatted string is: "#00, #01, #02, #03, #7c, #7d, #7e, #7f"
			HexFormat commaFormat = HexFormat.ofDelimiter(", ").withPrefix("#");
			byte[] bytes = { 0, 1, 2, 3, 124, 125, 126, 127 };
			String str = commaFormat.formatHex(bytes);
			System.out.println(str);
			byte[] parsed = commaFormat.parseHex(str);
			assert (Arrays.equals(bytes, parsed));

		}
		{// The formatted string is: "00:01:02:03:7C:7D:7E:7F"
			HexFormat formatFingerprint = HexFormat.ofDelimiter(":").withUpperCase();
			byte[] bytes = { 0, 1, 2, 3, 124, 125, 126, 127 };
			String str = formatFingerprint.formatHex(bytes);
			System.out.println(str);
			byte[] parsed = formatFingerprint.parseHex(str);
			assert (Arrays.equals(bytes, parsed));
		}

		{ // message digest で使ってみる
			// c9e412958cc78aa3467390b3ed09f606d1362936600db50bcfe7db9b754e722a
			// c9e412958cc78aa3467390b3ed09f606d1362936600db50bcfe7db9b754e722a
			HexFormat hexFormat = HexFormat.of();

			byte[] bs = messagedigest("SHA-256", "テストだよ");

			System.out.println(hexFormat.formatHex(bs));

		}

	}

	static byte[] messagedigest(String algorithm, String s) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
		return messageDigest.digest(s.getBytes());
	}
}
