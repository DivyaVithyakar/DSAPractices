package dsapractice.twopointers;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC3_LongestSubstringWithoutRepeat {
	
	/*
	 * Given a string s, find the length of the longest substring without repeating characters.
	 * 
	 * Input: s = "abcabcbb"
	 * Output: 3
	 * 
	 */
	
	@Test
	public void test1() {
		int test1 = longestSubString("abcabcbb");
		Assert.assertEquals(test1, 3);
	}
	
	
	public int longestSubString(String s) {
		
		Set<Character> seen = new HashSet<>();
		
		int start = 0;
		int end = 0;
		int count = 0;
		
		while(end < s.length()) {
			if(!seen.contains(s.charAt(end))) {
				seen.add(s.charAt(end));
				end++;
				count = Math.max(seen.size(), count);
			}else {
				seen.remove(s.charAt(start));
				start++;
			}
		}
		return count;
	}

}
