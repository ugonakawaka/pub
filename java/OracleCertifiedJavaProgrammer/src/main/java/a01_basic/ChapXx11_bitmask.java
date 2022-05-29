package a01_basic;

import java.util.List;

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
	}
}
