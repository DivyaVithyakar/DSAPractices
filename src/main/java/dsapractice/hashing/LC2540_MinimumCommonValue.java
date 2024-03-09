package dsapractice.hashing;

import java.util.HashMap;

public class LC2540_MinimumCommonValue {
	
	/*
	 * Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. 
	 * If there is no common integer amongst nums1 and nums2, return -1.
	 * Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
	 */
	
	public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums1) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (mp.containsKey(num) && mp.get(num) > 0) {
                return num;
            }
        }
        return -1; 
    }

}
