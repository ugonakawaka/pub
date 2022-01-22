package a04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Chap22_Collector {

	public static class Joinner implements Collector<String, StringBuilder, String> {

		@Override
		public Supplier<StringBuilder> supplier() {
			return StringBuilder::new;
		}

		@Override
		public BiConsumer<StringBuilder, String> accumulator() {
			return (sb, b) -> {
				sb.append(b).append(",");
			};
		}

		@Override
		public BinaryOperator<StringBuilder> combiner() {
			return (a, b) -> a.append(b);
		}

		@Override
		public Function<StringBuilder, String> finisher() {
			return (sb) -> {
				if (0 == sb.length())
					return "";
				return sb.substring(0, sb.length() - 1);
			};
		}

		@Override
		public Set<Characteristics> characteristics() {
			return Collections.emptySet();
			// return EnumSet.of(Characteristics.UNORDERED);
			// return EnumSet.of(Characteristics.IDENTITY_FINISH,
			// Characteristics.UNORDERED);
		}

	}

	static final List<String> list = Arrays.asList("A", "B", "C", "D", "E");

	static void sleep() {
		// Zzzz...
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// do nothing
		}
	}

	public static void main(String[] args) {

		{
			var builder = new StringBuilder();
			list.stream().forEach(x -> {
				if (builder.length() != 0) {
					builder.append(",");
				}
				builder.append(x);
			});
			System.out.println(builder); // A,B,C,D,E
		}
		{ // empty list
			var result = new ArrayList<String>().stream().collect(new Joinner());

			System.out.println(result); // empty
		}
		{ // test BiConsumer
			var result = list.stream().collect(new Joinner());
			System.out.println(result); // A,B,C,D,E
		}
		{ // test BinaryOperator
			var result = list.stream().parallel().collect(new Joinner());
			System.out.println(result); // A,B,C,D,E
		}

	}

}
