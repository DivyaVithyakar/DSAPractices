package dsapractice.hashing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LC1748_SumOfUniqueElements {
	
	/*
	 * You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
     *Return the sum of all the unique elements of nums.
     *
     *
     *
     *Input - int[]
     *Output - int
     *
     *2. Test data set 
     * Test Data 1
     * Input : nums = [1,2,3,2]
     * Output : 4
     * 
     * Test Data 2
     * Input : nums = [1,1,1,1,1]
     * Output : 0
     * 
     * Test Data 3
     * Input : nums = [1,2,3,4,5]
     * Output : 15
     * 
     * 5.Pseudo code 
     * -> Initialize map & one result variable
     * ->Iterate using for until length of the array
     *   ->add into map, if already element present increase the value
     *   ->if the value is ==1 increase the count in result variable
     *   ->if value ==2 reduce from the variable
     * ->return result 
     * 
     * Time Complexity - O(n)
     * Space Complexity -O(1)


	 */
	@Test
	public void test1() {
		int test1 = sumOfUnique(new int[] {1,2,3,2} );
		Assert.assertEquals(test1, 4);
	}
	
	@Test
	public void test2() {
		int test1 = sumOfUnique(new int[] {1,1,1,1,1} );
		Assert.assertEquals(test1, 0);
	}
	
	
	@Test
	public void test3() {
		int test1 = sumOfUnique(new int[] {1,2,3,4,5} );
		Assert.assertEquals(test1, 15);
	}
	
	
	 public int sumOfUnique(int[] nums) {
         int result = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) == 1)result+=nums[i];
            else if(map.get(nums[i]) == 2)result-=nums[i];
        }
        return result;
    }

}
