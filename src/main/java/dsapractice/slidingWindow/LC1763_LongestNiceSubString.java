package dsapractice.slidingWindow;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class LC1763_LongestNiceSubString {
	
	/*
	 * A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. 
	 * For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.
     *Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. 
     *If there are none, return an empty string.
     *
     *
     *
     *Input - String
     *Output - String
     *
     * 
     * 5.Pseudo code 
     * ->Initialize an empty string result to store the o/p
     * ->Initialize an int maxLen to keep track of the max length
     * ->Iterate using for loop
     *    ->Initialize two empty sets for lowercase & uppercase
     *    ->Start another loop from j starts from i
     *    ->add the char as per uppercase or lower case
     *    ->if contains both letter it calls the fn -> maxlength j - i + 1
     * ->return result
     * 
     * ->The containsBoth function checks if both sets lowercase and uppercase contain corresponding lowercase and uppercase characters. 
     * ->If they do, it returns true; otherwise, it returns false.
     *    
     * 
     * 
     * Time Complexity - O(n^2) 
     * Space Complexity -O(n)


	 */
	@Test
	public void test1() {
		String test1 = longestNiceSubstring("YazaAay");
		Assert.assertEquals(test1, "aAa");
	}
	
	@Test
	public void test2() {
		String test1 = longestNiceSubstring("Bb");
		Assert.assertEquals(test1, "Bb");
	}
	
	@Test
	public void test3() {
		String test1 = longestNiceSubstring("c");
		Assert.assertEquals(test1, "");
	}
	
	
	public String longestNiceSubstring(String s) {
		String result = "";
		int maxLength = 0;

		for (int i = 0; i < s.length(); i++) {
			Set<Character> lowercase = new HashSet<Character>();
			Set<Character> uppercase = new HashSet<Character>();

			for (int j = i; j < s.length(); j++) {
				char c = s.charAt(j);

				if (Character.isLowerCase(c)) {
					lowercase.add(c);
				} else {
					uppercase.add(c);
				}

				if (containsBoth(lowercase, uppercase) && j - i + 1 > maxLength) {
					maxLength = j - i + 1;
					result = s.substring(i, j + 1);
				}
			}
		}

		return result;
	}

	public static boolean containsBoth(Set<Character> lowercase, Set<Character> uppercase) {
		for (char c : lowercase) {
			char upper = Character.toUpperCase(c);
			if (!uppercase.contains(upper)) {
				return false;
			}
		}

		for (char c : uppercase) {
			char lower = Character.toLowerCase(c);
			if (!lowercase.contains(lower)) {
				return false;
			}
		}

		return true;

	}

}
