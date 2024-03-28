package dsapractice.slidingWindow;

public class LC713_SubArrayProductLessthanK {
	
	/*
	 * Given an array of integers nums and an integer k, 
	 * return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
	 */
	
	
	public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

       int left = 0, right = 0, product = 1, count = 0;
       int n = nums.length;

       while (right < n) {
           product *= nums[right];
           while (product >= k) product /= nums[left++];
           count += 1 + (right - left);
           right++;
       }

       return count;
   }

}
