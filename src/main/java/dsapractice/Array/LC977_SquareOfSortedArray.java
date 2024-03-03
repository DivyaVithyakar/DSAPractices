package dsapractice.Array;

import java.util.Arrays;

public class LC977_SquareOfSortedArray {
	
	/*
	 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
	 * 
	 */
	
	public int[] sortedSquares(int[] nums) {
	       int[] t = new int[nums.length]; 
	        for (int i = 0; i < nums.length; i++) {
	            t[i] = nums[i] * nums[i];  
	        }
	        Arrays.sort(t); 
	        return t;   
	    }

}
