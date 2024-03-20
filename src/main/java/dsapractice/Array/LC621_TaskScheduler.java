package dsapractice.Array;

import java.util.Arrays;

public class LC621_TaskScheduler {
	/*
	 * You are given an array of CPU tasks, each represented by letters A to Z, and a cooling time, n. 
	 * Each cycle or interval allows the completion of one task. 
	 * Tasks can be completed in any order, but there's a constraint: 
	 * identical tasks must be separated by at least n intervals due to cooling time.
	 * ​Return the minimum number of intervals required to complete all tasks.


	 */
	
	public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
       for (char task : tasks) {
           freq[task - 'A']++;
       }
       Arrays.sort(freq);
       int chunk = freq[25] - 1;
       int idle = chunk * n;

       for (int i = 24; i >= 0; i--) {
           idle -= Math.min(chunk, freq[i]);
       }

       return idle < 0 ? tasks.length : tasks.length + idle;
   }

}
