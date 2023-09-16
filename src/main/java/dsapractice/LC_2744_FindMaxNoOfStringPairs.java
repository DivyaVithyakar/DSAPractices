package dsapractice;

import org.junit.Assert;
import org.junit.Test;

public class LC_2744_FindMaxNoOfStringPairs {
	
	/*
	 * You are given a 0-indexed array words consisting of distinct strings.
     *The string words[i] can be paired with the string words[j] if:
     *The string words[i] is equal to the reversed string of words[j].
     *0 <= i < j < words.length.
     *Return the maximum number of pairs that can be formed from the array words.
     *Note that each string can belong in at most one pair.
     *
     *
     *
     *Input - sting[]
     *Output - int
     *
     * 5)Pseudo code 
     * ->Intialize variable to track output count
     *->Iterate using for loop untill length
     *->another for loop for comparision(i+1)
     *->check words[i]and charAt of 0 == words[j] and charAt of 1 && words[i]and charAt of 1 == words[j] and charAt of 0
     *->count++
     *->return count
     *
     * 
     * Time Complexity - O(n)
     * 

	 */
	
	@Test
	public void test1() {
		int test1 = maximumNumberOfStringPairs(new String[] {"cd","ac","dc","ca","zz"});
		Assert.assertEquals(test1, 2);
		
	}
	
	
	 public int maximumNumberOfStringPairs(String[] words) {
         int ans = 0;
     for (int i = 0; i < words.length; i ++) {
         for(int j = i + 1; j < words.length; j ++) 
             if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0))
             ans ++;
     }  
     return ans;
   }

}
