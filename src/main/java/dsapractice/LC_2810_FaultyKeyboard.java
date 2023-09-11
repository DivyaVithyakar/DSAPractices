package dsapractice;

import org.junit.Assert;
import org.junit.Test;

public class LC_2810_FaultyKeyboard {
	
	/*
	 * Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. 
	 * Typing other characters works as expected.
     *You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
     *Return the final string that will be present on your laptop screen.
     *
     *
     *Input - String
     *Output - String
     *
     * Pseudo code 
     * ->initialize string builder to store the output
     * ->Iterate using for loop
     *   ->if s != i append to SB
     *   ->else reverse SB
     * -> return the sb after convert tosting
	 * 
	 * Time Complexity - O(n^2)  


	 */
	@Test
	public void test1() {
		String test1 = faultyKeyboard("string");
		Assert.assertEquals(test1, "rtsng");
	}
	
	@Test
	public void test2() {
		String test2 = faultyKeyboard("hello");
		Assert.assertEquals(test2, "hello");
	}
	
	
	@Test
	public void test3() {
		String test3 = faultyKeyboard("");
		Assert.assertEquals(test3, "");
	}
	
	
	
	public String faultyKeyboard(String s) {
		
		StringBuilder faultKB = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='i') {
				faultKB.append(s.charAt(i));
			}else {
				faultKB.reverse();
			}
		}
		
		return faultKB.toString();
	}


}
