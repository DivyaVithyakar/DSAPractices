package dsapractice.BinarySearch;

public class LC605_CanPlaceFlowers {
	
	/*
	 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
     *Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, 
     *and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
     *
     *
     *Input - int[], int
     *Output - boolean
     *
     *2. Test data set 
     * Test Data 1
     * Input : flowerbed = [1,0,0,0,1], n = 1
     * Output : true
     * 
     * Test Data 2
     * Input : flowerbed = [1,0,0,0,1], n = 2
     * Output : false
     * 
     *Pseudo code 
     *  -> initialize variable for count
     * ->Iterate using for loop
     *   ->[i] = 0
     *     ->Check before position is 0 or not add condition for first element as well
     *     ->Check after position is 0 or not add condition for last element as well
     *     -> if conditions satisfied make it as 1 in current position
     *  ->increase the count as 1
     *  ->i++
     *  -> return true if count is equals to n
     *
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) {

		int count = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				int left = i;
				while (left >= 0 && flowerbed[left] == 0)
					left--;
				int right = i;
				while (right < flowerbed.length && flowerbed[right] == 0)
					right++;
				if ((left < 0 || i - left >= 2) && (right >= flowerbed.length || right - i >= 2)) {
					count++;
					flowerbed[i] = 1;
				}

			}
		}
		return count >= n;
	}

}
