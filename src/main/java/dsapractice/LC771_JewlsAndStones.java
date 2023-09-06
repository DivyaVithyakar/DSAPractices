package dsapractice;

import org.junit.Assert;
import org.junit.Test;

public class LC771_JewlsAndStones {
	
	/*
	 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
	 * Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
     *Letters are case sensitive, so "a" is considered a different type of stone from "A".
     *
     *
     *Input - String , String
     *Output - int
     *
     *
     *5)Pseudo code 
     *
     *->Initialize one variable to track count
     *->Iterate using for loop until length of jewels
     *  ->use another for loop to iterate the stones
     *  ->If jewels == stones
     *  ->increase the count
     *->return count
     *
	 * Time Complexity - O[N]

 
	 */
	@Test
	public void test1() {
		int test1 = jewelsAndStones("aA", "aAAbbb");
		Assert.assertEquals(3, test1);
	}
	
	@Test
	public void test2() {
		int test2 = jewelsAndStones("aB", "aABab");
		Assert.assertEquals(3, test2);
	}
	
	@Test
	public void test3() {
		int test3 = jewelsAndStones("", "aaA");
		Assert.assertEquals(0, test3);
	}
	
	public int jewelsAndStones(String jewels, String stones) {
		
		int count =0;
		
		for (char jewel : jewels.toCharArray()) {
			for(char stone : stones.toCharArray()) {
				if(jewel == stone) {
					count ++;
				}
			}
			
		}
		return count;
		
	}

}
