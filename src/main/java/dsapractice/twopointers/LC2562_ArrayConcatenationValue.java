package dsapractice.twopointers;

import org.junit.Assert;
import org.junit.Test;

public class LC2562_ArrayConcatenationValue {
	
	/*
	 * You are given a 0-indexed integer array nums.
     *The concatenation of two numbers is the number formed by concatenating their numerals.
     *For example, the concatenation of 15, 49 is 1549.
     *The concatenation value of nums is initially equal to 0. Perform this operation until nums becomes empty:
     *If there exists more than one number in nums, pick the first element and last element in nums respectively and add the value of their concatenation to the concatenation value of nums, 
     *then delete the first and last element from nums.
     *If one element exists, add its value to the concatenation value of nums, then delete it.
     *Return the concatenation value of the nums.
     *
     *
     *
     *Input - int[]
     *Output - int
     * 
     * 5.Pseudo code 
     * ->Initialize right, left, count variables
     * ->iterate using while loop
     *   ->convert nums[left] and nums[left] to string
     *   ->then add the 2 string
     *   ->add to count after convert to integer
     * ->increase left & decrease right
     * ->if length of array is odd number
     *  -> count += nums[left]
     * ->return count
     * 
     *
	 */
	
	@Test
	public void test1() {
		long test1 = findTheArrayConcValue(new int[] {7,52,2,4});
		Assert.assertEquals(test1, 596);
	}
	
	@Test
	public void test2() {
		long test1 = findTheArrayConcValue(new int[] {});
		Assert.assertEquals(test1, 0);
	}
	
	@Test
	public void test3() {
		long test1 = findTheArrayConcValue(new int[] {5, 10, 15, 20, 25});
		Assert.assertEquals(test1, 1560);
	}
	
	
	 // Time Complexity - 0(n)
     // Space Complexity - O(1)

	public long findTheArrayConcValue(int[] nums) {

		int left = 0, right = nums.length - 1; 
				long concatenation = 0;

		while (left < right) {
			String s1 = Integer.toString(nums[left]);
			String s2 = Integer.toString(nums[right]);
			String s3 = s1 + s2;
			concatenation += Integer.parseInt(s3);
			left++;
			right--;

		}

		if (nums.length % 2 != 0) {
			concatenation += nums[left];
		}

		return concatenation;
	}

}
