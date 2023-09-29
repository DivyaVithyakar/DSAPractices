package dsapractice.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class LC438_FindAllAnagramInString {
	
	/*
	 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. 
	 * You may return the answer in any order.
     *An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
     *typically using all the original letters exactly once.
     *
     *
     *Input - String,string
     *Output - list of int
     *
     *2. Test data set - 3 MINS
     * Test Data 1
     * Input : s = "cbaebabacd", p = "abc"
     * Output : [0,6]
     * 
     * Test Data 2
     * Input : s = "abab", p = "ab"
     * Output : [0,1,2]
     *
     * 
     * 5.Pseudo code - YES - 65 MINS
     * ->Create integer list to store o/p
     * ->If length of s is less than p or 0 & p is null or s null return result
     * 
     * ->Initialize one map to get values from p
     * ->iterate the p string until length
     *   ->Store the values to p map
     * ->Initialize right,left,track current window value 
     * ->Initialize one map to store the current window values
     *   ->Iterate using while loop until length s
     *   ->put the values to the current window if alrdy present increase the value
     *   ->if my fixed map values contains the of current char & current window , fixed window chars are equal to the current char
     *   ->increase the satisfied values variable
     * ->keep the window length equals to p
     * ->if satisfied the above condition add the left index to result 
     * ->
     * ->increase left,right 
     * ->return result
     * 
     * 
     * Time Complexity - O(n)
     * Space Complexity - O(n)

     *


	 */
	
	@Test
	public void test1() {
		List<Integer> test1 = findAnagrams("cbaebabacd", "abc");
		 List<Integer> expected = Arrays.asList(0, 6);
		Assert.assertEquals(test1, expected);
	}
	
	@Test
	public void test2() {
		List<Integer> test1 = findAnagrams("abab", "ab");
		 List<Integer> expected = Arrays.asList(0,1,2);
		Assert.assertEquals(test1, expected);
	}
	
	
	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
      if (s == null || s.length() == 0 || p == null || p.length() == 0 || s.length() < p.length()) {
          return result;
      }

      Map<Character, Integer> charCount = new HashMap<Character, Integer>();

      for (char c : p.toCharArray()) {
          charCount.put(c, charCount.getOrDefault(c, 0) + 1);
      }

      int left = 0;
      int right = 0;
      int required = charCount.size();
      int formed = 0;
      Map<Character, Integer> windowCount = new HashMap<Character, Integer>();

      while (right < s.length()) {
          char currentChar = s.charAt(right);
          
          windowCount.put(currentChar, windowCount.getOrDefault(currentChar, 0) + 1);

          if (charCount.containsKey(currentChar) && windowCount.get(currentChar).equals(charCount.get(currentChar))) {
              formed++;
          }

          while (left <= right && formed == required) {
              if (right - left + 1 == p.length()) {
                  result.add(left);
              }

              char leftChar = s.charAt(left);
              windowCount.put(leftChar, windowCount.get(leftChar) - 1);

              if (charCount.containsKey(leftChar) && windowCount.get(leftChar) < charCount.get(leftChar)) {
                  formed--;
              }

              left++;
          }

          right++;
      }

      return result;
  }

}
