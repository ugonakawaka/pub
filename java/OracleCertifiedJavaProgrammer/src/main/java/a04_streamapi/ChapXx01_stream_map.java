package a04_streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ChapXx01_stream_map {

	public static void main(String[] args) {
		a();
	}

	static void a() {
		Integer[] array = { 0, 1, 2, 3, 4, 5 };
		final var list = Arrays.asList(array);
		{
			var list2 = list.stream().map(i -> i * 2).collect(Collectors.toList());
			System.out.println(list2);
		}
		{
			var list2 = list.stream().map(i -> i * 2).map(i -> i + 1).collect(Collectors.toList());
			System.out.println(list2);
		}

		{ // 関数の合成 f○g

			Function<Integer, Integer> f = i -> i * 2;
			Function<Integer, Integer> g = i -> i + 1;
			{ // NG これはだめ
				var list2 = list.stream().map(f.compose(g)).collect(Collectors.toList());
				System.out.println(list2);
			}

			{ // OK
				var list2 = list.stream().map(g.compose(f)).collect(Collectors.toList());
				System.out.println(list2);
			}
		}
		{
			var list2 = list.stream().filter(i -> i > 0).map(i -> i * 2).collect(Collectors.toList());
			System.out.println(list2);
		}
		{
			var list2 = list.stream().filter(i -> i > 0).map(i -> i * 2).filter(i -> i > 5).collect(Collectors.toList());
			System.out.println(list2);
		}
	}
}
