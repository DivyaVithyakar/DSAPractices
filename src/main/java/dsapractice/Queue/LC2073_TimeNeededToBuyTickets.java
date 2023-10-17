package dsapractice.Queue;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;
import org.testng.Assert;

public class LC2073_TimeNeededToBuyTickets {
	
	/*
	 * There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.
     *You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].
     *Each person takes exactly 1 second to buy a ticket. 
     *A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. 
     *If a person does not have any tickets left to buy, the person will leave the line.
     *Return the time taken for the person at position k (0-indexed) to finish buying tickets.
     *
     *
     *
     *Input - int[], int
     *Output - int
     *
     *Test data set
     * Test Data 1
     * Input : tickets = [2,3,2], k = 2
     * Output : 6
     * 
     * Test Data 2
     * Input : tickets = [5,1,1,1], k = 0
     * Output : 8
     * 
     * Pseudo code 
     * ->Initialize Queue
     * ->Iterate using for loop and add it to queue
     * ->if queue is not empty
     *  ->remove from queue
     *  ->decrease it from ticket array and increment the ans
     * ->If ticket[] & index =k
     * ->return the answer
     * ->id its more than 0
     * ->add it to queue
     * ->return ans
     *  
     * 
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	@Test
	public void test1() {
		int test1 = timeRequiredToBuy(new int[] {2,3,2}, 2);
		Assert.assertEquals(test1, 6);
	}
	
	@Test
	public void test2() {
		int test1 = timeRequiredToBuy(new int[] {5,1,1,1}, 0);
		Assert.assertEquals(test1, 8);
	}
	
	
	
	public int timeRequiredToBuy(int[] tickets, int k) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int ans = 0;
		for (int i = 0; i < tickets.length; i++) {
			queue.add(i);
		}
		while (!queue.isEmpty()) {
			int idx = queue.poll();

			tickets[idx]--;
			ans++;
			if (tickets[idx] == 0 && idx == k) {
				return ans;
			}
			if (tickets[idx] > 0) {
				queue.add(idx);
			}
		}
		return ans;
	}

}
