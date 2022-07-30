package a01_basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/*
 * 理解しておぼえていないところ...
 */
public class ChapXx09_integer_toHex {

	public static void main(String[] args) {
		a();
	}

	static void print(String s, Runnable runnable) {

		System.out.println("=========");
		System.out.println(s);
		runnable.run();
		// System.out.println("");
		System.out.println("=========");
	}

	static void a() {

		print("Integerは何バイト?", () -> {
			System.out.println(Integer.BYTES);
		});

		print("たってるビットの数", () -> {
			Integer[] is = { 0, Integer.MAX_VALUE, Integer.MIN_VALUE, -1 };
			Arrays.asList(is).stream().map(Integer::bitCount).forEach(System.out::println);
		});
		print("たってるビットを可視化", () -> {

			Integer[] is = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 32, 64, 128, 256, 512, 1024, Integer.MAX_VALUE,
					Integer.MIN_VALUE, -1, -2 };
			Arrays.asList(is).stream().map(Integer::toBinaryString).forEach(System.out::println);
		});
		print("ビットをシフトして、可視化", () -> {
			Integer[] is = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 32, 64, 128, 256, 512, 1024, Integer.MAX_VALUE,
					Integer.MIN_VALUE, -1, -2 };
			Arrays.asList(is).stream(). <Integer>map(i -> {
				return i >> 4;
			}).map(Integer::toBinaryString).forEach(System.out::println);
			

		});

		
//		print("0xfでマスク 論理積、可視化", () -> {
//			Integer[] is = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 32, 64, 128, 256, 512, 1024, Integer.MAX_VALUE,
//					Integer.MIN_VALUE, -1, -2 };
//
//			Arrays.asList(is).stream().<Integer>map(i -> {
//				return i & 0xf;
//			}).map(Integer::toBinaryString).forEach((System.out::println));
//		});

		{

			System.out.println(0xf);
			System.out.println(0xf0);
			System.out.println(0x0f);
			System.out.println(Integer.toBinaryString(0xf));
			System.out.println(Integer.toBinaryString(0xf0));
			System.out.println(Integer.toBinaryString(0x0f));
			System.out.println(Integer.toBinaryString(0xff));
			System.out.println(Integer.toBinaryString((byte)256 & 0xf));
			System.out.println(Integer.toBinaryString((byte)127 & 0xf));
			System.out.println(Integer.toBinaryString((byte)-127 & 0xf));
		}

		{ // 論理積について

		}
		{ // 論理和について

		}
		{
			// バイナリデータを可読可能な文字列表現にする
		}
	}

	static <T, R> Consumer<T> applyAndAccept(Function<? super T, ? extends R> f, Consumer<R> c) {
		return t -> c.accept(f.apply(t));
	}

	public static <A> Consumer<A> compose(Consumer<A> f1, Consumer<A> f2) {
		return f1.andThen(f2);
	}

	public static <A, B, C> Function<A, C> compose(Function<A, B> f1, Function<B, C> f2) {
		return f1.andThen(f2);
	}

	// https://stackoverflow.com/questions/32646249/composing-a-java-function-and-consumer
}
