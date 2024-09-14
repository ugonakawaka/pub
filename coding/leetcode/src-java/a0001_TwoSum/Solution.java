package a0001_TwoSum;

import java.util.Arrays;

public class Solution {

	public int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}

		return new int[] { 0, 0 };
	}


	public static void main(String[] args) {

		{
			var is = new Solution().twoSum(new int[] { 2, 7, 11, 15 }, 9);
			System.out.println(Arrays.toString(is));
		}
		{
			var is = new Solution().twoSum(new int[] { 3, 2, 4 }, 6);
			System.out.println(Arrays.toString(is));
		}
		{
			var is = new Solution().twoSum(new int[] { 3, 3 }, 6);
			System.out.println(Arrays.toString(is));
		}
		{
			var is = new Solution().twoSum(new int[] { 3, 2, 3 }, 6);
			System.out.println(Arrays.toString(is));
		}

	}

}
