package a0027_RemoveElement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String[] args) {

		{
			int[] nums = { 3, 2, 2, 3 };
			int val = 3;
			var s1 = Arrays.toString(nums);
			var k = new Solution().removeElement(nums, val);
			var s2 = Arrays.toString(nums);
			System.out.printf("%d s1:%s s2:%s %n", k, s1, s2);
		}
		{
			int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };

			int val = 2;
			var s1 = Arrays.toString(nums);
			var k = new Solution().removeElement(nums, val);
			var s2 = Arrays.toString(nums);
			System.out.printf("%d s1:%s s2:%s %n", k, s1, s2);
		}

		{
			int[] nums = { 3, 3, 3, 3 };
			int val = 3;
			var s1 = Arrays.toString(nums);
			var k = new Solution().removeElement(nums, val);
			var s2 = Arrays.toString(nums);
			System.out.printf("%d s1:%s s2:%s %n", k, s1, s2);
		}

		{

		}
	}

	public int removeElement(int[] nums, int val) {

		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				cnt++;
				continue;
			}
			nums[i - cnt] = nums[i];
		}

		return nums.length - cnt;
	}

	public int removeElement_ok(int[] nums, int val) {
		// ちょっつとかたくなにstreamを使った感じがする
		// 無理やり
		var arr = IntStream.of(nums).filter(a -> a != val).toArray();
		// これで引数の配列まるっと書き換える
		System.arraycopy(arr, 0, nums, 0, arr.length);
		return arr.length;
	}

	// 参考
	public int removeElement1(int[] nums, int val) {
		int counterVal = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i - counterVal] = nums[i];
			if (nums[i] == val)
				counterVal++;
		}
		return nums.length - counterVal;
	}

	// NGコード
	public int removeElement_ng(int[] nums, int val) {

		// このコードだと、たんの値だけを返していてだめで、期待していることはnumsのsortである
		return IntStream.of(nums).filter(a -> a != val).toArray().length;
	}
}