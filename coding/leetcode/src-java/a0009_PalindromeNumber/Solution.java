package a0009_PalindromeNumber;

class Solution {

	public static void main(String[] args) {

		var solution = new Solution();
		{
			var i = 121;
			var b = solution.isPalindrome(i);
			System.out.printf("%d %b%n", i, b);
		}
		{
			var i = -121;
			var b = solution.isPalindrome(i);
			System.out.printf("%d %b%n", i, b);
		}
		{
			var i = 10;
			var b = solution.isPalindrome(i);
			System.out.printf("%d %b%n", i, b);
		}
		{
			var i = 1;
			var b = solution.isPalindrome(i);
			System.out.printf("%d %b%n", i, b);
		}
		{
			var i = 12345432;
			var b = solution.isPalindrome(i);
			System.out.printf("%d %b%n", i, b);
		}
		
	}

	public boolean isPalindrome(int x) {

		var s = String.valueOf(x);
		// System.out.println(s);
		char[] cc = s.toCharArray();
		var len = cc.length - 1;
		for (int i = 0; i < cc.length / 2; i++) {
			if (cc[i] != cc[len - i]) {
				return false;
			}
		}

		return true;
	}
}