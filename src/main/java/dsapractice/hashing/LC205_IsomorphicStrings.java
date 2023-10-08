package dsapractice.hashing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LC205_IsomorphicStrings {
	
	/*
	 * Given two strings s and t, determine if they are isomorphic.
     *Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     *All occurrences of a character must be replaced with another character while preserving the order of characters. 
     *No two characters may map to the same character, but a character may map to itself.
     *
     *
     *Input - String,String
     *Output - boolean
     *
     *2. Test data set 
     * Test Data 1
     * Input : s = "egg", t = "add"
     * Output : true
     * 
     * Test Data 2
     * Input : s = "foo", t = "bar"
     * Output : false
     * 
     * Test Data 3
     * Input : s = "paper", t = "title"
     * Output : true
     * 
     * 5.Pseudo code  
     * ->Initialize map 
     * ->Iterate the first string
     *   ->if map conatains key from string 1 is not not equal to string2 
     *   ->return false
     * ->if containsvalue of string 2 also return false
     * ->then add to map string 1 & string 2
     * ->return true
     * 
     * 
     * Time Complexity - 
     * Space Complexity -



 
	 */
	@Test
	public void test1() {
		boolean test1 = isIsomorphic("egg", "add");
		Assert.assertEquals(test1, true);
	}
	
	@Test
	public void test2() {
		boolean test1 = isIsomorphic("foo", "bar");
		Assert.assertEquals(test1, false);
	}
	
	@Test
	public void test3() {
		boolean test1 = isIsomorphic("paper", "title");
		Assert.assertEquals(test1, true);
	}
	
	public boolean isIsomorphic(String s, String t) {
		int str1 = s.length();
		int str2 = t.length();

		if (str1 != str2)
			return false;
		if (s.equals(t))
			return true;

		Map<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < str1; i++) {
			char c = s.charAt(i);
			char d = t.charAt(i);

			if (map.containsKey(c)) {
				if (!map.get(c).equals(d))
					return false;
			} else {

				if (map.containsValue(d))
					return false;

				map.put(c, d);
			}

		}
		return true;

 }

}
