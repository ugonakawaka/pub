package a04_streamapi;

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
import java.util.stream.Collector.Characteristics;
import java.util.stream.Stream;

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
			// return EnumSet.of(Characteristics.CONCURRENT);
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
		{ // ng
			var builder = new StringBuilder();
			list.parallelStream().forEach(x -> {
				if (builder.length() != 0) {
					builder.append(",");
				}
				builder.append(x);
			});
			System.out.println(builder); // unordered
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
		{ // test BinaryOperator
			var result = new ArrayList<>(list).parallelStream().unordered().collect(new Joinner());
			System.out.println(result); // A,B,C,D,E
		}
		{
			Supplier<StringBuilder> supplier = StringBuilder::new;
			BiConsumer<StringBuilder, String> accumulator = (a, b) -> {
				a.append(b).append(",");
			};
			BinaryOperator<StringBuilder> combiner = (a, b) -> a.append(b);
			Function<StringBuilder, String> finisher = (a) -> {
				if (0 == a.length())
					return "";
				return a.substring(0, a.length() - 1);
			};

			Collector<String, StringBuilder, String> joinner = Collector.of(supplier, accumulator, combiner, finisher);
			var result = list.stream().collect(joinner);
			System.out.println(result); // A,B,C,D,E
		}
		{
			
			
		}

	}

}
