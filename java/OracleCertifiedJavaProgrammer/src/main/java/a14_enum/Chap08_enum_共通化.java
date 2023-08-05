package a14_enum;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import a14_enum.Chap06_enum_reverse_逆引き3_共通化.CodeEnum;
import a14_enum.Chap06_enum_reverse_逆引き3_共通化.Num;

public class Chap08_enum_共通化 {

	public static void main(String[] args) {
		a();
	}

	static void a() {
		// Color.BLACK.

		// コード値がenum定数に定義されているか

		var bifunc = (BiConsumer<Boolean, Boolean>) (actual, expected) -> {
			System.out.printf("%s %s => %s%n", actual, expected, actual == expected ? "OK" : "");
		};

		bifunc.accept(Color.contains("kuro"), true);
		bifunc.accept(Color.contains(""), false);

	}

	// ==============

	// https://www.casleyconsulting.co.jp/blog/engineer/254/
	interface CodeEnum<E extends Enum<E>> { // ←これが再帰的ジェネリック

		@SuppressWarnings("unchecked") // これがでてくるのはしかたがない...
		default E toEnum() {
			return (E) this;
		}

		// このメソッドは、lombokで実装できるなー
		public String getCode();

		public static <E extends Enum<E>> Map<String, E> getMap(final Class<? extends CodeEnum<E>> enumClass) {

			return Stream.of(enumClass.getEnumConstants())
					.collect(Collectors.toMap(CodeEnum::getCode, CodeEnum::toEnum));
		}

	}

	static enum Color implements CodeEnum<Color> {
		RED("aka"), BLACK("kuro"), WHITE("SHIRO"), UNKNOWN("");

		final String code;

		Color(String code) {
			this.code = code;
		}

		@Override
		public String getCode() {
			return this.code;
		}

		// このコードは、CodeEnumしらないと書けないなー
		// public static final EnumSet<Enum<E>> fromCode =
		// Collections.unmodifiableMap(CodeEnum.getMap(Color.class));

		public static boolean contains(String code) {
			return EnumSet.allOf(Color.class).stream()
					.anyMatch(a -> !Color.UNKNOWN.code.equals(code) && a.code.equals(code));
		}
	}

}
