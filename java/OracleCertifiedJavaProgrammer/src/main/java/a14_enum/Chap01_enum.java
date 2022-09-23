package a14_enum;

import java.util.EnumSet;
import java.util.function.Consumer;

public class Chap01_enum {

	// enumにコード値をもたせることができるよ
	enum Num {
		ONE("ichi", "01"), TWO("ni", "02"), THREE("san", "03");

		// 文字列を使っているのがちょっと居心地が悪い
		final String num1;
		final String code;

		Num(String num1, String code) {
			this.num1 = num1;
			this.code = code;
		}

		// この定数に含まれれいるかのチェック
		// メソッド名がこれがいいか悩み中
		public static boolean contains(String code) {
			return EnumSet.allOf(Num.class).stream().anyMatch(n -> n.code.equals(code));
		}
		
		
	}

	public static void main(String[] args) {
		// 定数

		if (Num.TWO.code.equals("02")) {
			System.out.println(Num.TWO);
		}

		var c = (Consumer<String>) (s) -> {
			System.out.printf("%s %s %n", Num.contains(s), s);
		};

		c.accept("001");
		c.accept("02");
		c.accept("03");
	}
}
