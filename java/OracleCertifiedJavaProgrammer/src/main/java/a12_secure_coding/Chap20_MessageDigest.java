package a12_secure_coding;

import java.io.FilePermission;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.AccessControlException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.util.Random;
import java.util.stream.IntStream;

import org.apache.commons.codec.digest.DigestUtils;

/*
 * https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/security/MessageDigest.html
 * https://docs.oracle.com/javase/jp/11/docs/specs/security/standard-names.html#messagedigest-algorithms
 * 
 * achage commons codecも使ってみる
 * https://commons.apache.org/proper/commons-codec/
 * https://github.com/apache/commons-codec
 * 
 */
public class Chap20_MessageDigest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		a();
	}

	static void a() throws NoSuchAlgorithmException {

		var text = "テストだよ";

		byte[] bs = digest("SHA-256", text);

		System.out.println(bs.length);// 32バイト
		System.out.println(new String(bs));
		System.out.println(sdigest0(bs));
		System.out.println(sdigest1(bs));
		System.out.println(sdigest2(bs));
		System.out.println(sdigest3(bs));

		// ↓そうていしていたものと違う...
		System.out.println(commons_sha256Hex(bs));

		// System.out.println(sdigest0(bs).length());
	}

	static String commons_sha256Hex(byte[] bs) {
		return DigestUtils.sha256Hex(bs);
	}

	static byte[] digest(String algorithm, String text) throws NoSuchAlgorithmException {
		var messageDigest = MessageDigest.getInstance(algorithm);
		return messageDigest.digest(text.getBytes());
	}

	static String sdigest0(byte[] bs) {
		// 参考)むちゃくちゃ古い記事から
		// https://atmarkit.itmedia.co.jp/bbs/phpBB/viewtopic.php?topic=19942&forum=12
		var builder = new StringBuilder();
		for (int i = 0; i < bs.length; i++) {
			int val = bs[i] & 0xFF;
			if (val < 16) {
				builder.append("0");
			}
			builder.append(Integer.toString(val, 16));
		}
		return builder.toString();
	}

	static String sdigest1(byte[] bs) {
		// 参考)むちゃくちゃ古い記事から
		// https://atmarkit.itmedia.co.jp/bbs/phpBB/viewtopic.php?topic=19942&forum=12
		var builder = new StringBuilder();
		for (int i = 0; i < bs.length; i++) {

			builder.append(Integer.toString((0xF0 & bs[i]) >> 4, 16));
			builder.append(Integer.toString((0xF & bs[i]), 16));
		}

		return builder.toString();
	}

	static String sdigest2(byte[] bs) {
		return String.format("%02x", new BigInteger(1, bs));
	}

	static String sdigest3(byte[] bs) {
		final byte[] LOWERCASE_DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
				'f', };
		var builder = new StringBuilder();
		for (int i = 0; i < bs.length; i++) {
			// 考え方メモ
			// byteビットは、aaaabbbb という感じ
			// aは、ここでいうhighのイメージ
			// bは、ここでいうlowのイメージ
			// HIGH
			// 1) 4シフトで、aaaabbbb→0000aaaaになる
			// 2) 論理積で0xfでマスクする 0xfは、ビットにすると00001111となって、aaaaだけが残る
			// 3) 残ったaaaaを１６進数表記に置き換える
			// LOW
			// 1) 論理積で0xfでマスクする 0xfは、ビットにすると00001111となって、bbbbだけが残る
			// 2) bbbbを１６進数表記に置き換える
			// 結果文字列として、HIGHTビットの16進数表記とLOWビットの16進数表記の結合した文字列を得る
			builder.append((char) LOWERCASE_DIGITS[(bs[i] >> 4) & 0xf]); // high
			builder.append((char) LOWERCASE_DIGITS[bs[i] & 0xf]); // low
		}
		return builder.toString();
	}

//	static String varchar(int size) {
//		var builder = new StringBuilder();
//		// 32
//		// 127
//
//	}

}
