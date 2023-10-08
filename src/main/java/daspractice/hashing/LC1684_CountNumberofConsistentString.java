package daspractice.hashing;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LC1684_CountNumberofConsistentString {
	
	/*
	 * You are given a string allowed consisting of distinct characters and an array of strings words. 
	 * A string is consistent if all characters in the string appear in the string allowed.
     *Return the number of consistent strings in the array words.
     *
     *Input - string, string[]
     *Output - int
     *
     *2. Test data set
     * Test Data 1
     * Input : allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
     * Output : 2
     * 
     * Test Data 2
     * Input : allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
     * Output : 7
     * 
     * Test Data 3
     * Input : allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
     * Output : 4
     * 
     * 5.Pseudo code 
     * ->Initialize hash set
     * ->Iterate the allowed string
     *  ->add it to set
     * ->iterate words array and allowed string
     *   -> if allowed string doesn't contain in set
     *    ->reduce from temp
     *  ->return temp variable
     *
     * 
     * Time Complexity - 
     * Space Complexity -


	 */
	@Test
	public void test1() {
		int test1 = countConsistentStrings("ab", new String[] {"ad","bd","aaab","baa","badab"});
		Assert.assertEquals(test1, 2);
		
	}
	
	@Test
	public void test2() {
		int test1 = countConsistentStrings("abc", new String[] {"a","b","c","ab","ac","bc","abc"});
		Assert.assertEquals(test1, 7);
		
	}
	
	
	@Test
	public void test3() {
		int test1 = countConsistentStrings("cad", new String[] {"cc","acd","b","ba","bac","bad","ac","d"});
		Assert.assertEquals(test1, 4);
		
	}
	
	
	 public int countConsistentStrings(String allowed, String[] words) {
	        Set<Character> set = new HashSet<Character>();
	        int total = words.length;

	        for(char c: allowed.toCharArray()){
	            set.add(c);
	        }
	        
	        for(String str: words){
	            for(char c: str.toCharArray()){
	                if(!set.contains(c)){
	                    total--;
	                    break;
	                }
	            }
	        }

	        return total;
	    }
	    

}
