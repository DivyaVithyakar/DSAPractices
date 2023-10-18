package dsapractice.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LC933_NumberOfRecentCells {
	
	/*
	 * You have a RecentCounter class which counts the number of recent requests within a certain time frame.
     *Implement the RecentCounter class:
     *RecentCounter() Initializes the counter with zero recent requests.
     *int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, 
     *and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). 
     *Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
     *It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
     *
     *
     *2. Test data set 
     * Test Data 1
     * Input : ["RecentCounter", "ping", "ping", "ping", "ping"]
     *[[], [1], [100], [3001], [3002]]   
     * Output : [null, 1, 2, 3, 3]
     * 
     *
     * 
     * Time Complexity - 
     * Space Complexity -


 
	 */
	
	Queue<Integer> queue;
    public void RecentCounter() {
         this.queue = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
         queue.add(t);
        while (queue.peek() < t - 3000) queue.remove();
        return queue.size();
    }


}
