package a0026_RemoveDuplicatesfromSortedArray;

import java.util.Arrays;
import java.util.Objects;

public class Solution {
	public static void main(String[] args) {

		var solution = new Solution();
		{
			int[] is = { 1, 1, 2 };

			int[] expected = { 1, 2 };

			var n = solution.removeDuplicates(is);
			// array copy

			int[] actual = Arrays.copyOf(is, n);
			var b = Arrays.equals(actual, expected);
			System.out.printf("%d %s%n", n, b ? "ok" : "ng");

		}
		{
			int[] is = { 0,0,1,1,1,2,2,3,3,4 };

			int[] expected = { 0,1,2,3,4};

			var n = solution.removeDuplicates(is);
			// array copy

			int[] actual = Arrays.copyOf(is, n);
			var b = Arrays.equals(actual, expected);
			System.out.printf("%d %s%n", n, b ? "ok" : "ng");

		}
	}

	public int removeDuplicates(int[] nums) {

		var p = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[p] == nums[i]) {
				nums[p] = nums[i];

				continue;
			}
			p++;
			nums[p] = nums[i];
		}

		p++;
		//System.out.println(Arrays.toString(nums));

		return p;
	}

}