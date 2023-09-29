package dsapractice.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class LC_541_ReverseStringII {
	
	/*
	 * Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
     *If there are fewer than k characters left, reverse all of them. 
     *If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
     *
     * 1. Did I understand the problem?  - YES 2 MINS
     *
     *Input - String , int
     *Output - String
     *
     *2. Test data set - 3 MINS
     * Test Data 1
     * Input : s = "abcdefg", k = 2
     * Output : "bacdfeg"
     * 
     * Test Data 2
     * Input : s = "abcd", k = 2
     * Output : "bacd"
     *
     * 5.Pseudo code 
     * ->Create char array
     * ->Iterate from start point untile end of thr string length increase 2*k
     * -> start is i,end id start+k-1 until n-1
     * ->iterate using while loop start < end
     *   ->char temp is initially at strat
     *   ->swap into end point
     *   ->now temp is in end point
     * ->increase start
     * ->decrease end
     * ->return char array into string
     * 
     * 
     * 
     * Time Complexity - O(n)
     * Space Complexity -O(n)


 
	 */
	@Test
	public void test1() {
		String test1 = reverseStringII("abcdefg", 2);
		Assert.assertEquals(test1, "bacdfeg");
	}
	
	@Test
	public void test2() {
		String test1 = reverseStringII("abcd", 2);
		Assert.assertEquals(test1, "bacd");
	}
	
	public String reverseStringII(String s, int k) {
		char[] result = s.toCharArray();
		int n = result.length;
		for(int i = 0;i < n;i += 2 * k) {
			int start = i;
			int end = Math.min(start+k-1, n-1);
			while(start < end) {
				char temp = result[start];
				result[start]=result[end];
				result[end]=temp;
				start++;
				end--;
			}
			
		}
	
		return new String(result);
		
	}
	

}
