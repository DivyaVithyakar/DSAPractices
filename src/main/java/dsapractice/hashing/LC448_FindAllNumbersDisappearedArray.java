package dsapractice.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LC448_FindAllNumbersDisappearedArray {
	
	/*
	 * Given an array nums of n integers where nums[i] is in the range [1, n], 
	 * return an array of all the integers in the range [1, n] that do not appear in nums.
	 *
     *Input - int[]
     *Output -  list of Integers
     *
     *2. Test data set 
     * Test Data 1
     * Input : nums = [4,3,2,7,8,2,3,1]
     * Output : [5,6]
     * 
     * Test Data 2
     * Input : nums = [1,1]
     * Output : [2]
     * 
     * Test Data 3
     * Input :
     * Output :
     * 
     * 5.Pseudo code 
     * ->Create set and array list to store the output
     * ->Iterate int array and store to set
     * ->Iterate the array
     *   ->if set doesn't contains i
     *   ->add to list
     * ->retrun list
     * 
     * 
     * Time Complexity - O(n)
     * Space Complexity - O(n)




	 */
	@Test
	public void test1() {
		List<Integer> test1 = findDisappearedNumbers(new int [] {4,3,2,7,8,2,3,1});
		 List<Integer> expected = Arrays.asList(5, 6);
		Assert.assertEquals(test1, expected);
	}
	
	@Test
	public void test2() {
		List<Integer> test1 = findDisappearedNumbers(new int [] {1,1});
		 List<Integer> expected = Arrays.asList(2);
		Assert.assertEquals(test1, expected);
	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<Integer>();
        ArrayList<Integer> missingNumbers = new ArrayList<Integer>();

        for (int num : nums)
        {
            uniqueNumbers.add(num);
        }

        for (int i = 1; i <= nums.length; i++)
        {
            if (!uniqueNumbers.contains(i))
            {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

}
