package daspractice.hashing;

import java.util.HashMap;
import java.util.Map;import org.codehaus.groovy.transform.stc.StaticTypeCheckingSupport.CharArrayStaticTypesHelper;
import org.junit.Test;
import org.testng.Assert;

public class LC1832_CheckTheSentencePangram {
	
	/*
	 * A pangram is a sentence where every letter of the English alphabet appears at least once.
     *Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
     *
     *
     *Input - String
     *Output - boolean
     *
     * 5.Pseudo code 
     * ->create hashmap
     * ->Iterate the string until length
     *   ->put the value into the map
     *   ->if map size is ===26 retrun true
     * ->else return false
     * 
     * 
     * Time Complexity - O(n)
     * Space Complexity -O(1)




	 */
	@Test
	public void test1() {
		boolean test1 = sentencePangram("thequickbrownfoxjumpsoverthelazydog");
		Assert.assertEquals(test1, true);
	}
	
	@Test
	public void test2() {
		boolean test1 = sentencePangram("leetcode");
		Assert.assertEquals(test1, false);
	}
	
	public boolean sentencePangram(String sentence) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i = 0; i < sentence.length(); i++) {
			map.put(sentence.charAt(i), 1);
		}
		if(map.size() == 26) return true;
		return false;
	}

}
