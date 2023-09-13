package dsapractice;

import org.junit.Assert;
import org.junit.Test;

public class LC_1528_ShuffleString {
	
	/*
	 * You are given a string s and an integer array indices of the same length. 
	 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
     *Return the shuffled string.
	 * 
	 *
     *
     *Input - String , int[]
     *Output - String
     *
     *5)Pseudo code -
     * -> Create char[] until length of the int[]
     * ->Iterate using for loop until length of int[]
     *   ->assign to char [] of int[] = string char
     * -> return char [] to the value of String
     *
     * 
     * Time Complexity - O(n)

	 */
	
	@Test
	public void test1() {
		String test1 = shuffleString("codeleet", new int[] {4,5,6,7,0,2,1,3});
		Assert.assertEquals("leetcode", test1);
	}
	
	
	@Test
	public void test2() {
		String test1 = shuffleString("abcde", new int[] {0,1,2,3,4});
		Assert.assertEquals("abcde", test1);
	}
	
	
	@Test
	public void test3() {
		String test1 = shuffleString("", new int[] {});
		Assert.assertEquals("", test1);
	}
	
	
	
	
	public String shuffleString(String s, int[] indices) {
		char[] shuffle = new char[indices.length];
		
		for(int i=0;i<indices.length;i++) {
			shuffle[indices[i]]=s.charAt(i);
		}
		return new String(shuffle);
	}

}
