package dsapractice.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class LC2269_kBeautyOfNumber {
	
	/*
	 * The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:
     *It has a length of k.
     *It is a divisor of num.
     *Given integers num and k, return the k-beauty of num.
     *Note:
     *Leading zeros are allowed.
     *0 is not a divisor of any value.
     *A substring is a contiguous sequence of characters in a string.
     *
     *
     *Input - int, int
     *Output - int
     *
     * 
     * 5.Pseudo code 
     * ->convert num to string
     * ->initialize right,left,o/p variables
     * ->Iterate using while loop
     *   ->Append the character in temp
     *   ->if length right - left + 1 ==k
     *   ->store to temp & convert temp to an integer
     *   -> if n!=0 & num % n == 0
     *   ->increase o/p
     * ->Remove the leftmost character from temp -> substring starting from the second character 
     *    ->increase left
     *  ->right++
     *  ->return o/p
     * 
     * 
     * Time Complexity - O(n)
     * Space Complexity - O(1)


     *


	 */
	
	@Test
	public void test1() {
		int test1 = divisorSubstrings(240, 2);
		Assert.assertEquals(test1, 2);
	}
	
	@Test
	public void test2() {
		int test1 = divisorSubstrings(430043, 2);
		Assert.assertEquals(test1, 2);
	}
	
	@Test
	public void test3() {
		int test1 = divisorSubstrings(12345, 0);
		Assert.assertEquals(test1, 0);
	}
	
	
	public int divisorSubstrings(int num, int k) {

		String s = num + "";

		int left = 0, right = 0, result = 0;
		String temp = "";

		while (right < s.length()) {

			temp += s.charAt(right);
			if (right - left + 1 == k) {
				int n = Integer.parseInt(temp);
				if (n != 0 && num % n == 0) {
					result++;
				}
				temp = temp.substring(1);
				left++;
			}
			right++;
		}
		return result;
	}

}
