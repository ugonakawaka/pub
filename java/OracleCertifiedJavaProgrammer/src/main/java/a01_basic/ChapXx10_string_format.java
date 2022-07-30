package a01_basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

/*
 * 理解しておぼえていないところ...
 */
public class ChapXx10_string_format {

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

		BiFunction<String, Integer, String> f = (s, i) -> {
			return String.format(s, i);
		};

		{ // 16進数
//			IntStream.range(0, Integer.MAX_VALUE).forEach(i->{
//				System.out.println(f.apply("%02x", i));
//				
//			});
			System.out.println(f.apply("%02x", Integer.MAX_VALUE));
			System.out.println(f.apply("%02x", -1));
			System.out.println(f.apply("%020x", -1));

			// int 32bit 4byteを表現
			{
				System.out.println("=========");
				System.out.println(f.apply("%x", 0));
				System.out.println(f.apply("%x", Integer.MAX_VALUE));
				System.out.println(f.apply("%x", Integer.MIN_VALUE));
				System.out.println(f.apply("%x", -1));
			}
			{
				System.out.println("========= " + Integer.BYTES);
				System.out.println(f.apply("%04x", 0));
				System.out.println(f.apply("%04x", 1));
				System.out.println(f.apply("%04x", Integer.MAX_VALUE));
				System.out.println(f.apply("%04x", Integer.MIN_VALUE));
				System.out.println(f.apply("%04x", -1));
			}
			{
				System.out.println("========= " + Integer.BYTES);
				System.out.println(f.apply("%08x", 0));
				System.out.println(f.apply("%08x", 1));
				System.out.println(f.apply("%08x", Integer.MAX_VALUE));
				System.out.println(f.apply("%08x", Integer.MIN_VALUE));
				System.out.println(f.apply("%08x", -1));
			}
			{
				System.out.println("========= " + Integer.BYTES);
				System.out.printf("%s%n", Integer.toHexString(0));
				System.out.printf("%s%n", Integer.toHexString(1));
				System.out.printf("%s%n", Integer.toHexString(Integer.MAX_VALUE));
				System.out.printf("%s%n", Integer.toHexString(Integer.MIN_VALUE));
				System.out.printf("%s%n", Integer.toHexString(-1));

			}
			// ========

		}

	}
//	private static <T, R> Consumer<T> applyAndAccept(BiFunction<String, Integer, String> f, Consumer<R> c) {
//		return (t1,t2) -> c.accept(f.apply(t1, t2));
//		
//	}

	static <T, R> Consumer<T> applyAndAccept(Function<? super T, ? extends R> f, Consumer<R> c) {
		return t -> c.accept(f.apply(t));
	}
}
