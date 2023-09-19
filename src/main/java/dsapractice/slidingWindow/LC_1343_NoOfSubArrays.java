package dsapractice.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class LC_1343_NoOfSubArrays {
	
	/*
	 * Given an array of integers arr and two integers k and threshold, 
	 * return the number of sub-arrays of size k and average greater than or equal to threshold.
	 * 
     *
     *Input - int[],int,int
     *Output - int
     *
     *5.Pseudo code
     *->initialize two variable to track the count & sum
     *->Iterate using for loop until k to get sum of current window sum
     *    ->calculate current window sum
     *->iterate using for loop until arr length 
     *   ->if window sum is >= k*threshold
     *   ->increment the count
     * if i<arr.length
     *  ->windowsum = windowsum-arr[i-k]+arr[i]  
     * return count
     * 
     * 
     * Time Complexity - O(n)
     * Space Complexity -O(1)

	 */
	
	@Test
	public void test1() {
		int test1 = subArray(new int[] {2,2,2,2,5,5,5,8}, 3, 4);
		Assert.assertEquals(test1, 3);
		
		
	}
	
	@Test
	public void test2() {
		int test1 = subArray(new int[] {11,13,17,23,29,31,7,5,2,3}, 3, 5);
		Assert.assertEquals(test1, 6);
		
		
	}
	
	public int subArray(int[] arr, int k, int t) {
		
		int count =0;
		int currentWindowSum=0;
		
		for (int i=0;i<k;i++) {
			currentWindowSum += arr[i];
		}
		
		for(int i =k;i<=arr.length;i++) {
		int average = currentWindowSum/k; 
		if(average>=t) {
				count++;
		}
			
			if(i<arr.length) {
				currentWindowSum = currentWindowSum - arr[i - k] + arr[i];
	        }
		}
		
		
		return count;
	}
	
	


}
