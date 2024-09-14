package a0006_ZigzagConversion;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {

//		char[] cs = new char[10];
//		System.out.println(Arrays.toString(cs));

		var solution = new Solution();
		{
			var s = "PAHNAPLSIIGYIR";
			var r = 3;
			var s1 = solution.convert(s, r);
			var s2 = "PAHNAPLSIIGYIR";

			System.out.printf("%s %s  %b%n", s1, s2, s1.equals(s2));

		}
	}

	public String convert(String s, int numRows) {

		var sb = new StringBuilder();

		char[] cs = s.toCharArray();
		for (int r = 0; r < numRows; r++) {

			for (int c = 0; c < numRows; c++) {

			}
		}

		return sb.toString();
	}

	public String convert_ng(String s, int numRows) {

		var n = (s.length() / numRows) + 3;
		System.out.println(n);
		int idx = 0;
		char[][] css = new char[numRows][n];
		char[] cs = s.toCharArray();
		int c = 0;
		while (idx < s.length()) {

			for (int j = 0; j < numRows - 1; j++) {
				if (!(idx < s.length()))
					break;

				css[j][c] = cs[idx];
				idx++;
			}

			for (int j = 0; j < numRows - 1; j++) {
				if (!(idx < s.length()))
					break;
				css[j][c++] = cs[idx];
				idx++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(css[i][j]);
			}
		}

		return sb.toString();
	}
}