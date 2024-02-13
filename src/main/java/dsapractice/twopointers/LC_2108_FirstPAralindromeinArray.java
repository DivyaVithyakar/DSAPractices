package dsapractice.twopointers;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC_2108_FirstPAralindromeinArray {
	
	/*
	 * Given an array of strings words, return the first palindromic string in the array. 
	 * If there is no such string, return an empty string "".
     *A string is palindromic if it reads the same forward and backward.
     *
     *Input: words = ["abc","car","ada","racecar","cool"]
     *Output: "ada"


	 */
	
	@Test
	public void test1() {
		String test1 = firstParalindrome(new String[] {"abc","car","ada","racecar","cool"});
		Assert.assertEquals(test1, "ada");
	}
	
	public String firstParalindrome(String[] words) {
		
		for(String word: words) {
			if(paralindrome(word) == true) {
				return word;
			}
		}
		
		return "";
		
	}
	
	private boolean paralindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}

}
