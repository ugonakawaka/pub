package switchexpr;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class ChapXx07_method_reference3 {

	public static void main(String[] args) {
		a();
	}

	@FunctionalInterface
	interface F3<T1, T2, T3, R> {
		public R apply(T1 t1, T2 t2, T3 t3);
	}

	//
	static void a() {

		Object[] arr = { (Function<String, String>) Utils::a, (BiFunction<String, String, String>) Utils::a,
				(F3<String, String, String, String>) Utils::a

		};

		Consumer<Object> consumer = (o) -> {

			String s2 = switch (o) {
	
			case Integer i -> String.format("int %d", i);
			case Long l -> String.format("long %d", l);
			case Double d -> String.format("double %f", d);
			case String s -> String.format("String %s", s);
			default ->  o.toString();
			}
			;
			System.out.println(s2);
		};

		Arrays.asList(arr).stream().forEach(consumer);

	}

	static class Utils {

		static String a() {

			return "";
		}

		static String a(String a) {

			return a;
		}

		static String a(String a, String b) {

			return a + b;
		}

		static String a(String a, String b, String c) {

			return a + b + c;
		}
	}

}
