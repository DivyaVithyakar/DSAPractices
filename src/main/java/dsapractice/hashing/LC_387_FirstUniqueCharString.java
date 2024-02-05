package dsapractice.hashing;

import java.util.HashMap;
import java.util.Map;

public class LC_387_FirstUniqueCharString {
	
	/*
	 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
	 * 
	 * 
	 */
	
	public int firstUniqChar(String s) {
	       
	       Map<Character,Integer> map = new HashMap<>();

	       for(int i = 0; i < s.length();i++){
	           char a = s.charAt(i);
	           map.put(a , map.getOrDefault(a,0)+1);
	       }

	       for(int i = 0; i< s.length();i++){
	           if(map.get(s.charAt(i))==1){
	               return i;
	           }
	       }
	       return -1;
	    }

}
