package dsapractice.hashing;

import java.util.HashMap;
import java.util.Map;

public class LC1358_NoSubstrignAllChar {
	
	/*
	 * Given a string s consisting only of characters a, b and c.
	 * Return the number of substrings containing at least one occurrence of all these characters a, b and c.
	 * 
	 * Input: s = "abcabc"
	 * Output: 10
	 * 
	 * 
	 * PseudoCode
	 * ->Put all the char in map
	 * ->Check the condition a,b,c or morethan >0 times
	 *  ->calculate count 
	 *  
	 * -> Iterate from left point and remove the char
	 * -> return count

 
	 */
	
	
	public int minSubString(String word) {
		
		int n = word.length();
		int left = 0;
		int right = 0;
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();
		while(right < n) {
		char r = word.charAt(right);
		map.put(r, map.getOrDefault(r, 0)+1);
		
		while(map.containsKey('a') && map.containsKey('b') && map.containsKey('c') && map.get('a') > 0 && map.get('b') > 0 && map.get('c') > 0) {
			count += n-right;
		
		
			map.put(word.charAt(left), map.getOrDefault(word.charAt(left), 0)-1);
			left++;
		}
		
		
		
		right++;
		}
		
		return count;
		
	}
	
	
	

}
