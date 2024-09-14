package a0066_PlusOne;

import java.math.BigInteger;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		var solution = new Solution();
		{
			int[] is0 = new int[] { 1, 2, 3 };
			var is = solution.plusOne(is0);
			System.out.println(Arrays.toString(is));
		}
	}

	public int[] plusOne(int[] digits) {
		var sb = new StringBuilder();

		for (int i = 0; i < digits.length; i++) {
			sb.append(digits[i]);
		}

		var i = new BigInteger(sb.toString()).add(BigInteger.ONE);

		char[] cs = i.toString().toCharArray();
		int[] is = new int[cs.length];
		for (int j = 0; j < cs.length; j++) {
			is[j] = Integer.parseInt("" + cs[j]);
		}

		return is;
	}
}