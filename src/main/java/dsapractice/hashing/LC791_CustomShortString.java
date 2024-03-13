package dsapractice.hashing;

public class LC791_CustomShortString {
	
	/*
	 * You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.
	 * Permute the characters of s so that they match the order that order was sorted. More specifically, 
	 * if a character x occurs before a character y in order, then x should occur before y in the permuted string.
	 * Return any permutation of s that satisfies this property.
	 */
	
	 public String customSortString(String order, String s) {
		  int [] map = new int [26];
	        for (int i = 0; i < s.length(); i ++) {
	            map[s.charAt(i) - 'a'] ++;
	        }
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < order.length(); i ++) {
	            for (int j = 0; j < map[order.charAt(i) - 'a']; j ++) {
	                result.append(order.charAt(i));
	            }
	            map[order.charAt(i) - 'a'] = 0;
	        }

	        for (int i = 0; i < 26; i++) {
	            for (int j = 0; j < map[i]; j++) {
	                result.append((char) ('a' + i));
	            }
	        }
	       
	        return result.toString();
	    }

}
