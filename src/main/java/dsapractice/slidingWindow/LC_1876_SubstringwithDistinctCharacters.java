package dsapractice.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class LC_1876_SubstringwithDistinctCharacters {
	
	/*
	 * A string is good if there are no repeated characters.
     *Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
     *Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
     *A substring is a contiguous sequence of characters in a string.
     *
     *
     *Input - String
     *Output - int
     * 
     *5)Pseudo code - 20 MINS
     *->initialize variable to track count
     *->if length of string less than 3 return count variable
     *->Iterate using for loop
     *  ->if(i!=i+1&&i+1!=i+2&&i+2!=i
     *  ->increase the count
     *  
     * -> return count
     * 
	 */
	
	@Test
	public void test1() {
		int test1 = subStringwithDistincthar("aababcabc");
		Assert.assertEquals(test1, 4);
	}
	
	@Test
	public void test2() {
		int test1 = subStringwithDistincthar("aaaaaa");
		Assert.assertEquals(test1, 0);
	}
	
	@Test
	public void test3() {
		int test1 = subStringwithDistincthar("ab");
		Assert.assertEquals(test1, 0);
	}
	// Time Complexity - O(n)
     // Space Complexity -O(1)
	public int subStringwithDistincthar(String s) {
		int substringCount = 0;
		if(s.length()<3) {
			return substringCount;
		}
		for(int i =0;i<s.length()-2;i++) {
			char word1 = s.charAt(i);
			char word2 = s.charAt(i+1);
			char word3 = s.charAt(i+2);
			
			if(word1 != word2 && word2 != word3 && word3 != word1) {
				substringCount++;
			}
					
		}
		return substringCount;
	}

}
