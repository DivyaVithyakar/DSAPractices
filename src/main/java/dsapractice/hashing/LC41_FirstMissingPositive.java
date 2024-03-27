package dsapractice.hashing;

import java.util.HashMap;

public class LC41_FirstMissingPositive {
	
	/*
	 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
	 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
	 */
	
	public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Boolean> mp = new HashMap<>();
       int maxi = Integer.MIN_VALUE;
       for (int num : nums) {
           mp.put(num, true);
           maxi = Math.max(maxi, num);
       }
       for (int i = 1; i < maxi; i++) {
           if (!mp.containsKey(i))
               return i;
       }
       return maxi < 0 ? 1 : maxi + 1;
   }

}
