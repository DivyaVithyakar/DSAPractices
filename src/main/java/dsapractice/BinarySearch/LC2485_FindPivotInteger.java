package dsapractice.BinarySearch;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC2485_FindPivotInteger {
	
	/*
	 * Given a positive integer n, find the pivot integer x such that:
	 * The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
	 * Return the pivot integer x. 
	 * If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.
	 */
	
	@Test
	public void test() {
		int pivotInteger = pivotInteger(8);
		Assert.assertEquals(pivotInteger, 6);
	}
	
	public int pivotInteger(int n) {
		int leftSum = 0;
		int rightSum = 0;

		for (int i = 1; i <= n; i++) {
			leftSum = i * (i + 1) / 2;
			rightSum = n * (n + 1) / 2 - i * (i - 1) / 2;

			if (leftSum == rightSum)
				return i;
		}

		return -1;
	}

}
