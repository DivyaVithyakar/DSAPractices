package dsapractice.Array;

import java.util.Arrays;

public class LC_2966_DivideArrayWithMaxDifference {
	
	
	/*
	 * You are given an integer array nums of size n and a positive integer k.
     *Divide the array into one or more arrays of size 3 satisfying the following conditions:
     *Each element of nums should be in exactly one array.
     *The difference between any two elements in one array is less than or equal to k.
     *Return a 2D array containing all the arrays. 
     *If it is impossible to satisfy the conditions, return an empty array. And if there are multiple answers, return any of them.
     *
     *
     *Input - int[], int
     *Output - List[][]
     *
     *Test Data
     *Input - nums = [1,3,4,8,7,9,3,5,1], k = 2
     *Output - [[1,1,3],[3,4,5],[7,8,9]]
     *
     *Input - nums = [1,3,3,2,7,3], k = 3
     *Output - []
     *
     *
     *
	 */
	
	   public int[][] divideArray(int[] nums, int k) {
	          Arrays.sort(nums);
	        int[][] result = new int[0][0];
	        
	        for (int i = 0; i + 2 < nums.length; ++i) {
	            if (i % 3 == 0) {
	                if (nums[i + 2] - nums[i] <= k) {
	                    int[] triplet = {nums[i], nums[i + 1], nums[i + 2]};
	                    result = Arrays.copyOf(result, result.length + 1);
	                    result[result.length - 1] = triplet;
	                } else {
	                    return new int[0][0];
	                }
	            }
	        }
	        
	        return result;
	    }
}
