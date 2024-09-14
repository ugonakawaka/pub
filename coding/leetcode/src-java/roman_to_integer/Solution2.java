package roman_to_integer;

import java.util.Arrays;

class Solution2 {

	public int romanToInt(String s) {
//		I             1
//		V             5
//		X             10
//		L             50
//		C             100
//		D             500
//		M             1000

		char[] cs = s.toCharArray();

		int sum = 0;
		char pc = 0;
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];

			switch (c) {
			case 'I':
				sum += 1;
				break;
			case 'V':
				if (pc == 'I') {
					sum -= 1;
					sum += 4;
					break;
				}
				sum += 5;
				break;
			case 'X':
				if (pc == 'I') {
					sum -= 1;
					sum += 9;
					break;
				}

				sum += 10;
				break;
			case 'L':
				if (pc == 'X') {
					sum -= 10;
					sum += 40;
					break;
				}
				sum += 50;
				break;
			case 'C':
				if (pc == 'X') {
					sum -= 10;
					sum += 90;
					break;
				}
				sum += 100;
				break;
			case 'D':
				if (pc == 'C') {
					sum -= 100;
					sum += 400;
					break;
				}
				sum += 500;
				break;
			case 'M':
				if (pc == 'C') {
					sum -= 100;
					sum += 900;
					break;
				}
				sum += 1000;
				break;
			default:
				;
			}
			pc = c;
		}

		return sum;
	}

	public static void main(String[] args) {

		{
			var n = new Solution2().romanToInt("III");
			System.out.println(n);
		}
		{
			var n = new Solution2().romanToInt("LVIII");
			System.out.println(n);
		}
		{
			var n = new Solution2().romanToInt("MCMXCIV");
			System.out.println(n);
		}

	}
}
