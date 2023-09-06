package dsapractice;

import org.junit.Assert;
import org.junit.Test;

public class LC1816_TruncateSentence {
	/*
	 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. 
	 * Each of the words consists of only uppercase and lowercase English letters (no punctuation).
     *For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
     *You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. 
     *Return s​​​​​​ after truncating it.
     *
     *Input - String , Integer
     *Output - String
     *
     * Pseudo code (3 MINS)
     * ->Initialize variable totrack count
     * -> Iterate using for until length of s
     *    ->if when CharAti found space increase count
     *    ->break when count = k
     * ->if count = length return s
     * ->else return substring until 0,i
	 * 
	 * Time Complexity - O(n)
     * 
	 */
	
	@Test
	public void test1() {
		String test1 = truncateSentence("Hello how are you Contestant", 4);
		Assert.assertEquals("Hello how are you", test1);
	}
	
	@Test
	public void test2() {
		String test2 = truncateSentence("Negative", 2);
		Assert.assertEquals("Negative", test2);
	}
	
	@Test
	public void test3() {
		String test2 = truncateSentence("Edge cases can be tricky sometimes", 7);
		Assert.assertEquals("Edge cases can be tricky sometimes", test2);
	}
	
	public String truncateSentence(String s,int k) {
		int count =0;
		int i=0;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') count ++;
			 if(count == k) break;
		}
		
		if(i==s.length()) return s;
		return s.substring(0, i);
		
	}


}
