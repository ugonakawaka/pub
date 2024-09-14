package a0058_LengthofLastWord;

public class Solution {

	// 遅いけど...
	public int lengthOfLastWord(String s) {

		String[] ss = s.split("[ ]{1,}");

		return ss[ss.length - 1].length();
	}

}
