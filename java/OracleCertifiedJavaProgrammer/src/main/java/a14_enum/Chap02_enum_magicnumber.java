package a14_enum;

import java.util.EnumSet;
import java.util.Objects;
import java.util.function.Consumer;

public class Chap02_enum_magicnumber {

	// enumにコード値をもたせることができるよ
	enum Num {

		// ↓にでてきている値はマジックNoなのか、疑惑
		ONE("01"), TWO("02"), THREE("03");

		// 文字列を使っているのがちょっと居心地が悪い
		final String code;

		Num(String code) {
			this.code = code;
		}

		// この定数に含まれれいるかのチェック
		// メソッド名がこれがいいか悩み中
		public static boolean contains(String code) {
			return EnumSet.allOf(Num.class).stream().anyMatch(n -> n.code.equals(code));
		}

	}

	// ===================================
	// ===================================
	// ===================================

	// 小道具
	interface EqString {
		public boolean eqS(String s);
	}

	// なので、↓みたいなものを用意してみた
	enum Num2DIGI implements EqString {
		S00, S01, S02, S03;

		@Override
		public boolean eqS(String s) {
			// valueOfでもとめることができるかで判定してみた
			// nameに規則性があるといことを前提にしている
			try {
				var object = Num2DIGI.valueOf("S" + s);
				return !Objects.isNull(object);
			} catch (Exception e) {
				// 変換できない場合、例外をもみ消している
			}
			return false;
		}
	}

	enum Num2 {

		// enumの定義を外のenumでおこなってるパターン
		ONE(Num2DIGI.S01), TWO(Num2DIGI.S02), THREE(Num2DIGI.S03);

		final Num2DIGI code;

		Num2(Num2DIGI code) {
			this.code = code;
		}

		// この定数に含まれれいるかのチェック
		// メソッド名がこれがいいか悩み中
		public static boolean contains(String scode) {
			return EnumSet.allOf(Num2.class).stream().anyMatch(n -> n.code.eqS(scode));
		}

	}

	public static void main(String[] args) {

		// このやり方だとeqメソッドを知らないとだめだけど..
		if (Num2.TWO.code.eqS("02")) {
			System.out.println(Num.TWO);
		}

		var c = (Consumer<String>) (s) -> {
			System.out.printf("%s %s %n", Num2.contains(s), s);
		};

		c.accept("001");
		c.accept("02");
		c.accept("03");
	}
}
