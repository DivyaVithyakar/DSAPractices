package dsapractice.BruteForce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC241_PowerOfTwo {
	
	/*
	 * Given an integer n, return true if it is a power of two. Otherwise, return false.
     *An integer n is a power of two, if there exists an integer x such that n == 2x.
     *
     *Input: n = 1
     *Output: true
	 */
	
	@Test
	public void test1() {
		boolean powerOfTwo = powerOfTwo(16);
		Assert.assertEquals(powerOfTwo, true);
	}
	
	public boolean powerOfTwo(int n) {
		
		for(int i = 0; i < 31 ;i++) {
			int ans = (int) Math.pow(2, i);
			if(ans == n) {
				return true;
			}
		}
		return false;
	}

}
