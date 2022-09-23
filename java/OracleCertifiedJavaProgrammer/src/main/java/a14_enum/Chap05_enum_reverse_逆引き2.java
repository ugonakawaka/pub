package a14_enum;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 逆引き用のメソッドを追加してみよう
// 今度は、逆引きの仕組みの共通化
// 
public class Chap05_enum_reverse_逆引き2 {

	/*
	 * 参考) https://gist.github.com/gakuzzzz/cdade54766c245bb13fb3f4bb874b6e4
	 */
	public static class EnumReverseLookup<E extends Enum<E>, ATTR> {
		private final Class<E> enumClass;
		private final Function<E, ATTR> getter;

		public EnumReverseLookup(final Class<E> enumClass, final Function<E, ATTR> getter) {
			this.enumClass = enumClass;
			this.getter = getter;
		}

		public E lookup(ATTR attribute) {

			// ここの部分は改造
			// nullpointerでないように
			// orElseで例外をださないようにした
			return Arrays.stream(enumClass.getEnumConstants()).filter(e -> getter.apply(e) == (attribute)).findFirst()
					.orElse(null);
		}
	}

	static class Utils {

		// なんとなくユーティリティメソッドでつくるパターンを用意してみた。
		public static <E extends Enum<E>, ATTR> EnumReverseLookup<E, ATTR> create(final Class<E> enumClass,
				final Function<E, ATTR> getter) {
			return new EnumReverseLookup<>(enumClass, getter);

		}
	}

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

		public String getCode() {
			return this.code;
		}

		//
		public static final EnumReverseLookup<Num, String> fromCode = new EnumReverseLookup<>(Num.class, Num::getCode);
		public static final EnumReverseLookup<Num, String> fromCode2 = Utils.create(Num.class, Num::getCode);
	}

	public static void main(String[] args) {
		// 定数

		if (Num.TWO.code.equals("02")) {
			System.out.println(Num.TWO);
		}
		{ // fromxxx を使う
			var c = (Consumer<String>) (s) -> {
				System.out.printf("%s %s %n", Num.fromCode.lookup(s), s);
			};

			c.accept("001");
			c.accept("02");
			c.accept("03");
			c.accept("01");
			c.accept(null); // nullを指定するとUKNOWNにヒットするので、それがいやならちょっと工夫する必要がある
		}
		System.out.println("=========");
		{ // fromxxx を使う
			var c = (Consumer<String>) (s) -> {
				System.out.printf("%s %s %n", Num.fromCode2.lookup(s), s);
			};

			c.accept("001");
			c.accept("02");
			c.accept("03");
			c.accept("01");
			c.accept(null); // nullを指定するとUKNOWNにヒットするので、それがいやならちょっと工夫する必要がある
		}
	}
}
