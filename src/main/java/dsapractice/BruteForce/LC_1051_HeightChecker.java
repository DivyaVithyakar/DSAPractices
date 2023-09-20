package dsapractice.BruteForce;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class LC_1051_HeightChecker {
	
	/*
	 * A school is trying to take an annual photo of all the students. 
	 * The students are asked to stand in a single file line in non-decreasing order by height. 
	 * Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
     *You are given an integer array heights representing the current order that the students are standing in. 
     *Each heights[i] is the height of the ith student in line (0-indexed).
     *Return the number of indices where heights[i] != expected[i].
     *
     *
     *Input - int[]
     *Output - int
     *
     *Pseudo code 
     *->Initialize count to track  
     *->Itreate using for loop until length for int[]
     *  ->Check heights of length and arr og length is same
     * -> sort the input array
     * -> iterate until length
     *    ->check if both are not equal
     *    ->increase the count
     * ->return count
     *
	 * Time Complexity - O(nlog(n))
     *


	 */
	@Test
	public void test1() {
		int test1 = heightChecks(new int[] {1, 2, 3, 4, 5});
		Assert.assertEquals(test1, 0);
	}
	
	
	@Test
	public void test2() {
		int test1 = heightChecks(new int[] {5,1,2,3,4});
		Assert.assertEquals(test1, 5);
	}
	
	
	
	@Test
	public void test3() {
		int test3 = heightChecks(new int[] {});
		Assert.assertEquals(test3, 0);
	}
	
	public int heightChecks(int[] heights) {
		 int count =0;
	        int[] arr = new int[heights.length];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=heights[i];
	        }
	        Arrays.sort(heights);
	        for(int i=0;i<heights.length;i++){
	            if(heights[i]!=arr[i]){
	                count++;
	            }
	    
	        }

	 return count;
		
	}

}
