package dsapractice.String;

public class LC2864_MaxOddBinaryNumber {
	
	/*
	 * You are given a binary string s that contains at least one '1'.
	 * You have to rearrange the bits in such a way that the resulting binary number is the
	 *  maximum odd binary number that can be created from this combination.
	 *  Return a string representing the maximum odd binary number that can be created from the given combination.
	 *  Note that the resulting string can have leading zeros.


	 */
	
	
	public String maximumOddBinaryNumber(String s) {
        int countOnes = 0;
    StringBuilder resultBuilder = new StringBuilder();
    
    for (char ch : s.toCharArray()) {
        if (ch == '1') {
            countOnes++;
        }
    }
    
    for (int i = 0; i < s.length() - 1; i++) {
        if (countOnes > 1) {
            countOnes--;
            resultBuilder.append('1');
        } else {
            resultBuilder.append('0');
        }
    }
    
    resultBuilder.append('1');
    return resultBuilder.toString();
}

}
