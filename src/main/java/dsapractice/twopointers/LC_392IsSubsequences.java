package dsapractice.twopointers;

import org.junit.Assert;
import org.junit.Test;

public class LC_392IsSubsequences {
	
/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. 
 *(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 *    *1. Did I understand the problem?  - YES - 3 MINS
     *
     *Input - String, String
     *Output - Boolean
     *
     *2. Test data set - YES 5 MINS
     * Test Data 1
     * Input :s = "ace", t = "abcde"
     * Output : true
     * 
     * Test Data 2
     * Input : s = "aec" t ="abcde"
     * Output : False
     * 
     * Test Data 3
     * Input : s ="a" , t ="a"
     * Output : true
     * 
     *3.Do you know the Solution? - YES
     * 
     *4.Do you have any alternate approaches? (Thing of alternate approaches) -NO
     * 
     * 5.Pseudo code - 5 MINS
     * ->Initialize string1 and string2 pointer 
     * ->Iterate using while loop string1 until s.length & string2 until t.length
     *   ->if char of s is = char of t
     *   ->increase string1
     * ->increase string2
     * ->return if left = s.length
     *   
     * 
     * 6. Dry run the pseudo code with all test data - YES
     * 
     * 7.Write the code on notepad - NO
     * 
     * 8. Dry run the code with all test data  - YES
     * 
     * 9. Write code on IDE -YES - 5 MINS
     * 
     * 10. Test the code + Debug the code 
     * 
     * 11. Check for any gaps of code optimization
     * 
     * Time Complexity - O(n+m)
     * Space Complexity -O(1)


 */
	@Test
	public void test1() {
		boolean test1 = isSubsequences("ace", "abcde");
		Assert.assertEquals(test1, true);
		
	}
	
	@Test
	public void test2() {
		boolean test1 = isSubsequences("aec", "abcde");
		Assert.assertEquals(test1, false);
		
	}
	
	
	@Test
	public void test3() {
		boolean test1 = isSubsequences("a", "a");
		Assert.assertEquals(test1, true);
		
	}
	
	
	public boolean isSubsequences(String s, String t) {
		int spointer = 0, tpointer = 0;
		while(spointer < s.length() && tpointer < t.length()) {
			if(s.charAt(spointer) == t.charAt(tpointer))
				spointer++;
			   tpointer++;
		}
		return spointer == s.length();
		
	}

}
