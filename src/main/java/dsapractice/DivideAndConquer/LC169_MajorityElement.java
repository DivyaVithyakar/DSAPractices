package dsapractice.DivideAndConquer;

public class LC169_MajorityElement {
	/*
	 * Given an array nums of size n, return the majority element.
     *The majority element is the element that appears more than ⌊n / 2⌋ times. 
     *You may assume that the majority element always exists in the array.
     *
     *
     *Input - int[]
     *Output - int
     *
     *2. Test data set 
     * Test Data 1
     * Input : nums = [3,2,3]
     * Output : 3
     * 
     * Test Data 2
     * Input : nums = [2,2,1,1,1,2,2]
     * Output : 2
     *
     * 
     * Pseudo code 
     * ->Initialize count is zero
     * ->Iterate the whole array 
     *   ->if count equals to 0
     *   ->answer is num
     *  ->count and num value equals to ans return 1 else return -1
     * ->return the answer
     *
     * 
     * Time Complexity - 
     * Space Complexity -



	 */
	
	public int majorityElement(int[] nums) {

		Integer ans = null;
		int count = 0;

		for (final int num : nums) {
			if (count == 0)
				ans = num;
			//variable = (condition) ? expression_if_true : expression_if_false;
			count += num == ans ? 1 : -1;
		}

		return ans;

	}

}
