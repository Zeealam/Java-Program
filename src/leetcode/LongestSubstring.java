package leetcode;

import java.util.HashMap;

/*
 * Longest substring without repeating character use a sliding window and 
 * HashMap to find the length of the greatest substring without duplicate
 * character
 */
//Time complicity O(n) linear equation

public class LongestSubstring {

	public static int LengthOfLongestSubString(String str) {

		int start = 0;
		int maxLength = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int end = 0; end < str.length(); end++) {
			char curr = str.charAt(end);

			if (map.containsKey(curr)) {//If char is repeated
				start = Math.max(start, map.get(curr) + 1);//
			}
			map.put(curr, end);//p=0,w=1
			maxLength = Math.max(maxLength, end - start + 1);//
		}

		return maxLength;

	}

	public static void main(String[] args) {
		String input = "pwwkew";
		int ml = LengthOfLongestSubString(input);
		System.out.println(ml);

	}

}
