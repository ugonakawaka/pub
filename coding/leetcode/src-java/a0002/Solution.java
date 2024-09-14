package a0002;

import java.util.LinkedHashSet;

class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 0) {
			return 0;
		}
		var set = new LinkedHashSet<String>();

		set.add(s.substring(0, 1));
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				var s1 = s.substring(i, j + 1);
				var s3 = s.substring(j, j + 1);
				boolean b = set.stream().anyMatch(s2 -> {
					return s2.contains("" + s3);
				});

				if (!b) {
					set.add(s1);
				}
				i = j - 1;
			}
		}

		return set.stream().max((c1, c2) -> {
			return c1.length() > c2.length() ? 1 : -1;
		}).get().length();
	}

	public static void main(String[] args) {

		{
			var n = new Solution().lengthOfLongestSubstring("abcabcbb");
			System.out.println(n);
		}
		{
			var n = new Solution().lengthOfLongestSubstring("bbbbb");
			System.out.println(n);
		}
		{
			var n = new Solution().lengthOfLongestSubstring("pwwkew");
			System.out.println(n);
		}
		{
			var n = new Solution().lengthOfLongestSubstring("aab");
			System.out.println(n);
		}
	}
}