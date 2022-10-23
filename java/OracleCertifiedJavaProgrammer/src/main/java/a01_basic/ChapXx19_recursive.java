package a01_basic;

import java.util.function.Function;

public class ChapXx19_recursive {

	public static void main(String[] args) {
		a();
	}

	static void a() {

		{
			var o = new Object() {
				public int fib(int n) {
					return n <= 1 ? 1 : fib(n - 1) + fib(n - 2);
				}
			};

			Function<Integer, Integer> fib = o::fib;
			System.out.println(fib.apply(10));

		}

		{
			Function<Integer, Integer> fib = new Object() {
				public int fib(int n) {
					return n <= 1 ? 1 : fib(n - 1) + fib(n - 2);
				}
			}::fib;
			
			System.out.println(fib.apply(10));

		}

	}
}
