package dsapractice;

import org.junit.Assert;
import org.junit.Test;

public class LC541_ReverseString {
	
	/*
	 * Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
     *If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, 
     *then reverse the first k characters and leave the other as original.
     *
     *Input - String, String
     *Output - String
     *
     *Pseudo code
     *->initialize 2 variables to track the count 
     *->Iterate using for loop until length of s
     *  ->if k is less than count
     *  ->apeend to temp variable
     *  ->count ++
     *  -> if k is = count
     *  -> reverse the temp and store to response
     *  -> the set length to 0
     *  -> Set count to k+1 -> to skip the next character
     *  ->decrement the count -> to reprocess the skipped character in the next iteration.
     * -> If count is greater than 'k'.
     *   ->If 'cnt' is less than 'k'.
     *   ->Append the current character to the result StringBuilder 'res'.
     *   ->If 'cnt' is equal to 'k'
     *   ->reset the both counts
     *   ->Decrement the count
     *   
     * -> Reverse 'temp' if 'cnt' is still 0.
     * -> return the result
     * 
     * Time Complexity -O(n)
     *
     *
    
	 */
	@Test
	public void test1() {
		String test1 = reverseStr("abcdefg", 2);
		Assert.assertEquals(test1, "bacdfeg");
	}
	
	public String reverseStr(String s, int k) {
        StringBuilder response = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int count = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count < k) {
                temp.append(s.charAt(i));
                count++;
            } else if (count == k) {
                temp.reverse();
                response.append(temp);
                temp.setLength(0);
                count = k+1;
                i--;
            } else {
                if (cnt < k) {
                	response.append(s.charAt(i));
                    cnt++;
                } else {
                    count = 0;
                    cnt = 0;
                    i--;
                }
            }
        }
        
        if (cnt==0) temp.reverse();
        return response.toString() + temp;
	}

}
