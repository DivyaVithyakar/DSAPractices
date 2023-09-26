package dsapractice.slidingWindow;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class HW_Sep26_2660_WinnerOfBowlingGame {
	/*
	 * You are given two 0-indexed integer arrays player1 and player2, that represent the number of pins that player 1 and player 2 hit in a bowling game, respectively.
     *The bowling game consists of n turns, and the number of pins in each turn is exactly 10.
     *Assume a player hit xi pins in the ith turn. The value of the ith turn for the player is:
     *2xi if the player hit 10 pins in any of the previous two turns.
     *Otherwise, It is xi.
     *The score of the player is the sum of the values of their n turns.
     *Return
     *1 if the score of player 1 is more than the score of player 2,
     *2 if the score of player 2 is more than the score of player 1, and
     *0 in case of a draw.
     *
     *
     *
     *Input - int[],int[]
     *Output - int
     *
     *2. Test data set - 5 MINS
     * Test Data 1
     * Input : player1 = [4,10,7,9], player2 = [6,5,2,3]
     * Output : 1
     * 
     * Test Data 2
     * Input : player1 = [3,5,7,6], player2 = [8,10,10,2]
     * Output : 2
     * 
     * Test Data 3
     * Input : player1 = [2,3], player2 = [4,1]
     * Output : 0
     * 
     * 
     * 5.Pseudo code
     * ->Initialize 2 arrays for score 1 & score 2
     * ->Iterate using for loop until length of the array
     * ->if(i>=2 & [i-2]=10) -> add to score [i] is 2*p[i]
     * ->else if(i>=1 & [i-1]=10 or (i>=2 & [i-2]=10)
     * ->add to score [i] is 2*p[i]
     * ->else score[] = p[i]
     * ->Same as player 2
     * ->add the all values in score 1 & score 2 arrays
     * ->if score1 > score 2 ->retrun 1
     * ->else if score 2>score1 ->return ->return 2
     * ->else return 0
     * 
     * 
     * Time Complexity - O(n)
     * Space Complexity - O(n)

	 */
	
	@Test
	public void test1() {
		int test1 = isWinning(new int[] {4,10,7,9}, new int[] {6,5,2,3});
		Assert.assertEquals(test1, 1);
	}
	
	@Test
	public void test2() {
		int test1 = isWinning(new int[] {3,5,7,6}, new int[] {8,10,10,2});
		Assert.assertEquals(test1, 2);
	}
	
	@Test
	public void test3() {
		int test1 = isWinning(new int[] {2,3}, new int[] {4,1});
		Assert.assertEquals(test1, 0);
	}
	
	public int isWinning(int[] player1, int[] player2) {
		int n = player1.length;
		int[] score1 = new int[n];
		int[] score2 = new int[n];
		
		for(int i = 0;i < n;i++) {
			if(i >= 2 && player1[i-2] ==10) {
				score1[i] = 2 * player1[i];
			}else if(i >= 1 && player1[i-1] ==10 ||i >= 2 && player1[i-2] ==10) {
				score1[i] = 2 * player1[i];
			}else {
				score1[i] = player1[i];
			}
		}
		
		
		for(int i = 0;i < n;i++) {
			if(i >= 2 && player2[i-2] ==10) {
				score2[i] = 2 * player2[i];
			}else if(i >= 1 && player2[i-1] ==10 ||i >= 2 && player2[i-2] ==10) {
				score2[i] = 2 * player2[i];
			}else {
				score2[i] = player2[i];
			}
		}
		
		int totalscore1 = Arrays.stream(score1).sum();
		int totalscore2 = Arrays.stream(score2).sum();
		
		if(totalscore1>totalscore2) {
			return 1;
		}else if(totalscore2>totalscore1) {
			return 2;
		}else {
			return 0;
		}
		
	}
	


}
