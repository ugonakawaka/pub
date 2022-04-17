package a04_streamapi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import a04_streamapi.ChapXx_sample.Item;

class ChapXx_sampleTest {

	List<Item> createデフォルトなしデータ() {
		List<Item> list = Arrays.asList(new Item("ITEM-001", "apple", 50, 2), new Item("ITEM-100", "banana", 200, 1),
				new Item("ITEM-100", "banana2", 300, 4));
		return list;
	}

	@Test
	void aオリジナルと同じ結果になるか2() {
		var items = ChapXx_sample.createItemList();
		var expected = ChapXx_sample.serchItems(items, 200, "ITEM-999");
		var actual = ChapXx_sample.serchItems2(items, 200, "ITEM-999");

		assertSame(expected, actual);
	}
	
	@Test
	void aオリジナルと同じ結果になるか3() {
		var items = ChapXx_sample.createItemList();
		var expected = ChapXx_sample.serchItems(items, 200, "ITEM-999");
		var actual = ChapXx_sample.serchItems3(items, 200, "ITEM-999");

		assertSame(expected, actual);
	}
	
	@Test
	void aデフォルトがない場合例外をだすか1() {
		assertThrows(RuntimeException.class, () -> {
			ChapXx_sample.serchItems(createデフォルトなしデータ(), 200, "ITEM-999");
		});
	}
	@Test
	void aデフォルトがない場合例外をだすか2() {
		assertThrows(RuntimeException.class, () -> {
			ChapXx_sample.serchItems2(createデフォルトなしデータ(), 200, "ITEM-999");
		});
	}

	@Test
	void aデフォルトがない場合例外をだすか3() {
		assertThrows(RuntimeException.class, () -> {
			ChapXx_sample.serchItems2(createデフォルトなしデータ(), 200, "ITEM-999");
		});
	}
	

}
