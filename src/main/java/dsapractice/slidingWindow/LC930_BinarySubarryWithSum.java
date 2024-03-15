package dsapractice.slidingWindow;

public class LC930_BinarySubarryWithSum {
	
	/*
	 * Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
	 * A subarray is a contiguous part of the array.
	 */
	
	
	public int numSubarraysWithSum(int[] nums, int goal) {
        int i = 0, count = 0, res = 0;
       for (int j = 0; j < nums.length; ++j) {
           if (nums[j] == 1) {
               goal--;
               count = 0;
           }
           
           while (goal == 0 && i <= j) {
               goal += nums[i];
               i++;
               count++;
               if (i > j - goal + 1)
                   break;
           }
           
           while (goal < 0) {
               goal += nums[i];
               i++;
           }
           
           res += count;
       }
       return res; 
   }

}
