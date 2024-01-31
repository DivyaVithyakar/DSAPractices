package dsapractice.BruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_2610_ConvertArray2DArray {
	
	
	
	public List<List<Integer>> convertMatrix(int[] nums){
		
		Arrays.sort(nums);
		List<List<Integer>> matrix = new ArrayList();
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			int n = nums[i];
			if(i>0 && nums[i] == nums[i-1]) {
				count++;
			}else {
				count = 1;
			}
			
			if(matrix.size() < count) matrix.add(new ArrayList());
			matrix.get(count-1).add(n);
		}
		
		return matrix;
	}

}
