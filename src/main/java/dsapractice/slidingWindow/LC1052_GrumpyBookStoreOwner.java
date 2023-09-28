package dsapractice.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class LC1052_GrumpyBookStoreOwner {
	
	/*
	 * There is a bookstore owner that has a store open for n minutes. Every minute, some number of customers enter the store. You are given an integer array customers of length n where customers[i] is the number of the customer that enters the store at the start of the ith minute and all those customers leave after the end of that minute.
     *On some minutes, the bookstore owner is grumpy. You are given a binary array grumpy where grumpy[i] is 1 if the bookstore owner is grumpy during the ith minute, and is 0 otherwise.
     *When the bookstore owner is grumpy, the customers of that minute are not satisfied, otherwise, they are satisfied.
     *The bookstore owner knows a secret technique to keep themselves not grumpy for minutes consecutive minutes, but can only use it once.
     *Return the maximum number of customers that can be satisfied throughout the day.
     *
     *
     *Input - int[], int[], int
     *Output - int
     *
     *2. Test data set - 
     * Test Data 1
     * Input : customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3
     * Output : 16
     * 
     * Test Data 2
     * Input : customers = [1], grumpy = [0], minutes = 1
     * Output : 1
     * 
     * 
     * 
     * 5.Pseudo code 
     * ->Initialize satisfied customer
     * ->Iterate until length of the customer
     *    ->if grumpy is 0 add to satisfied customer variable
     * ->Iterate until length to get calculate additional satisfied customer
     *   ->intialize current window sum,max satisfied ,right and left variables
     *   ->if grumpy of right is 1 add to current window
     *   ->increase the right
     *  ->left - rght is more than mins
     *    ->if customer was grumpy reduce from current window and left ++
     *  ->to calulate max satisfied cutomer ->if current customer > max satisfied customer
     *   ->assign to max satisfied customer
     * -> return satisfied customer + max satisfied customer
     *
     * 
     * Time Complexity - O(n)
     * Space Complexity - O(1)



	 */
	
	@Test
	public void test1() {
		int test1 = maxSatisfied(new int[] {1,0,1,2,1,1,7,5}, new int[] {0,1,0,1,0,1,0,1}, 3);
		Assert.assertEquals(test1, 16);
	}
	
	
	@Test
	public void test2() {
		int test1 = maxSatisfied(new int[] {1}, new int[] {0}, 1);
		Assert.assertEquals(test1, 1);
	}
	
	
	
	public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
		   int n = customers.length;
		    int satisfiedCustomers = 0;

		  
		    for (int i = 0; i < n; i++) {
		        if (grumpy[i] == 0) {
		            satisfiedCustomers += customers[i];
		        }
		    }

		   
		    int maxAdditionalCustomers = 0;
		    int currentAdditionalCustomers = 0;
		    int left = 0;
		    
		    for (int right = 0; right < n; right++) {
		        if (grumpy[right] == 1) {
		            currentAdditionalCustomers += customers[right];
		        }

		        if (right - left + 1 > minutes) {
		            if (grumpy[left] == 1) {
		                currentAdditionalCustomers -= customers[left];
		            }
		            left++;
		        }

		        maxAdditionalCustomers = Math.max(maxAdditionalCustomers, currentAdditionalCustomers);
		    }

		    return satisfiedCustomers + maxAdditionalCustomers;
		    
	}
	
}
