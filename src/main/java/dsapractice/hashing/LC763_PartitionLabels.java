package dsapractice.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC763_PartitionLabels {

	/*
	 * You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
     *Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
     *Return a list of integers representing the size of these parts.
     *
     *
     *Input - String
     *Output - List of Integer
     *
     *2. Test data set 
     * Test Data 1
     * Input : s = "ababcbacadefegdehijhklij"
     * Output : [9,7,8]
     * 
     * Test Data 2
     * Input : s = "eccbbbbdec"
     * Output : 10
     * 
     * 
     * 
     * Pseudo code 
     * ->Initialize list to track the result
     * ->Initialize map for count
     * ->Iterate using for loop
     *   ->put the values into map
     * ->Starting and ending point =0
     * 
     * 
     * Time Complexity - 
     * Space Complexity -



	 */
	
	public List<Integer> partitionLabels(String s) {
		List<Integer> res = new ArrayList();
		Map<Integer, Integer> hm = new HashMap();
		for (int i = 0; i < s.length(); i++) {
			hm.put(s.charAt(i) - 'a', i);
		}
		int sp = 0, ep = 0;
		for (int i = 0; i < s.length(); i++) {
			sp = i;
			ep = hm.get(s.charAt(i) - 'a');
			for (int j = i + 1; j < ep; j++) {
				if (hm.get(s.charAt(j) - 'a') > ep) {
					ep = hm.get(s.charAt(j) - 'a'); 
													
				}
			}
			i = ep;
			res.add(ep - sp + 1);
		}
		return res;
	}
}
