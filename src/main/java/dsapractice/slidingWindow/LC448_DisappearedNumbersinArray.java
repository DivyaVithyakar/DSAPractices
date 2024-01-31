package dsapractice.slidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC448_DisappearedNumbersinArray {
	
	
	/*
	 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
	 */
	
	
	
	public List<Integer> findMissingNumber(int[] nums){
		
		Set<Integer> setelements = new HashSet<>();
		List<Integer> listelements = new ArrayList<>();
		
		for(int num : nums) {
			setelements.add(num);
		}
		
		for(int i = 0; i < nums.length;i++) {
			if(!setelements.contains(i)) {
				listelements.add(i);
			}
		}
		
		return listelements;
	}

}
