package dsapractice.slidingWindow;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class LC594_LongestHarmoniousSubsequence {
	/*
	 * We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
     *Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
     *A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.
     *
     *
     *
     *Input - int []
     *Output - int
     *
     *2. Test data set 
     * Test Data 1
     * Input : nums = [1,3,2,2,5,2,3,7]
     * Output : 5
     * 
     * Test Data 2
     * Input : nums = [1,2,3,4]
     * Output : 2
     * 
     * Test Data 3
     * Input : nums = [1,1,1,1]
     * Output : 0
     * 
     * 5.Pseudo code //1,3,2,2,5,2,3,7
     * ->Sort the array
     * ->Initialize 2 pointer left,right,max value
     * ->Iterate using while loop right until length
     * ->if right - left >1
     * ->increase left
     * ->if =1 return max
     * ->increase right
     * ->return max
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	@Test
	public void test1() {
		int test1 = longestHarmoniousSubsequence(new int[] {1,3,2,2,5,2,3,7});
		Assert.assertEquals(test1, 5);
	}
	
	@Test
	public void test2() {
		int test1 = longestHarmoniousSubsequence(new int[] {1,3,2,2,5,2,3,7});
		Assert.assertEquals(test1, 5);
	}
	
	@Test
	public void test3() {
		int test1 = longestHarmoniousSubsequence(new int[] {1,3,2,2,5,2,3,7});
		Assert.assertEquals(test1, 5);
	}
	
	
	public int longestHarmoniousSubsequence(int[] nums) {
		Arrays.sort(nums);

		int l = 0;
		int r = 1;

		int max = 0;

		while (r < nums.length) {
			while (nums[r] - nums[l] > 1) {
				l++;
			}
			if (nums[r] - nums[l] == 1) {
				max = Math.max(max, (r - l) + 1);

			}
			r++;
		}
		return max;

	}

}
