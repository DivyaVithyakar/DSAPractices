package dsapractice.hashing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class LC1128_NumberOfEquilantDominopairs {
	
	/*
	 * Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a == c and b == d), 
	 * or (a == d and b == c) - that is, one domino can be rotated to be equal to another domino.
     *Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].
     *
     *Input - int[][]
     *Output - int
     *
     *2. Test data set 
     * Test Data 1
     * Input : dominoes = [[1,2],[2,1],[3,4],[5,6]]
     * Output : 1
     * 
     * Test Data 2
     * Input : dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
     * Output : 3
     * 
     * Test Data 3
     * Input :
     * Output :
     * 
     * 5.Pseudo code 
     * ->initialize map
     * ->find smaller of the two numbers in the current domino and store into variable
     * ->fine max of the two numbers in the current domino and store into variable
     * ->find creates a unique representation for each pair of numbers and store into temp variable
     * ->if map doesn't contain temp variable add it to map
     * ->else increment it
     * ->return count
     * 
     *
     * 
     * Time Complexity - 
     * Space Complexity -



	 */
	
	@Test
	public void test1() {
		Assert.assertEquals(1, numEquivDominoPairs(new int[][] {{1,2},{2,2},{2,1},{3,2}}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(0, numEquivDominoPairs(new int[][] {{2,2},{2,1},{3,2}}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(6, numEquivDominoPairs(new int[][] {{1,2},{1,2},{2,1},{2,1}}));
	} 
	
	
	public int numEquivDominoPairs(int[][] dominoes) {
        int count=0;
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       for(int [] i: dominoes){
           int min = Math.min(i[0], i[1]);
           int max = Math.max(i[0], i[1]);

           int temp = min*10+max;

           if(!map.containsKey(temp)){
               map.put(temp,1);
           }
           else{
               count+=map.get(temp);
               map.put(temp, map.get(temp)+1);
           }
       }

       return count;
   }

}
