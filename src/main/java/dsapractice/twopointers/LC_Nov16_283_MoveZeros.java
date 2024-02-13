package dsapractice.twopointers;

import org.junit.Assert;
import org.junit.Test;

public class LC_Nov16_283_MoveZeros {
	
	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *Note that you must do this in-place without making a copy of the array.
     *
     * *1. Did I understand the problem?  - YES 2 MINS
     *
     *Input - 
     *Output - int[]
     *
     *2. Test data set - 2 MINS
     * Test Data 1
     * Input : nums = [0,1,0,3,12]
     * Output : [1,3,12,0,0]
     * 
     * Test Data 2
     * Input :  nums = [0]
     * Output : [0]
     * 
     * Test Data 3
     * Input :
     * Output :
     * 
     *3.Do you know the Solution? - YES
     * 
     *4.Do you have any alternate approaches? (Thing of alternate approaches) -NO
     * 
     * 5.Pseudo code - 5 MINS
     * ->initialize left and right pointer as 0
     * ->Iterate using for loop until length of the array
     *   ->if right pointer is non zero
     *   ->create tmp variable to store right num
     *   ->swap right num for left num
     *   ->swap left num for num that we stored in tmp
     *   ->increment left pointer
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
     * Time Complexity - O(n)
     * Space Complexity -O(1)
	 */
	@Test
	public void test() {

		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		int[] expected = { 1, 3, 12, 0, 0 };
		Assert.assertArrayEquals(expected, nums);

	}

	public void moveZeroes(int[] nums) {
		int left = 0;
		int right = 0;
		while (right < nums.length) {
			if (nums[right] != 0) {
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left] = temp;
				right++;
				left++;

			} else {
				right++;
			}
		}

	}

}
