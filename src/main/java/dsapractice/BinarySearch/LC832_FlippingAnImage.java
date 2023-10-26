package dsapractice.BinarySearch;

public class LC832_FlippingAnImage {
	/*
	 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
     *To flip an image horizontally means that each row of the image is reversed.
     *For example, flipping [1,1,0] horizontally results in [0,1,1].
     *To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
     *For example, inverting [0,1,1] results in [1,0,0].
     *
     *
     *Input - int[][]
     *Output - int[][]
     *
     *2. Test data set 
     * Test Data 1
     * Input : image = [[1,1,0],[1,0,1],[0,0,0]]
     * Output : [[1,0,0],[0,1,0],[1,1,1]]
     * 
     * Test Data 2
     * Input : image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
     * Output : [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * 
     * Pseudo code 
     * ->Initialize two pointers, a and r, to the start and end of the row.
     *->While a is less than or equal to r, do the following:
     *   ->Swap the values at positions image[i][a] and image[i][r].
     *   ->Increment a and decrement r.
     *For each row in the image array:
     *  ->For each column in the row, do the following:
     *  -> If the value at image[i][j] is 0, set image[i][j] to 1.
     *  -> Else, set image[i][j] to 0.
     * ->Return the modified image array.
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	
	public int[][] flipAndInvertImage(int[][] image) {
		for (int i = 0; i < image.length; i++) {
			int a = 0, r = image[0].length - 1;
			while (a <= r) {
				int temp = image[i][a];
				image[i][a] = image[i][r];
				image[i][r] = temp;
				a++;
				r--;
			}
		}
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++) {
				if (image[i][j] == 0) {
					image[i][j] = 1;
				} else {
					image[i][j] = 0;
				}
			}
		}
		return image;
	}

}
