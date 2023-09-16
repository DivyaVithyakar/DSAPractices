package dsapractice;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class LC_2283_NumberHasEqualDigit {
	
	/*
	 * You are given a 0-indexed string num of length n consisting of digits.
     *Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.
     *
     *
     *Input - int []
     *Output - boolean
     *
     * 5)Pseudo code 
     * ->Initialize Map to compare the values
     * ->Iterate using for loop until length of string
     *   ->get numeric value if number and assign to temp variable
     *   ->add into it map
     * ->Iterate using for loop
     *   ->get numeric value based on Index, if numeric value value -1 and assig to local variable
     *   ->add to map with index value with local variable
     * ->Iterate for loop
     *   ->if map value !=0 ->return false
     *  ->else return true
     * 
     *
     * Time Complexity - 

	 */
	
	@Test
	public void test1() {
		boolean test1 = digitCount("1210");
		Assert.assertEquals(test1, true);
	}
	
	public boolean digitCount(String num) {
	 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
     for(int number = 0; number < num.length(); number++){
         int frequency = Character.getNumericValue(num.charAt(number));
         map.put(number,frequency);
     }

     for(int index = 0; index< num.length(); index++) {

         if (Character.getNumericValue(num.charAt(index)) < num.length()) {

             int frequency = map.get(Character.getNumericValue(num.charAt(index))) - 1;
             map.put(Character.getNumericValue(num.charAt(index)), frequency);
         }
     }

     for (int i = 0; i < num.length(); i++) {
         if(map.get(i) !=0){
             return false;
         }
     }
     return true;

}
}
