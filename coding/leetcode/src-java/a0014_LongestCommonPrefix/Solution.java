package a0014_LongestCommonPrefix;

class Solution {

	public static void main(String[] args) {

	}

	public String longestCommonPrefix(String[] strs) {

		var sb = new StringBuilder();

		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {

				if (!(i < strs[j].length()))
					return sb.toString();
				if (c != strs[j].charAt(i)) {
					return sb.toString();
				}
			}
			sb.append(c);
		}

		return sb.toString();
	}
}
