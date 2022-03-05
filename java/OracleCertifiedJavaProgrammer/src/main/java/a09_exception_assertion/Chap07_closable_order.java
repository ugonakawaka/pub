package a09_exception_assertion;

import java.io.Closeable;

/**
 * try-with-resourcesで内側のものから閉じていることがわかる
 * 
 * @see <a href=
 *      "https://github.com/katohideyuki/JavaGold/tree/main/Study/09/chapter_07">chapter_07</a>
 */
public class Chap07_closable_order {

	interface IAutoCloseable extends AutoCloseable {

		/**
		 * この書き方で、throws Exceptionがなくなってる... 
		 */
		@Override
		default public void close() {
			System.out.printf("%s →close %n", getClass().getName());
		}
	}

	interface ICloseable extends IAutoCloseable, Closeable {

		@Override
		default void close() {
			IAutoCloseable.super.close();
		}
	}

	static class A implements ICloseable {
	}

	static class B implements ICloseable {
		@Override
		public void close() {
			ICloseable.super.close();
			throw new RuntimeException();
		}
	}

	static class C implements ICloseable {
	}

	static class D implements AutoCloseable {

		@Override
		public void close() throws Exception {
			System.out.printf("%s →close %n", getClass().getName());
			throw new Exception();
		}
		
	}

	// ==========
	public static void main(String[] args) throws Exception {
		a();
	}

	static void a() throws Exception {
		D d = new D();
		try (d; var c = new C(); var b = new B(); var a = new A();) {

		}
	}
}
