package dsapractice;

import org.junit.Assert;
import org.junit.Test;

public class LC_2645_MinimumAdditionsToMakeValidString {
	
	/*
	 * Given a string word to which you can insert letters "a", "b" or "c" anywhere and any number of times, 
	 * return the minimum number of letters that must be inserted so that word becomes valid.
     *A string is called valid if it can be formed by concatenating the string "abc" several times.
	 * 
	 *
     *
     *Input - String
     *Output - Int
     *
     * 
     * 5)Pseudo code 
     * -> Initialize variable to track the count
     * ->iterate using while loop
     *   ->initially count =0
     *   ->char ==a increase count n i
     *   ->i <word length & char =b increase the same
     *    ->i <word length & char =c increase the same
     * -> ans + 3- count
     * ->return ans
     * 
     * 
     * Time Complexity - O(n)

	 */
	@Test
	public void test1() {
		int test1 = addMinimum("b");
		Assert.assertEquals(test1, 2);
	}
	
	
	@Test
	public void test2() {
		int test1 = addMinimum("aaa");
		Assert.assertEquals(test1, 6);
	}
	
	
	@Test
	public void test3() {
		int test1 = addMinimum("abc");
		Assert.assertEquals(test1, 0);
	}
	
	public int addMinimum(String word) {
        int n = word.length(); 
        		int i = 0;
        		int ans = 0;
        
        while(i < n) {
            int count = 0;
            
            if(word.charAt(i) == 'a') {
                count++;
                i++;
            }
             
            if(i < n && word.charAt(i) == 'b') {
                count++;
                i++;
            }
            
            if(i < n && word.charAt(i) == 'c') {
                count++;
                i++;
            }
            
            ans += 3 - count;
        }
        return ans;
	}

}
