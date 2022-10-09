package a01_basic;

import java.util.Arrays;
import java.util.function.BiFunction;
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
