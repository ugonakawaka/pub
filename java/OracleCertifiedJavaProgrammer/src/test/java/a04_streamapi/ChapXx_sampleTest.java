package a04_streamapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import a04_streamapi.ChapXx_sample.Item;

class ChapXx_sampleTest {


	@Test
	void aオリジナルと同じ結果になるか() {
		var items = ChapXx_sample.createItemList();
		var expected = ChapXx_sample.serchItems(items, 200, "ITEM-999");
		var actual = ChapXx_sample.serchItems2(items, 200, "ITEM-999");
		
		assertSame(expected, actual);
	}
}
