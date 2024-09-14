package a0168_ExcelSheetColumnTitle;

class Solution {

	public static void main(String[] args) {
		var solution = new Solution();
		{
			var c = 2;
			var s = solution.convertToTitle(c);
			System.out.printf("%s %s%n", c, s);

		}
		{
			var c = 26;
			var s = solution.convertToTitle(c);
			System.out.printf("%s %s%n", c, s);

		}
		{
			var c = 28;
			var s = solution.convertToTitle(c);
			System.out.printf("%s %s%n", c, s);

		}
		{
			var c = 51;
			var s = solution.convertToTitle(c);
			System.out.printf("%s %s%n", c, s);

		}
		{
			var c = 52;// AZ
			var s = solution.convertToTitle(c);
			System.out.printf("%s %s%n", c, s);

		}
		{
			var c = 52 + 26;
			var s = solution.convertToTitle(c);
			System.out.printf("%s %s%n", c, s);

		}
		{
			var c = 53;
			var s = solution.convertToTitle(c);
			System.out.printf("%s %s%n", c, s);

		}
		{
			var c = 79;
			var s = solution.convertToTitle(c);
			System.out.printf("%s %s%n", c, s);

		}
		{
			var c = 701;
			var s = solution.convertToTitle(c);
			System.out.printf("%s %s%n", c, s);

		}

	}

	public String convertToTitle(int columnNumber) {

		final var p = 64;

		var sb = new StringBuilder();

		int a = columnNumber;

		do {
			if (a < 27) {
				sb.insert(0, (char) (a + p));
				a = 0;
			} else {
				int c = (a % 26);
				if (c == 0) {
					c = 26;
					a -= 26;
				}
				sb.insert(0, (char) (c + p));
				a = (a / 26);
			}

		} while (0 < a);

		// System.out.println(sb);
		return "" + sb;
	}
}