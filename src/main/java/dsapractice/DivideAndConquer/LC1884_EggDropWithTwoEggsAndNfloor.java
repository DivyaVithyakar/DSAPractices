package dsapractice.DivideAndConquer;

import org.junit.Assert;
import org.junit.Test;

public class LC1884_EggDropWithTwoEggsAndNfloor {
	
	/*
	 * You are given two identical eggs and you have access to a building with n floors labeled from 1 to n.
     *You know that there exists a floor f where 0 <= f <= n such that any egg dropped at a floor higher than f will break, and any egg dropped at or below floor f will not break.
     *In each move, you may take an unbroken egg and drop it from any floor x (where 1 <= x <= n). 
     *If the egg breaks, you can no longer use it. However, if the egg does not break, you may reuse it in future moves.
     *Return the minimum number of moves that you need to determine with certainty what the value of f is.
     *
     *
     *Input -  int
     *Output -  int
     *
     *Test data set 
     * Test Data 1
     * Input : n = 2
     * Output : 2
     * 
     * Test Data 2
     * Input : n = 100
     * Output : 14
     * 
     * 
     * 
     * 
     * Time Complexity - 
     * Space Complexity -

     *
	 */
	
	@Test
	public void tes1() {
		int test1 = twoEggDrop(2);
		Assert.assertEquals(test1, 2);
	}
	
	@Test
	public void tes2() {
		int test1 = twoEggDrop(100);
		Assert.assertEquals(test1, 14);
	}
	
	public int twoEggDrop(int n) {
		int l = 0;
		int r = 50;

		while (l <= r) {
			int mid = (l + r) / 2;
			int lft = (mid * (mid + 1)) / 2;
			int right = ((mid + 1) * (mid + 2)) / 2;
			if (n > lft && n <= right)
				return mid + 1;
			else if (n <= lft) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}

		}
		return -1;
	}

}
