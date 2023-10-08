package dsapractice.hashing;

import java.util.HashSet;
import java.util.Set;

public class LC888_FairCandySwap {
	
	/*
	 * Alice and Bob have a different total number of candies. 
	 * You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the 
	 * ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.
     *Since they are friends, they would like to exchange one candy box each so that after the exchange,
     * they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.
     *Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, 
     *and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. 
     *It is guaranteed that at least one answer exists.
     *
     *Input - int[],int[]
     *Output - int[]
     *
     * 
     * 5.Pseudo code
     * ->initialize 2 variables alice sum & bobs sum
     * ->Iterate both array and add the sums into initialized variables
     * ->bob-alice/2 assign to temp variable
     * ->initialize one set
     *   ->Iterate the bob set and add it to set
     *   ->if set contains i+temp variable
     *   ->return i, i+temp
     *  ->else return empty
     * 
     * Time Complexity - O(n+m)
     * Space Complexity - O(n+m)




	 */
	
	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice= 0;
       int sumBob=0;

       for(int i : aliceSizes) {
    	   sumAlice += i;
       }

       for(int i : bobSizes) {
    	   sumBob += i;
       }

       int delta= (sumBob-sumAlice)/2;

       Set<Integer> setB= new HashSet<Integer>();

       for(int i : bobSizes) {
           setB.add(i);
       }

       for(int i : aliceSizes) {
           if(setB.contains(i + delta)) {
               return new int[] {i, i+delta};
           }
       }
       return null;
   }

}
