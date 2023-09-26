package dsapractice.slidingWindow;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class LC3_LongestSubStringWithoutRepeatingChar {
	/*
	 * Given a string s, find the length of the longest substring without repeating characters.
	 * 
	 * Input - String
	 * Output - int
	 * 
	 * Test Data
	 * Input : s = "abcabcbb"
	 * Output : 3
	 * 
	 * Input :s = "bbbbb"
	 * Output :1
	 * 
	 * Input : "pwwkew"
	 * Output : 3
	 * 
	 * 
	 * Pseudo Code
	 * ->Initialize set to track unique chars
	 * ->Initialize start, end pointers and track max length
	 * ->Iterate using while loop until end of the loop
	 *   ->if unique char not contains in end pointer, add it to set
	 *   ->and assign to maxlength
	 *   ->end increase
	 *  ->else remove it from start
	 *  ->increase start pointer
	 * ->return max length
	 *   
	 * 
	 * Time Complexity - O(n)
	 * Space Complexity - O(1)
	 */
	@Test
	public void test1() {
		int test1 = lengthOfLongestSubstring("abcabcbb");
		Assert.assertEquals(test1, 3);
	}
	
	@Test
	public void test2() {
		int test1 = lengthOfLongestSubstring("bbbbb");
		Assert.assertEquals(test1, 1);
	}
	
	@Test
	public void test3() {
		int test1 = lengthOfLongestSubstring("pwwkew");
		Assert.assertEquals(test1, 3);
	}
	
	public int lengthOfLongestSubstring(String s) {
		HashSet<Character> uniqueChars = new HashSet<Character>();
		int start = 0;
		int end = 0;
		int maxSubstringLength = 0;

		while (end < s.length()) {
			if (!uniqueChars.contains(s.charAt(end))) {
				uniqueChars.add(s.charAt(end));
				maxSubstringLength = Math.max(maxSubstringLength, end - start + 1);
				end++;
			} else {
				uniqueChars.remove(s.charAt(start));
				start++;
			}
		}

		return maxSubstringLength;
	}
	
	//diff b/w set & hashset 

}
