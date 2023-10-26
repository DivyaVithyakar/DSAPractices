package dsapractice.DivideAndConquer;


public class LC75_SortColors {
	
	/*
	 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
	 * with the colors in the order red, white, and blue.
     *We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     *You must solve this problem without using the library's sort function.
     *
     *
     *Input - int[]
     *Output - 
     *
     *2. Test data set 
     * Test Data 1
     * Input : nums = [2,0,2,1,1,0]
     * Output : [0,0,1,1,2,2]
     * 
     * Test Data 2
     * Input : nums = [2,0,1]
     * Output :  [0,1,2]
     * 
     *Pseudo code 
     * ->Initialize two variables as 0
     * ->Iterate using for loop until length of the array
     *   ->if array of i 0
     *   ->increase first variable count
     *   ->else increase second variable count
     *  ->Iterate using for loop until first variable length
     *  ->array of a 0
     *  ->same as for second variable and assign b as 1
     *  ->and c as 3
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	
	
	
	public void sortColors(int[] nums) {
        int cnt0=0;int cnt1=0;
       for (int i=0;i<nums.length;i++){
           if (nums[i]==0){
               cnt0++;
           }
           else if(nums[i]==1){
               cnt1++;
           }
       }
       for (int a=0;a<cnt0;a++){
           nums[a]=0;
       }
       for (int b=cnt0;b<cnt0+cnt1;b++){
           nums[b]=1;
       }
       for(int c=cnt0+cnt1;c<nums.length;c++){
           nums[c]=2;
       }
   }

}
