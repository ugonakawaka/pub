package a01_basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ChapXx18_reference {

	public static void main(String[] args) {
		a();

	}

	static void a() {

		var aaa = new Aaa();

		{
			int[] is = { 1, 8, 2, 7, 3, 6, 4 };
			// 渡す前の配列
			System.out.println(Arrays.toString(is));
			aaa.xxx(is);
			// 渡したあと並び替えされているよ
			System.out.println(Arrays.toString(is));
		}
		{
			int[] is = { 1, 8, 2, 7, 3, 6, 4 };

			System.out.println(Arrays.toString(is));
			aaa.yyy(is);
			// もちろん変わらない
			System.out.println(Arrays.toString(is));
		}
	}

	static class Aaa {

		public void xxx(int[] array) {
			Arrays.sort(array);
		}

		public void yyy(int[] array) {

			IntStream.of(array).sorted();
		}
	}
}
