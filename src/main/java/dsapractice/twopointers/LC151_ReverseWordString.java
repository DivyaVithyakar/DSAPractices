package dsapractice.twopointers;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC151_ReverseWordString {
	
	/*
	 * Given an input string s, reverse the order of the words.
     *A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
     *Return a string of the words in reverse order concatenated by a single space.
     *Note that s may contain leading or trailing spaces or multiple spaces between two words. 
     *The returned string should only have a single space separating the words. Do not include any extra spaces.
     *
     *
     *Input: s = "the sky is blue"
     *Output: "blue is sky the"
     *
	 */
	
	@Test
	public void test1() {
		String reverseWord = reverseWord("the sky is blue");
		Assert.assertEquals(reverseWord, "blue is sky the");
	}
	
	
	
	public String reverseWord(String s) {
		
		String[] arr = s.trim().split("\\s+");
		int left = 0, right = arr.length-1;
		while(left < right) {
			String temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		
		return String.join(" ", arr);
		
	}
	
	

}
