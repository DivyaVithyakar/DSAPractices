package dsapractice.twopointers;

import org.junit.Assert;
import org.junit.Test;

public class LC922_SortArrayByParityII {
	
	/*
	 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
     *Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
     *Return any answer array that satisfies this condition.
     *
     *
     *Input - int[]
     *Output - int[]
     *
     * 
     * 5.Pseudo code
     * ->Initialize 2 pointers for odd and even
     * ->Iterate using while loop -> evenPointer < n and oddPointer < n
     *    ->if odd < even
     *    ->swap the elements
     *    -if it is odd
     *    ->odd +=2
     *    ->if even 
     *    ->even += 2
     * ->return nums
     *    
     * 
     * Time Complexity - O(n)
     * Space Complexity -O(1)


	 */
	@Test
	public void test1() {
		int[] test1 = sortArrayByParityII(new int[] {4, 2, 5, 7});
		int[] expected = {4, 5, 2, 7};
		Assert.assertArrayEquals(test1, expected);
		
	}
	

	
	@Test
	public void test3() {
		int[] test1 = sortArrayByParityII(new int[] {2, 1});
		int[] expected = {2, 1};
		Assert.assertArrayEquals(test1, expected);
		
	}
	
	
	public int[] sortArrayByParityII(int[] nums) {
		int odd = 1, even = 0;
        while(odd < nums.length && even < nums.length){
            if (nums[odd] % 2 < nums[even] % 2){
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
            }
            if (nums[odd] % 2 == 1)
                odd = odd + 2;
            if (nums[even] % 2 == 0)
                even = even + 2;
        }
        return nums;
	}

}
