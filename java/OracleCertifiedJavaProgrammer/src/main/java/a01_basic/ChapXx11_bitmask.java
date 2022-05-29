package a01_basic;

import java.util.List;
import java.util.function.Consumer;

public class ChapXx11_bitmask {

	public static void main(String[] args) {
		a();
	}

	static void a() {
		{
			int bitmask = 0x0000;
			int val = 0x1234;
			System.out.println(val & bitmask);
		}
		{
			int bitmask = 0x000F;
			int val = 0x1234;
			System.out.println(val & bitmask);
		}
		{
			int bitmask = 0xF000;
			int val = 0x1234;
			System.out.println(val & bitmask);
		}
		System.out.println("=======");
		{
			final Integer[] bitmasks = { 0xF, 0x0000, 0xFFFF, 0x000F, 0xF000, 0x0F00, 0x00F0 };
			final int val = 0x1234;
			System.out.println(val);// 4660
			List.of(bitmasks).stream().map(b -> val & b).forEach(System.out::println);
		}
		System.out.println("=======");
		{
			
			var print = new Consumer<Integer>() {

				@Override
				public void accept(Integer t) {
					System.out.printf("0x%x ", t);
					
				}
			};
			final Integer[] bitmasks = { 0xF, 0x0000, 0xFFFF, 0x000F, 0xF000, 0x0F00, 0x00F0 };
			final int val = 0x1234;
			System.out.println(val);// 4660
			List.of(bitmasks).stream().peek(print).map(b -> val & b).forEach(System.out::println);
		}
	}
}
