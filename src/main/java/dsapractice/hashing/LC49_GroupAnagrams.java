package dsapractice.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC49_GroupAnagrams {
	
	/*
	 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     *An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
     *typically using all the original letters exactly once.
     *
     *
     *Pseudo Code
     *->if string length is zero return list
     *->Create map to store compare the key values
     *->Iterate the string array
     *  ->change to char array
     *  ->sort the array and store the values to in string
     *  ->If map doesn't contain the key add to map
     *  ->else get the value of string
     *  ->return the new array list with map value
     *  
	 */
	
	
	
	public List<List<String>> groupAnagram(String[] str) {

		if (str.length == 0) {
			return new ArrayList<>();
		}

		Map<String, List<String>> map = new HashMap<>();
		for (String s : str) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String key = new String(c);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
		}

		return new ArrayList<List<String>>(map.values());

	}
}
