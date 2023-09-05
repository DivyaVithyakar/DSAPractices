package dsapractice;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LC2828_AcronymWords {
	
	/*
	 * Given an array of strings words and a string s, determine if s is an acronym of words.

      *The string s is considered an acronym of words if it can be formed by concatenating the first character of each string in words in order. 
      *For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].
      *Return true if s is an acronym of words, and false otherwise.
      *
      *Input - list of Sting , String
      *Output - Boolean
      *
      *2) Test data set 
      *Test Data 1:
      *Input - ["i" "love" "programming"] s="ilp"
      *Output - true
      *
      *Test Data 2:
      *Input -["apple" "banana" "cherry"] s="ab"
      *Output - False
      *
      *Test Data 3:
      * Input -  List: ["open", "ai"]
      * String: "oai"
      * Output - False
      * 
      * 
      * Pseudo code 
      * 
      * return false when length of string is not equals to list length
      * ->Iterate using for loop until length of words
      *    ->check the charAt(0) == word.charAt(i)
      *    ->return true 
      *
	  * 
	  * Time Complexity - O(n)
	  *
	 */
	@Test
	public void test1() {
		List<String> testdata1 = Arrays.asList("apple", "banana" ,"cherry");
		boolean acronym = isAcronym(testdata1, "abc");
		Assert.assertEquals(true, acronym);
		
	}
	
	@Test
	public void test2() {
		List<String> testdata2 = Arrays.asList("i", "love" ,"programming");
		boolean acronym1 = isAcronym(testdata2, "ilp");
		Assert.assertEquals(true, acronym1);
		
	}
	
	@Test
	public void test3() {
		List<String> testdata3 = Arrays.asList("open", "ai");
		boolean acronym2 = isAcronymWords(testdata3, "oai");
		Assert.assertEquals(false, acronym2);
		
	}
	
	public boolean isAcronym(List<String> words, String s) {
		
		if(words.size()!=s.length()) return false;
		
		StringBuilder input = new StringBuilder();
		
		for (String word : words) {
			input.append(word.charAt(0));
			
		}
		
		return input.toString().equals(s);
	}
	
	
	public boolean isAcronymWords(List<String> words,String s) {
		if(words.size()!=s.length()) return false;
		int s1 =0;
		for (String word : words) {
			if(word.charAt(0) == s.charAt(s1)) {
				s1++;
			}else return false;
			
		}
		return true;
		
	}

}
