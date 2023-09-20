package dsapractice.BruteForce;

import org.junit.Test;
import org.testng.Assert;

public class LC1358_NoOfSubStringsAllThreeChars {
	
	/*
	 * Given a string s consisting only of characters a, b and c.
     *Return the number of substrings containing at least one occurrence of all these characters a, b and c.
     *
     *
     *
     *Input - String
     *Output - int
     *
     * 5.Pseudo code 
     * ->initialize variable to track the count
     * ->Iterate using for loop from 0 to length
     *   ->iterate anothe for loop from i+1 to length
     *      ->if substring contains a,b,c increase count
     * ->retrun count
     *  
     * 
     * Time Complexity - O(n)
     * Space Complexity -O(1)



 
	 */
	@Test
	public void test1() {
		int test1 = numberOfSubstring("abcabcabc");
		Assert.assertEquals(test1, 28);
	}
	
	@Test
	public void test2() {
		int test1 = numberOfSubstring("abc");
		Assert.assertEquals(test1, 1);
	}
	
	@Test
	public void test3() {
		int test1 = numberOfSubstring("");
		Assert.assertEquals(test1, 0);
	}
	
	//Time Complexity - O(n^3)
    //Space Complexity -O(1)

	
	public static int numberOfSubstring(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                String substring = s.substring(i, j + 1);
                if (substring.contains("a") && substring.contains("b") && substring.contains("c")) {
                    count++;
                }
            }
        }

        return count;
	}

}
