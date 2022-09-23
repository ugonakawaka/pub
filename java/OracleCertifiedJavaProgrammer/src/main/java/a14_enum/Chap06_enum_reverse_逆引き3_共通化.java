package a14_enum;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import a14_enum.Chap04_enum_reverse_逆引き.Num;

// 逆引き用のメソッドを追加してみよう
// 今度は、逆引きの仕組みの共通化2
// 参考)https://www.casleyconsulting.co.jp/blog/engineer/254/
public class Chap06_enum_reverse_逆引き3_共通化 {

	// これは頭の体操になるはず
	// 再帰的ジェネリクス
	// https://nagise.hatenablog.jp/entry/20101101/1288629634
	interface CodeEnum<E extends Enum<E>> { // ←これが再帰的ジェネリック

		@SuppressWarnings("unchecked") // これがでてくるのはしかたがない...
		default E toEnum() {
			return (E) this;
		}

		public String getCode();

		public static <E extends Enum<E>> Map<String, E> getMap(final Class<? extends CodeEnum<E>> enumClass) {

//Arrays.stream(enumClass.getEnumConstants()).collect(Collectors.toMap(CodeEnum::getCode, CodeEnum::toEnum));
			return Stream.of(enumClass.getEnumConstants())
					.collect(Collectors.toMap(CodeEnum::getCode, CodeEnum::toEnum));
		}

	}

	enum Num implements CodeEnum<Num> { // Num
		UNKNOWN(null, null), ONE("ichi", "01"), TWO("ni", "02"), THREE("san", "03");

		final String num1;
		final String code;

		Num(String num1, String code) {
			this.num1 = num1;
			this.code = code;
		}

		public String getCode() {
			return this.code;
		}

		// このコードは、CodeEnumしらないと書けないなー
		public static final Map<String, Num> fromCode = Collections.unmodifiableMap(CodeEnum.getMap(Num.class));

	}

	public static void main(String[] args) {
		// 定数

		if (Num.TWO.code.equals("02")) {
			System.out.println(Num.TWO);
		}

		{ // fromxxx を使う
			var c = (Consumer<String>) (s) -> {
				System.out.printf("%s %s %n", Num.fromCode.get(s), s);
			};

			c.accept("001"); // nullなのが落ち着かないなー
			c.accept("02");
			c.accept("03");
			c.accept("01");
			c.accept(null); // nullを指定するとUKNOWNにヒットするので、それがいやならちょっと工夫する必要がある
		}
		System.out.println("=========");

	}
}
