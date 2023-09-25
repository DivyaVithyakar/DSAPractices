package dsapractice.twopointers;

import org.junit.Assert;
import org.junit.Test;

public class StringParanlindrome {
	/*
	 * Pesudo code
	 * ->Initialize left , right pointer
	 * ->Iterate using while loo
	 *   ->If both left, right char are not same return false
	 *   ->Increment left & Decrement right
	 * ->else return true
	 * 
	 * 
	 * Input : String
	 * Output : boolean
	 * 
	 * Test data
	 * Input : RADAR
	 * Output : True
	 * 
	 * Input : DIVYA
	 * Output : False
	 * 
	 * Input : aaa
	 * Output : true
	 */
	@Test
	public void test1() {
		boolean test1 = isParalidromebyExpandFromCenter("RADAR");
		Assert.assertEquals(test1, true);
		
	}
	
	@Test
	public void test2() {
		boolean test1 = isParalindrom("DIVYA");
		Assert.assertEquals(test1, false);
		
	}
	
	@Test
	public void test3() {
		boolean test1 = isParalindrom(" ");
		Assert.assertEquals(test1, true);
		
	}
	
	public boolean isParalindrom(String s) {
		
		int left = 0;
		int right = s.length()-1;
		
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		 
		return true;
	}
	
	
	public boolean isParalidromebyExpandFromCenter(String s) {
		int left = s.length()/2-1,right;
		if(s.length()%2==0) {
			right = s.length()/2;
		}else right = s.length()/2+1;
		
		while(right<s.length()) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left--;
			right++;
		}
		return true;
		
	}

}
