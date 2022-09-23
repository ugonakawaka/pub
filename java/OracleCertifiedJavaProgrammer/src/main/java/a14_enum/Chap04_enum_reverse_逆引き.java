package a14_enum;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 逆引き用のメソッドを追加してみよう
// 参考) https://zenn.dev/nslender/articles/d1936e0c4f8fd9
public class Chap04_enum_reverse_逆引き {

	// 逆引き用の。fromXxxメソッドを追加してみる
	// 逆引きできない場合は、UNKNOWNを返すというルールにする
	// コード値が重複していないということが前提になる
	enum Num {
		UNKNOWN(null, null), ONE("ichi", "01"), TWO("ni", "02"), THREE("san", "03");

		// 文字列を使っているのがちょっと居心地が悪い
		final String num1;
		final String code;

		Num(String num1, String code) {
			this.num1 = num1;
			this.code = code;
		}

		// fromXxxメソッドを追加(生やす?)方法
		public static Num fromCode(String code) {
			// 都度検索するやりかた
			return EnumSet.allOf(Num.class).stream().filter(n -> n.code == code).findFirst().orElse(UNKNOWN);
		}

		// mapで逆引き用をもたせる方法(同じコード値の場合はさあどうする？)
		// 値がみつからない場合、nullが帰ってします。 ここ気になるなー
		// 変更不可にするのを忘れずに、下記のコードが実行できる...
		// Num.fromCode.clear();
		public static final Map<String, Num> fromCode = Collections
				.unmodifiableMap(Stream.of(Num.values()).collect(Collectors.toMap(n -> n.code, n -> n)));

	}

	public static void main(String[] args) {
		// 定数

		if (Num.TWO.code.equals("02")) {
			System.out.println(Num.TWO);
		}
		{ // fromxxx を使う
			var c = (Consumer<String>) (s) -> {
				System.out.printf("%s %s %n", Num.fromCode(s), s);
			};

			c.accept("001");
			c.accept("02");
			c.accept("03");
			c.accept("01");
			c.accept(null); // nullを指定するとUKNOWNにヒットするので、それがいやならちょっと工夫する必要がある
		}
		System.out.println("=========");
		{ // 変換用のマップをもたせたパターン
			var c = (Consumer<String>) (s) -> {
				System.out.printf("%s %s %n", Num.fromCode.get(s), s);
			};

			c.accept("001");
			c.accept("02");
			c.accept("03");
			c.accept("01");
			c.accept(null); // nullを指定するとUKNOWNにヒットするので、それがいやならちょっと工夫する必要がある

			// ↓が実行できないようにしておくこと
			// Num.fromCode.clear();
		}
	}
}
