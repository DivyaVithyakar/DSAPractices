package dsapractice.twopointers;

import org.junit.Assert;
import org.junit.Test;

public class LC1768_MergeStringsAlternatively {
	/*
	 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
	 * If a string is longer than the other, append the additional letters onto the end of the merged string.
     *Return the merged string.
     *
     *
     *Input - String, String
     *Output - String
     *
     *Test data set 
     * Test Data 1
     * Input : word1 = "abc", word2 = "pqr"
     * Output : "apbqcr"
     * 
     * Test Data 2
     * Input : word1 = "ab", word2 = "pqrs"
     * Output : "apbqrs"
     * 
     * Test Data 3
     * Input :  word1 = "abcd", word2 = "pq"
     * Output : "apbqcd"
     * 
     * Pseudo code 
     * ->Iterate using for loop until length of 2 strings
     *   ->if i <  word1 append the charat(i) to word1 and same dor word2
     *  ->return string builder as string
     * 
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	@Test
	public void test1() {
		String test1 = mergeAlternately("abc",  "pqr");
		Assert.assertEquals(test1, "apbqcr");
	}
	
	@Test
	public void test2() {
		String test1 = mergeAlternately("ab",  "pqrs");
		Assert.assertEquals(test1, "apbqrs");
	}
	
	@Test
	public void test3() {
		String test1 = mergeAlternately("abcd",  "pq");
		Assert.assertEquals(test1, "apbqcd");
	}
	
	 public String mergeAlternately(String word1, String word2) {
         StringBuilder sb = new StringBuilder();
      for (int i = 0; i < word1.length() + word2.length(); i++) {
          if(i < word1.length()) sb.append(word1.charAt(i));
          if(i < word2.length()) sb.append(word2.charAt(i));
      }
      return sb.toString();
  
  }

}
