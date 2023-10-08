package daspractice.hashing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LC771_JewelsAndStones {
	
	/*
	 * You're given strings jewels representing the types of stones that are jewels, 
	 * and stones representing the stones you have. Each character in stones is a type of stone you have.
	 * You want to know how many of the stones you have are also jewels.
     *Letters are case sensitive, so "a" is considered a different type of stone from "A".
     *
     *Input - String,String
     *Output - Integer
     *
     *2. Test data set
     * Test Data 1
     * Input : jewels = "aA", stones = "aAAbbbb"
     * Output : 3
     * 
     * Test Data 2
     * Input : jewels = "z", stones = "ZZ"
     * Output : 0
     * 
     * Test Data 3
     * Input :
     * Output :
     * 
     * 5.Pseudo code 
     * ->Initialize map to track the count
     * ->Iterate the stone string
     *   ->put the value into map already present increase the count
     * ->Iterate the jewel string
     *  ->get the value sfrom map, add to the temp variable 
     * ->retrun temp variable
     * 
     * 
     * 
     * Time Complexity - 
     * Space Complexity -


	 */
	@Test
	public void test1() {
		int test1 = numJewelsInStones("aA", "aAAbbbb");
		Assert.assertEquals(test1, 3);
	}
	
	
	@Test
	public void test2() {
		int test1 = numJewelsInStones("z", "ZZ");
		Assert.assertEquals(test1, 0);
	}
	
	 public int numJewelsInStones(String jewels, String stones) {
	        Map<Character, Integer> output = new HashMap<Character, Integer>();
	        for(Character i : stones.toCharArray()){
	        	output.put(i,output.getOrDefault(i,0)+1);
	        }
	        int result = 0;
	        for(Character i : jewels.toCharArray()){
	            if(output.get(i) != null)
	            	result += output.get(i);
	        }

	        return result;
	        
	    }

}
