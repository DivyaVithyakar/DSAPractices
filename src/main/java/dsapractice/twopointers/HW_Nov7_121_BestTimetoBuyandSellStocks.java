package dsapractice.twopointers;

import org.junit.Assert;
import org.junit.Test;

public class HW_Nov7_121_BestTimetoBuyandSellStocks {
	
	/*
	 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     *You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     *Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     *
     *
     *
     *Pseudo Code
     *->Intialize 3 pointer left,right and max
     *->Iterate using while loop
     *  ->right until length of price
     *  ->if left is greater than right
     *  ->left = right
     *  ->else max is max, right -left
     *  ->increament right
     * ->return max

     


	 */
	@Test
	public void test1() {
		int test1 = maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });
		Assert.assertEquals(5, test1);
	}

	 public int maxProfit(int[] prices) {
	       
	        int left = 0, right = 1,max = 0;
	        while(right < prices.length){
	            if(prices[left] > prices[right]){
	                left = right;
	            }else if(prices[left] < prices[right]){
	                max = Math.max(max,(prices[right] - prices[left]));
	            }
	            right++;
	        }
	        return max;
	    }
	

}
