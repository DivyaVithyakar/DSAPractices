package dsapractice.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class LC1206_UniqueNumberOfOccurences {
	/*
	 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
	 * 
     *
     *Input - int[]
     *Output -  boolean
     *
     * Test Data 1
     * Input : arr = [1,2,2,1,1,3]
     * Output : true
     * 
     * Test Data 2
     * Input : arr = [1,2]
     * Output : false
     * 
     * Test Data 3
     * Input : arr = [-3,0,1,-3,1,1,1,-3,10,0]
     * Output : true
     * 
     * Pseudo code 
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	@Test
	public void test1() {
		boolean test1 = uniqueOccurrences(new int[] {1,2,2,1,1,3});
		Assert.assertEquals(test1, true);
	}
	
	@Test
	public void test2() {
		boolean test1 = uniqueOccurrences(new int[] {1,2});
		Assert.assertEquals(test1, false);
	}
	
	@Test
	public void test3() {
		boolean test1 = uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0});
		Assert.assertEquals(test1, true);
	}
	
	public boolean uniqueOccurrences(int[] arr) {
		Arrays.sort(arr);
		Set<Integer> set = new HashSet<Integer>();
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				if (set.contains(count)) {
					return false;
				}
				set.add(count);
				count = 1;
			}
		}
		if (set.contains(count)) {
			return false;
		}
		return true;
	}

}
