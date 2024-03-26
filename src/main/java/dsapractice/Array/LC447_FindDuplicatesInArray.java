package dsapractice.Array;

import java.util.ArrayList;
import java.util.List;

public class LC447_FindDuplicatesInArray {
	
	/*
	 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice,
	 * return an array of all the integers that appears twice.
	 * You must write an algorithm that runs in O(n) time and uses only constant extra space.
	 */
	
	
	
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            int idx = num - 1;
            if (nums[idx] < 0)
                result.add(num);
            nums[idx] *= -1;
        }
        return result; 
    }

}
