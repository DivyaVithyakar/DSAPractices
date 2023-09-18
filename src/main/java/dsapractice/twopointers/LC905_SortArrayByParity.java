package dsapractice.twopointers;

import org.junit.Assert;
import org.junit.Test;

public class LC905_SortArrayByParity {
	
	/*
	 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
     *Return any array that satisfies this condition.
     *
     *
     *Input - int[]
     *Output - int[]
     *
     * 
     * 5)Pseudo code 
     * ->intialize 2 pointers for left & right
     *    ->left =0
     *    ->right = nums.length
     * ->while left < right
     *   ->if left %2 ==0
     *   ->left++
     *   ->else swap the elements
     * -> right --
     * -> return nums
     *    
     



	 */
	@Test
	public void test1() {
	    int[] test1 = sortArrayByParity(new int[] {3,1,2,4});
	    //Assert.assertArrayEquals(test1, new int[] {2,4,3,1});
	    Assert.assertArrayEquals(test1, new int[] {4,2,1,3});
	}
	
    // Time Complexity - O(n) 
    //Space Complexity - O(1)
	
	public int[] sortArrayByParity(int[] nums) {
		
		int left = 0,right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 != 0) {
                right--;
            } else {
               
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right--] = temp;
                
                
            }
        }

        return nums;
	}


}
