package dsapractice.Array;

public class LC238_productOfArrayExceptSelf {
	/*
	 * Given an integer array nums, return an array answer such that answer[i] 
	 * is equal to the product of all the elements of nums except nums[i].
	 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
	 * You must write an algorithm that runs in O(n) time and without using the division operation.
	 */
	
	
	 public int[] productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];
	        
	        // Calculate left products and store them in result array
	        result[0] = 1;
	        for (int i = 1; i < n; i++) {
	            result[i] = result[i - 1] * nums[i - 1];
	        }
	        
	        // Calculate right products and update result array with final result
	        int rightProduct = 1;
	        for (int i = n - 1; i >= 0; i--) {
	            result[i] *= rightProduct;
	            rightProduct *= nums[i];
	        }
	        
	        return result; 
	    }

}
