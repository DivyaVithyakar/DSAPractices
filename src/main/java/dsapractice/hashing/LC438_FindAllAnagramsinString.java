package dsapractice.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC438_FindAllAnagramsinString {
	
	/*
	 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. 
	 * You may return the answer in any order.
     *An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
     *typically using all the original letters exactly once.
     *
     *
     *Input - String, String
     *Output - List of Integer
     *
     * Test Data 1
     * Input : s = "cbaebabacd", p = "abc"
     * Output : [0,6]
     * 
     * Test Data 2
     * Input : s = "abab", p = "ab"
     * Output : [0,1,2]
     * 
     * Pseudo code 
     * 
     *
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	
	 public List<Integer> findAnagrams(String s, String p) {
	       List<Integer> ans = new ArrayList<>();
	        HashMap<Character,Integer> map = new HashMap<>();
	        int i = 0, j=0;
	        for(char c: p.toCharArray())
	            map.put(c, map.getOrDefault(c,0)+1);
	        
	        int required = map.size();
	        while(j<s.length()){
	            char c = s.charAt(j);
	            
	            if(map.containsKey(c)){
	                map.put(c, map.get(c)-1);
	                if(map.get(c)==0)
	                    required--;
	            }
	            
	            while(required==0){
	                if(j-i+1==p.length())
	                ans.add(i);
	                
	                char b = s.charAt(i);
	                if(map.containsKey(b)){
	                    map.put(b,map.get(b)+1);
	                    if(map.get(b)==1)
	                        required++;
	                }
	                i++;
	            }
	            j++;
	            
	        }
	        
	        
	        return ans; 
	    }

}
