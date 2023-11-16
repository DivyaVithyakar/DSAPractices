package dsapractice.DivideAndConquer;

import org.junit.Assert;
import org.junit.Test;

public class LC169_MajorityElements {
	/*
	 * Given an array nums of size n, return the majority element.
     *The majority element is the element that appears more than ⌊n / 2⌋ times. 
     *You may assume that the majority element always exists in the array.
     *
     *
     *Input - int[]
     *Output - int
     *
     * Test Data 1
     * Input : nums = [3,2,3]
     * Output : 3
     * 
     * Test Data 2
     * Input : nums = [2,2,1,1,1,2,2]
     * Output : 2
     * 
     * 
     * Pseudo code
     * ->Initialize count is zero
     * ->Iterate the whole array 
     *   ->if count equals to 0
     *   ->answer is num
     *  ->count and num value equals to ans return 1 else return -1
     * ->return the answer
     * 
     * 
     * Time Complexity - 
     * Space Complexity -



	 */
	@Test
	public void test1() {
		int test1 = majorityElement(new int[] {3,2,3});
		Assert.assertEquals(test1, 3);
	}
	
	@Test
	public void test2() {
		int test1 = majorityElement(new int[] {2,2,1,1,1,2,2});
		Assert.assertEquals(test1, 2);
	}
	
	public int majorityElement(int[] nums) {

		int major = 0, count = 0;
	    for(int num : nums){
	        if(count == 0){
	            major = num;
	            count++;
	        }
	        else if(major == num) count++;
	        else count--;
	    }
	    return major;
	    

	}

}
