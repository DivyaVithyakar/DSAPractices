package dsapractice.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_187_RepeatedDNASequences {
	/*
	 * The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
     *For example, "ACGAATTCCG" is a DNA sequence.
     *When studying DNA, it is useful to identify repeated sequences within the DNA.
     *Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. 
     *You may return the answer in any order.
     *
     *Pseudo Code
     *->Initialize list to store the repeated character
     *->check the length of the input string if less than 10 return the output
     *->Initialize map to store 


	 */
	
	 public List<String> findRepeatedDnaSequences(String s) {
         List<String> output = new ArrayList<>();
        if (s.length() <= 10) return output;

        Map<String, Integer> map = new HashMap<String, Integer>();

        int i = 0, j = 10;

        while (j <= s.length()) {
            String subStr = s.substring(i++, j++);
            map.put(subStr, map.getOrDefault(subStr, 0) + 1);

            if (map.get(subStr) > 1 && !output.contains(subStr)) {
            	output.add(subStr);
            }
        }

        return output;
    }

}
