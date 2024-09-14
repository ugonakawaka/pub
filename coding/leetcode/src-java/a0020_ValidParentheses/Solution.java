package a0020_ValidParentheses;

import java.util.Stack;

class Solution {
	public static void main(String[] args) {

		var solution = new Solution();
		{
			var s = "){";
			boolean b = solution.isValid(s);
			System.out.printf("%s %b%n", s, b);

		}
		{
			var s = "()";
			boolean b = solution.isValid(s);
			System.out.printf("%s %b%n", s, b);

		}
		{
			var s = "((";
			boolean b = solution.isValid(s);
			System.out.printf("%s %b%n", s, b);

		}
		{
			var s = "()[]{}";
			boolean b = solution.isValid(s);
			System.out.printf("%s %b%n", s, b);

		}
		{
			var s = "(]";
			boolean b = solution.isValid(s);
			System.out.printf("%s %b%n", s, b);

		}
		{
			var s = "(())";
			boolean b = solution.isValid(s);
			System.out.printf("%s %b%n", s, b);

		}
		{
			var s = "[(()){}]";
			boolean b = solution.isValid(s);
			System.out.printf("%s %b%n", s, b);

		}
	}

	public boolean isValid(String s) {
		if (s.length() <= 1)
			return false;

		var stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			switch (c) {

			case '(':
			case '[':
				;
			case '{':
				stack.add(c);
				break;
			case ')': {
				if (stack.isEmpty())
					return false;

				char c1 = stack.pop();

				if (c1 != '(')
					return false;
				break;
			}
			case ']': {
				if (stack.isEmpty())
					return false;
				char c1 = stack.pop();

				if (c1 != '[')
					return false;
				break;
			}
			case '}': {
				if (stack.isEmpty())
					return false;
				char c1 = stack.pop();

				if (c1 != '{')
					return false;
				break;
			}
			}

		}

		if (!stack.isEmpty()) {
			return false;
		}

		return true;
	}

	public boolean isValid2(String s) {
		if ("".equals(s)) {
			return true;
		}
		if (s.length() % 2 != 0) {
			return false;
		}

		var stack = new Stack<Character>();

		char[] cs = s.toCharArray();

		for (char c : cs) {

			switch (c) {

			case '(':
			case '[':
				;
			case '{':
				stack.add(c);
				break;
			case ')': {
				if (stack.isEmpty())
					return false;

				char c1 = stack.pop();

				if (c1 != '(')
					return false;
				break;
			}
			case ']': {
				if (stack.isEmpty())
					return false;
				char c1 = stack.pop();

				if (c1 != '[')
					return false;
				break;
			}
			case '}': {
				if (stack.isEmpty())
					return false;
				char c1 = stack.pop();

				if (c1 != '{')
					return false;
				break;
			}
			}

		}

		if (!stack.isEmpty()) {
			return false;
		}

		return true;
	}
}