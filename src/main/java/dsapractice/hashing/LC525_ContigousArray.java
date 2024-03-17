package dsapractice.hashing;

import java.util.HashMap;
import java.util.Map;

public class LC525_ContigousArray {
	
	/*
	 * Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
	 */
	
	public int findMaxLength(int[] nums) {
        int left = 0, right = 0, len = nums.length;
        for(int indx = 0; indx < len; indx++){
           if(nums[indx] == 0) 
            nums[indx]  = -1;
        }
        int prefSum = 0;
        Map<Integer, Integer> prefSumIndxMp = new HashMap<>();
        prefSumIndxMp.put(0, -1);
        int maxSubLen = 0;
        for(int indx = 0; indx < len; indx++){
            prefSum += nums[indx];
            if(prefSumIndxMp.containsKey(prefSum - 0)){
                maxSubLen = Math.max(maxSubLen, indx - prefSumIndxMp.get(prefSum - 0));
            }
            if(!prefSumIndxMp.containsKey(prefSum)) prefSumIndxMp.put(prefSum, indx);
        }
        return maxSubLen; 
    }

}
