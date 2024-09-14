package a0027_RemoveElement;

import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {

	}

	public int removeElement1(int[] nums, int val) {
		int counterVal = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i - counterVal] = nums[i];
			if (nums[i] == val)
				counterVal++;
		}
		return nums.length - counterVal;
	}

	public int removeElement(int[] nums, int val) {

		return IntStream.of(nums).filter(a -> a != val).toArray().length;

	}
}
