package dsapractice.twopointers;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class LC2367_NumberOfArithmeticTriplets {
	
	/*
	 * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. 
	 * A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
     *i < j < k,
     *nums[j] - nums[i] == diff, and
     *nums[k] - nums[j] == diff.
     *Return the number of unique arithmetic triplets.
     *
     *
     *Input - int[], int
     *Output - int
     *
  
     * 5.Pseudo code 
     * ->initialize left,right,count variables
     * ->create set and add the elements
     * ->Iterate using while loop until left to right & left until length
     *   ->if nums[right]-nums[left] < diff -> increase right
     *   ->if nums[right]-nums[left]>diff -> increase left
     *   ->else if map contains nums[right]+diff
     *   ->increase count
     *   ->increase left, right
     * ->return count
     *

	 */
	
	@Test
	public void test1() {
		int test1 = arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3);
		Assert.assertEquals(test1, 2);
		
	}
	
	@Test
	public void test2() {
		int test1 = arithmeticTriplets(new int[] {4,5,6,7,8,9}, 2);
		Assert.assertEquals(test1, 2);
		
	}
	
	
	@Test
	public void test3() {
		int test1 = arithmeticTriplets(new int[] {1, 2, 3, 4, 5}, 0);
		Assert.assertEquals(test1, 4);
		
	}
	//Time Complexity - O(n)
    //Space Complexity -O(n)

	public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> triplets = new HashSet();
        for(int num: nums)
        	triplets.add(num);
        

       int left = 0,right = 1;
       int count = 0;
       while(left<=right && right<nums.length){

            if(nums[right]-nums[left] < diff)
                right++;
            else if(nums[right]-nums[left]>diff)
                left++;
            else{
                if(triplets.contains(nums[right]+diff))
                      count++;
                left++;
                right++;   
            }        
       }

    return count;

    }

	
	//Time Complexity - O(n^3)
    //Space Complexity -O(1)
	
	 public int arithmeticTripletsBF(int[] nums, int diff) {
		   int n = nums.length;
		    int count = 0;

		    for (int i = 0; i < n - 2; i++) {
		        for (int j = i + 1; j < n - 1; j++) {
		            for (int k = j + 1; k < n; k++) {
		                if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
		                    count++;
		                }
		            }
		        }
		    }

		    return count;
	 }

}
