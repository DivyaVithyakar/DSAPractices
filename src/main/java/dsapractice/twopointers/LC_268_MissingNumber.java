package dsapractice.twopointers;

import java.util.Arrays;

public class LC_268_MissingNumber {
	/*
	 * 
	 *  * Given an array nums containing n distinct numbers in the range [0, n],
	 *  return the only number in the range that is missing from the array.
	 *
	 *  Input - int[]
	 *  Output - int
	 *  
	 *  Pseudo Code
	 *  ->Sort the give int[]
	 *  ->intialize 2 pointers left & right
	 *  ->iterate until length of array
	 *    ->current element is nums[i]
	 *    ->actual is starts from 0
	 *    ->if current is != actual
	 *    ->return actual
	 * ->Increase left
	 * ->return left pointer variable
	 * 
	 * Time Complexity - O(n log n)
	 * Space Complexity - O(1)
	 *    
	 * 
	 */
	
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		
		int left =0;
		int right = nums.length;
		while(left<right) {
			int currentEle = nums[left];
			int actualEle = left;
			if(currentEle!=actualEle) {
				return actualEle;
			}
			left++;	
		}
		return left;
	}

}
