package a01_basic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;

public class ChapXx08_lambda {

	public static void main(String[] args) {
		a();
	}

	public static IntSupplier counter() {
		var count = new AtomicInteger();
		return () -> count.getAndIncrement();
	}

	public static Consumer<IntSupplier> message(String message) {
		return (t) -> {
			System.out.printf("%s %s%n", t.getAsInt(), message);
		};
	}

	public static <R> Function<IntSupplier, Function<IntSupplier, R>> message2(String message) {
		return (t) -> {
			System.out.printf("%s %s%n", t.getAsInt(), message);
			return (Function<IntSupplier, R>) message2(message);
		};

	}

	static void a() {
		var counter = counter();

		System.out.println(counter.getAsInt());
		System.out.println(counter.getAsInt());
		System.out.println(counter.getAsInt());

		var messageA = message("step aaaa");
		var messageB = message("step bbbb");
		var messageC = message("step cccc");

		messageA.andThen(messageB).andThen(messageC).andThen(messageA).accept(counter);
		message2("test a").apply(counter).apply(counter);
		var m = message2("test b");
		var mc = message2("test c");

		
	}
}
