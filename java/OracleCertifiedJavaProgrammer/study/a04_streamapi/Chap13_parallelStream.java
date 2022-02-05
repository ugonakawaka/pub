package a04;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Chap13_parallelStream {

	public static void main(String[] args) {
		final List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		{
			list.forEach(System.out::print);
			System.out.println();
			list.parallelStream().forEach(System.out::print);
			System.out.println();
		}
		{ // 実行しているthreadがわかるよ
			System.out.println("=========");
			list.forEach(a -> {
				System.out.printf("%s%n", Thread.currentThread().getName());
			});
			list.parallelStream().forEach(a -> {
				System.out.printf("%s%n", Thread.currentThread().getName());
			});
			System.out.println();
		}

	}

}
