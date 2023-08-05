package a04_streamapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ChapXx02_collector {

	public static void main(String[] args) {
		a();
		b();
	}

	public static class Item {
		String a;
		String b;
		String c;

		public Item(String a, String b, String c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		public String toString() {
			return String.format("{%s, %s, %s}", this.a, this.b, this.c);
		}
	}

	static void a() {

		//
		var list = IntStream.range(0, 3).<Item>mapToObj(i -> {
			return new Item("a" + i, "b" + i, "c" + i);
		}).collect(Collectors.toList());

		{ // こっち書き方が好きかもしれない
			list = Stream.iterate(0, i -> i + 1).limit(3).map(i -> {
				return new Item("a" + i, "b" + i, "c" + i);
			}).collect(Collectors.toList());
		}

		System.out.println(list);
		System.out.println("============");

		{ // map
			var listofa = list.stream().map(item -> item.a).collect(Collectors.toList());
			System.out.println(listofa);
		}
		{// flatmap
			var lst = list.stream().flatMap(item -> Stream.of(item.a)).collect(Collectors.toList());
			System.out.println(lst);
		}
		{// flatmap
			var lst = list.stream().flatMap(item -> Stream.of(new String[] { item.a, item.b }))
					.collect(Collectors.toList());
			System.out.println(lst);
		}
		{// flatmap
			var lst = list.stream().flatMap(item -> Stream.of(new String[] { item.a, item.b, item.c }))
					.collect(Collectors.toList());
			System.out.println(lst);
		}
		{// flatmap
			var lst = list.stream().flatMap(item -> Stream.of(new String[] { item.a, item.b, item.c }))
					.collect(Collectors.toList());
			System.out.println(lst);
		}

		{// flatmap
			var lst = list.stream().flatMap(item -> Stream.of(new String[] { item.a, item.b, item.c }))
					.collect(Collectors.toList());
			System.out.println(lst);
		}

		{//
			var lst = list.stream().collect(Collectors.toList());
			System.out.println(lst);
		}
		{//
			var lst = list.stream().collect(ArrayList::new, Collection::add, Collection::addAll);
			System.out.println(lst);
		}

		{//
			@SuppressWarnings("rawtypes")
			Supplier<Collection<Item>> supplier = () -> new ArrayList();

			BiConsumer<Collection<Item>, Item> accumulator = (a, b) -> a.add(b);

			BiConsumer<Collection<Item>, Collection<Item>> combiner = (a, b) -> Collections.addAll(null, null);
			var lst = list.stream().collect(supplier, accumulator, combiner);
			System.out.println(" ==>" + lst);
		}

		{ // プロパティごとに値を集めたい
			var as = new ArrayList<String>();
			var bs = new ArrayList<String>();
			var cs = new ArrayList<String>();

			list.stream().forEach(item -> {
				as.add(item.a);
				bs.add(item.b);
				cs.add(item.c);
			});

			System.out.printf("%s %s %s%n", as, bs, cs);
		}
//		{ // 配列にしてみる
//			var lst = list.stream().map(item->new String[] {item.a, item.b, item.c}).collect()
//			
//			
//		}

	}

	static void b() {

	}

}
