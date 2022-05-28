package a01_basic;

import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

// 参考
// https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
public class ChapXx07_method_reference {

	// https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
	public static class MethodReferencesExamples {

		public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
			return merger.apply(a, b);
		}

		public static String appendStrings(String a, String b) {
			return a + b;
		}

		public String appendStrings2(String a, String b) {
			return a + b;
		}

	}

	// https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
	public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(
			SOURCE sourceCollection, Supplier<DEST> collectionFactory) {

		DEST result = collectionFactory.get();
		for (T t : sourceCollection) {
			result.add(t);
		}
		return result;
	}

	public static void main(String[] args) {
		a();
	}

	static void a() {

		// メソッド参照で、コードをシンプルにできる！はず！

		// http://www.ne.jp/asahi/hishidama/home/tech/java/methodreference.html#h_method_reference
		// メソッド参照を変数に代入することができる
		Consumer<String> println = System.out::println;
		{
			// 呼び出すときは、メソッドを使わなければいけない
			// println("aaa") ←このような呼び出しはできない...これができたら、いいなーと思うけど、どうなんだろう
			println.accept("ok!");
		}
		{

			MethodReferencesExamples myApp = new MethodReferencesExamples();

			// Calling the method mergeThings with a lambda expression
			println.accept(MethodReferencesExamples.mergeThings("Hello ", "World!", (a, b) -> a + b));

			// Reference to a static method
			println.accept(
					MethodReferencesExamples.mergeThings("Hello ", "World!", MethodReferencesExamples::appendStrings));

			// Reference to an instance method of a particular object
			println.accept(MethodReferencesExamples.mergeThings("Hello ", "World!", myApp::appendStrings2));

			// Reference to an instance method of an arbitrary object of a
			// particular type
			println.accept(MethodReferencesExamples.mergeThings("Hello ", "World!", String::concat));
		}

		{
			var printter = printer(println);
			printter.println("okok");
			
		
			
		}
	}

	@FunctionalInterface
	interface MyFunc<T> {
		void println(T a);
	}

	static <T> MyFunc<T> printer(Consumer<T> consumer) {

		return (t) -> {
			consumer.accept(t);
		};
	}
}
