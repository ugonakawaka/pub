package a04_streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* https://github.com/katohideyuki/Java_SE_11_Gold/tree/main/JavaSE11_Gold/src/main/java/sample */
public class ChapXx_sample {
	public static class Item {
		private final String code;
		private final String name;
		private final int price;
		private final int priority;

		public Item(String code, String name, int price, int priority) {
			this.code = code;
			this.name = name;
			this.price = price;
			this.priority = priority;
		};

		public String getCode() {
			return code;
		}

		public String getName() {
			return name;
		}

		public int getPrice() {
			return price;
		}

		public int getPriority() {
			return priority;
		}

		@Override
		public String toString() {
			return String.format(" code : %s, name : %s, price : %s, priority : %s", this.code, this.name, this.price,
					this.priority);
		}

	}

	@SuppressWarnings("serial")
	public static class NotFoundDefaultItemException extends RuntimeException {

	}

	public static void main(String[] args) {
		a();
	}

	static Supplier<Item> time(Supplier<Item> f) {
		return () -> {
			long start = System.currentTimeMillis();
			try {

				return f.get();
			} finally {
				System.out.printf("%f sec%n", (System.currentTimeMillis() - start) / 1000.);
			}
		};
	}

	static void a() {
		{
			var item = serchItems(createItemList(), 100, /* default code */"ITEM-999");
			System.out.println(item);
		}
		{
			var item = serchItems(createItemList(), 250, /* default code */"ITEM-999");
			System.out.println(item);
		}

		{
			var item = serchItems2(createItemList(), 100, /* default code */"ITEM-999");
			System.out.println(item);
		}
		{
			var item = serchItems2(createItemList(), 250, /* default code */"ITEM-999");
			System.out.println(item);
		}

		{
			var list = createItemList(999999);
			{

				var item1 = time(() -> {
					return serchItems(list, 5000, /* default code */"ITEM-0000999");
				}).get();
				var item2 = time(() -> {
					return serchItems2(list, 5000, /* default code */"ITEM-0000999");
				}).get();
				var item3 = time(() -> {
					return serchItems3(list, 5000, /* default code */"ITEM-0000999");
				}).get();

				System.out.println(item1);
				System.out.println(item2);
				System.out.println(item3);

			}

		}
		// serchItems2(null, 250, /* default code */"ITEM-999");
	}

	static List<Item> createItemList() {
		List<Item> list = Arrays.asList(new Item("ITEM-001", "apple", 50, 2), new Item("ITEM-100", "banana", 200, 1),
				new Item("ITEM-999", "grape", 300, 3), new Item("ITEM-100", "banana2", 300, 4));
		return list;
	}

	static List<Item> createItemList(int size) {
		var list = new ArrayList<Item>();
		var names = new String[] { "apple", "banana", "grape" };

		for (int i = 0; i < size; i++) {
			var code = String.format("ITEM-%07d", i);
			var r3 = new Random().nextInt(2);
			list.add(new Item(code, names[r3], i, i));
		}

		return list;
	}

	public static Item serchItems(List<Item> list, int overPrice, String defaultCode) throws RuntimeException {

		List<Item> itemList = list.stream().sorted(Comparator.comparing(Item::getPriority))
				.collect(Collectors.toList());

		Optional<Item> itemOp = itemList.stream().filter(x -> x.getPrice() >= overPrice).findFirst();

		Item defaultItem = itemList.stream().filter(item -> item.getCode().equals(defaultCode)).findFirst()
				.orElseThrow(RuntimeException::new);

		if (!itemOp.isEmpty()) {
			return itemOp.get();
		}
		return defaultItem;

	}

	/* 1ループで実装 */
	public static Item serchItems2(List<Item> listOfItem, int overPrice, String defaultCode) throws RuntimeException {

		assert listOfItem != null && listOfItem.size() > 0 && defaultCode != null;

		Item[] items = { null, null };
		for (var item : listOfItem) {

			var isOverprice = item.price >= overPrice;
			if (items[0] == null && isOverprice) {
				items[0] = item;
			} else if (items[0] != null && isOverprice && items[0].priority > item.priority) {
				items[0] = item;
			}

			var isDefaultCode = defaultCode.equals(item.code);
			if (items[1] == null && isDefaultCode) {
				items[1] = item;
			} else if (items[1] != null && isDefaultCode && items[1].priority > item.priority) {
				items[1] = item;
			}
		}

		if (items[1] == null) {
			throw new RuntimeException();
		}

		if (items[0] == null) {
			return items[1];
		}
		return items[0];

	}

	public static Item serchItems3(List<Item> list, int overPrice, String defaultCode)
			throws NotFoundDefaultItemException {

		// 事前にデフォルトがあるかチェックしておく
		var b = list.stream().anyMatch(item -> defaultCode.equals(item.code));
		if (!b) {
			throw new NotFoundDefaultItemException();
		}

		// １番下にデフォルトがくるようにする
		Comparator<Item> comparator = (o1, o2) -> {
			if (!o1.code.equals(defaultCode) && !o2.code.equals(defaultCode))
				return Integer.compare(o1.getPriority(), o2.getPriority());

			if (o2.code.equals(defaultCode)) {
				return -1;
			}
			return 1;
		};

		var result = list.stream().sorted(comparator).filter(item -> item.getPrice() >= overPrice || defaultCode.equals(item.getCode()))
				.collect(Collectors.toList());

		// System.out.println("*********** " + result.get(result.size() - 1));
		// sizeが０の場合は、デフォルトもなし、件数があるが、最下位がデフォルトでなければ、デフォルトが設定されていない
		if (result.size() == 0 || !result.get(result.size() - 1).code.equals(defaultCode)) {
			throw new NotFoundDefaultItemException();
		}

		return result.get(0);
	}
}
