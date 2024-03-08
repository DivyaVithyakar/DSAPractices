package dsapractice.hashing;

import java.util.HashMap;

public class LC3005_CountMaxFreqMaxWith {
	
	/*
	 * You are given an array nums consisting of positive integers.
	 * Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
	 * The frequency of an element is the number of occurrences of that element in the array.


	 */
	
	public int maxFrequencyElements(int[] nums) {
	      HashMap<Integer, Integer> mp = new HashMap<>();
	        for (int num : nums) {
	            mp.put(num, mp.getOrDefault(num, 0) + 1);
	        }

	        int count = 0;
	        int maxFreq = Integer.MIN_VALUE;
	        for (int freq : mp.values()) {
	            maxFreq = Math.max(maxFreq, freq);
	        }

	        for (int freq : mp.values()) {
	            if (freq == maxFreq)
	                count += maxFreq;
	        }
	        return count;   
	    }

}
