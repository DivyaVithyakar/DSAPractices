package dsapractice.BruteForce;

import org.junit.Assert;
import org.junit.Test;

public class LC_557_ReverseWordsString {
	
	
	/*
	 * 
	 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
	 * 
	 * 
     *Input - String
     *Output - String
     * 
     * 5)Pseudo code
     * 
     * ->Create Strign array to split and store the sentence
     * ->Iterate using for loop untill length of string
     *     ->Iterate using for loop until length string array
     *     ->create string builder for each letter
     *     ->reverse the string 
     *     ->convert tostring and store string builder
     * -> iterate using for loop until words for length
     *   ->words[0] = words[0]+" "words[i]
     * -> return words[0]
     * 
     * Time Complexity - O(n)
     * 

	 */
	
	@Test
	public void test1() {
		String test1 = reverseWords("Let's take LeetCode contest");
		Assert.assertEquals(test1, "s'teL ekat edoCteeL tsetnoc");
		
	}
	
	@Test
	public void test2() {
		String test1 = reverseWords("God Ding");
		Assert.assertEquals(test1, "doG gniD");
		
	}
	
	@Test
	public void test3() {
		String test1 = reverseWords("");
		Assert.assertEquals(test1, "");
		
	}
	
	
	public String reverseWords(String s) {

		String words[] = s.split(" ");

		for (int i = 0; i < words.length; i++) {

			StringBuilder st = new StringBuilder(words[i]);
			st.reverse();
			words[i] = st.toString();
		}
		for (int i = 1; i < words.length; i++) {
			words[0] = words[0] + " " + words[i];
		}
		return words[0];

  }

}
