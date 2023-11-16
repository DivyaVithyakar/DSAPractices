package dsapractice.DivideAndConquer;

public class LC283_MoveZeros {
	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *Note that you must do this in-place without making a copy of the array.
     *
     *
     *Input - 
     *Output - int[]
     *
     * Test Data 1
     * Input : nums = [0,1,0,3,12]
     * Output : [1,3,12,0,0]
     * 
     * Test Data 2
     * Input :  nums = [0]
     * Output : [0]
     * 
     * Pseudo code 
     * ->initialize left and right pointer as 0
     * ->Iterate using for loop until length of the array
     *   ->if right pointer is non zero
     *   ->create tmp variable to store right num
     *   ->swap right num for left num
     *   ->swap left num for num that we stored in tmp
     *   ->increment left pointer
     * 
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	
	
	
	 public void moveZeroes(int[] nums) {
		   int n = nums.length;
		        int[] arr1 = new int[n];
		        int[] arr2 = new int[n];
		        int count= 0;
		        int cnt = 0;
		        for(int i = 0 ; i < n; i++){
		            if(nums[i] !=0){
		                arr1[count] = nums[i];
		                count++;
		            }
		            else{
		                arr2[cnt] = nums[i];
		                cnt++;
		            }
		        }
		        int j =0;
		        for(int i = 0 ; i < count; i++){
		            nums[j] = arr1[i];
		            j++;
		        }
		        for(int i = 0; i <cnt ; i++){
		            nums[j] = arr2[i];
		            j++;
		        }
		    }
		}