package dsapractice.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class LC387_FirstUNiqueCharacterInString {
	
	/*
	 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
	 *
     *
     *Input - String 
     *Output - Int
     *
     *Test data set
     * Test Data 1
     * Input : s = "leetcode"
     * Output : 0
     * 
     * Test Data 2
     * Input : s = "loveleetcode"
     * Output : 2
     * 
     * Test Data 3
     * Input : s = "aabb"
     * Output : -1
     * 
     *Pseudo code 
     * ->Create map and Iterate using for each loop
     *   ->put into map if alreat present add the value
     * ->In map entry set
     *   ->if get value ==1
     *   ->return the index of get key
     * ->else return -1
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	@Test
	public void test1() {
		int test1 = firstUniqChar("leetcode");
		Assert.assertEquals(test1, 0);
	}
	
	@Test
	public void test2() {
		int test1 = firstUniqChar("loveleetcode");
		Assert.assertEquals(test1, 2);
	}
	
	@Test
	public void test3() {
		int test1 = firstUniqChar("aabb");
		Assert.assertEquals(test1, -1);
	}
	
	
	public int firstUniqChar(String s) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() == 1)
				return s.indexOf(m.getKey());
		}
		return -1;
	}

}
