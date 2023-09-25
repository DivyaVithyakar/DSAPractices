package dsapractice.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class LC2379_KConsecutiveBlackBlocks {
	/*
	 * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. 
	 *The characters 'W' and 'B' denote the colors white and black, respectively.
     *You are also given an integer k, which is the desired number of consecutive black blocks.
     *In one operation, you can recolor a white block such that it becomes a black block.
     *Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
	 * 
	 * 
	 *
     *
     *Input - String, int
     *Output - int
     *
     *2. Test data set - 5 MINS
     * Test Data 1
     * Input : blocks = "WBBWWBBWBW", k = 7
     * Output : 3
     * 
     * Test Data 2
     * Input :blocks = "WBWBBBW", k = 2
     * Output : 0
     * 
     * Test Data 3
     * Input :Input: blocks = "BBBBBBB", k = 3
     * Output : 0
     * 
     * 
     * 5.Pseudo code 
     * ->Initialize start,end,current window count,result
     * ->Iterate using while loop until length
     *   ->If the block char is equal to "W"
     *   ->Increase the current count
     *   ->if end - start < k
     *   ->increase end 
     *   ->else if start - end == k
     *   ->if count is less result ->assign count value to result
     *  ->If start block is == w
     *  ->decrease the count
     * ->Increase start & end pointer
     * ->return result
     *  
     * 
   

	 */
	
	@Test
	public void test1() {
		int test1 = minimumRecolors("WBBWWBBWBW", 7);
		Assert.assertEquals(test1, 3);
	}
	
	@Test
	public void test2() {
		int test1 = minimumRecolors("WBWBBBW", 2);
		Assert.assertEquals(test1, 0);
	}
	
	@Test
	public void test3() {
		int test1 = minimumRecolors("BBBBBBB", 3);
		Assert.assertEquals(test1, 0);
	}
	
	  //Time Complexity - O(n)
	  //Space Complexity -O(1)
	
	 public int minimumRecolors(String blocks, int k) {
	        int start = 0;
	        int end = 0;
	        int result = Integer.MAX_VALUE;
	        int currentCount = 0;
	        while(end < blocks.length()) {
	            if(blocks.charAt(end) == 'W') {
	            	currentCount++;
	            }
	            if(end - start +1< k) {
	                end++;
	            }
	            else if (end - start+1== k) {
	            	if (currentCount < result) {
	            		result = currentCount;
	            	}
	                if(blocks.charAt(start) == 'W') {
	                	currentCount--;
	                }
	                start++;
	                end++;
	            }
	        }
	        return result; 
	    }
}
