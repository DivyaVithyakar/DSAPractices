package dsapractice.twopointers;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC2149_ReaarangeArrayElementsSign {
	
	/*
	 * You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
     *You should rearrange the elements of nums such that the modified array follows the given conditions:
     *Every consecutive pair of integers have opposite signs.
     *For all integers with the same sign, the order in which they were present in nums is preserved.
     *The rearranged array begins with a positive integer.
     *Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
	 */
	
	@Test
	public void test1() {
		int[] test1 = rearrangeArrayWithSign(new int[] {3,1,-2,-5,2,-4});
		Assert.assertEquals(test1, new int[] {3,-2,1,-5,2,-4});
	}
	
	
	public int[] rearrangeArrayWithSign(int[] nums) {
		
		List<Integer> positive = new ArrayList<Integer>();
		List<Integer> negative = new ArrayList<Integer>();
		
		
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] > 0) {
				positive.add(nums[i]);
			}else {
				negative.add(nums[i]);
			}
			
		}
		
		int positiveIndex = 0; 
		int negativeIndex = 0;
		
		for(int i = 0;i <nums.length;i++) {
			if(i %2 == 0 && positiveIndex < positive.size()) {
				nums[i] = positive.get(positiveIndex);
				positiveIndex++;
			}else if (negativeIndex < negative.size()) {
				nums[i] = negative.get(negativeIndex);
				negativeIndex++;
			}
		}
		
		return nums;
		
	}

}
