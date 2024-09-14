package a0035_SearchInsertPosition;

public class Solution {
	public static void main(String[] args) {
		var solution = new Solution();
		{
			int[] is = { 1, 3, 5, 6 };
			var target = 5;
			var pos = solution.searchInsert(is, target);

			System.out.printf("%s%n", pos);
		}
		{
			int[] is = { 1, 3, 5, 6 };
			var target = 2;
			var pos = solution.searchInsert(is, target);

			System.out.printf("%s%n", pos);
		}
		{
			int[] is = { 1, 3, 5, 6 };
			var target = 7;
			var pos = solution.searchInsert(is, target);

			System.out.printf("%s%n", pos);
		}
		{
			int[] is = {};
			var target = 7;
			var pos = solution.searchInsert(is, target);

			System.out.printf("%s%n", pos);
		}
		{
			int[] is = { 1, 3, 5, 6 };
			var target = 0;
			var pos = solution.searchInsert(is, target);

			System.out.printf("%s%n", pos);
		}
		{
			int[] is = { 1 };
			var target = 0;
			var pos = solution.searchInsert(is, target);

			System.out.printf("%s%n", pos);
		}
	}

	public int searchInsert(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] >= target)
				return i;

			if (nums[i] < target && nums.length < i && target <= nums[i + 1]) {
				return i + 1;
			}
		}

		return nums.length;
	}
}