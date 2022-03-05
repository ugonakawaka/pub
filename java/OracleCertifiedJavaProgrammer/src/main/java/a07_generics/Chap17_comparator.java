package a07_generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

// 参考)
// https://github.com/katohideyuki/JavaGold/tree/main/Study/07/chapter_17
public class Chap17_comparator {

	static class Item {
		String name;
		int price;

		private Item() {
		}

		@Override
		public String toString() {

			return String.format("%s %d", name, price);
		}

		static Builder builder() {
			return new Builder();
		}

		static class Builder {
			Item item;

			public Builder() {
				this.item = new Item();
			}

			Builder setName(String name) {
				this.item.name = name;
				return this;
			}

			Builder setPrice(int price) {
				this.item.price = price;
				return this;
			}

			Item build() {
				return this.item;
			}
		}

	}

	static Item item(String name, int price) {
		return Item.builder().setName(name).setPrice(price).build();
	}

	public static void main(String[] args) {
		a();
		b();
	}

	static void a() {
		var items = Arrays.asList(item("a", 500), item("b", 400), item("c", 300), item("d", 200));
		var sorted = items.stream().sorted((o1, o2) -> {
			return o2.name.compareTo(o1.name);
		}).collect(Collectors.toList());

		System.out.println(items);
		System.out.println(sorted);
	}
	
	static void b() {
		Comparator<Item> comparator = (o1, o2) -> {
			return o2.name.compareTo(o1.name);
		};
		
		{
			var c1 = Objects.compare(item("a", 0), item("b", 0), comparator);
			var c2 = Objects.compare(item("b", 0), item("a", 0), comparator);			
			System.out.printf("%d %d %n", c1, c2 );
		}
		{ // reversed
			var c1 = Objects.compare(item("a", 0), item("b", 0), comparator.reversed());
			var c2 = Objects.compare(item("b", 0), item("a", 0), comparator.reversed());
			System.out.printf("%d %d %n", c1, c2 );
		}

	}
}
