package dsapractice.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC451_SortBySequence {
	
	/*
	 * Given a string s, sort it in decreasing order based on the frequency of the characters. 
	 * The frequency of a character is the number of times it appears in the string.
	 * Return the sorted string. If there are multiple answers, return any of them.
	 * 
	 * Input: s = "tree"
	 * Output: "eert"
	 * 
	 * Input: s = "cccaaa"
	 * Output: "aaaccc"
	 * 
	 * Pseudo Code
	 * 
	 * ->Create map and put the chars into map
	 * ->create list then sort the values and store into list
	 * ->Create string builder and store the values and return the string
	 */
	
	
	 public String frequencySort(String s) {
		 
		 Map<Character,Integer> map = new HashMap<>();
		 for( char c : s.toCharArray()) {
			 map.put(c, map.getOrDefault(c, 0)+1);
		 }
		 
		 List<Character> list = new ArrayList<>(map.keySet());
		 list.sort((a,b) -> map.get(b) - map.get(a));
		 
		 StringBuilder result = new StringBuilder();
		 for(char ch :list) {
			 int freq = map.get(ch);
			 for(int i =0;i<freq;i++) {
				 result.append(ch);
			 }
		 }
	     return result.toString();   
	 }
}
