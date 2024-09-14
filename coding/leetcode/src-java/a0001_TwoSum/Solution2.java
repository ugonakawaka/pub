package a0001_TwoSum;

import java.util.Arrays;

public class Solution2 {

	public int[] twoSum(int[] nums, int target) {

		int[] result = new int[] { 0, 0 };
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {

		{
			var is = new Solution2().twoSum(new int[] { 2, 7, 11, 15 }, 9);
			System.out.println(Arrays.toString(is));
		}
		{
			var is = new Solution2().twoSum(new int[] { 3, 2, 4 }, 6);
			System.out.println(Arrays.toString(is));
		}
		{
			var is = new Solution2().twoSum(new int[] { 3, 3 }, 6);
			System.out.println(Arrays.toString(is));
		}

	}

}
