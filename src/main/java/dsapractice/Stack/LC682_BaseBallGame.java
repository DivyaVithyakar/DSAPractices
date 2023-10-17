package dsapractice.Stack;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class LC682_BaseBallGame {
	
	/*
	 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
     *You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
     *An integer x.
     *Record a new score of x. '+'.
     *Record a new score that is the sum of the previous two scores.'D'.
     *Record a new score that is the double of the previous score.'C'.
     *Invalidate the previous score, removing it from the record.
     *Return the sum of all the scores on the record after applying all the operations.
     *The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
     *
     *
     *
     *Input - String[]
     *Output - int 
     *
     *Test data set 
     * Test Data 1
     * Input : ops = ["5","2","C","D","+"]
     * Output : 30
     * 
     * Test Data 2
     * Input : ops = ["5","-2","4","C","D","9","+","+"]
     * Output : 27
     * 
     * Test Data 3
     * Input : ops = ["1","C"]
     * Output : 0
     * 
     * Pseudo code 
     * ->Initialize sum variable 
     * ->Initialize stack for manipulation
     * ->Iterate until length of the string array
     *   ->if equals to c subtract from sum and pop it to stack
     *   ->If it's equals to D peek and *2 then add to stack
     *   ->If it's equals to + pop the stack & peek the stack and push it as sum of 2 variables
     * ->else convert into int and push it to stack and add to sum as sum + peek
     * ->return sum
     *   
     *
     * Time Complexity - 
     * Space Complexity -

	 */
	
	@Test
	public void test1() {
		int test1 = calPoints(new String[] {"5","2","C","D","+"});
		Assert.assertEquals(test1, 30);
	}
	
	@Test
	public void test2() {
		int test1 = calPoints(new String[] {"5","-2","4","C","D","9","+","+"});
		Assert.assertEquals(test1, 27);
	}
	
	@Test
	public void test3() {
		int test1 = calPoints(new String[] {"1","C"});
		Assert.assertEquals(test1, 0);
	}
	
	
	
	public int calPoints(String[] operations) {
		int sum = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (String op : operations) {
			if (op.equals("C")) {
				sum -= stack.pop();
			} else if (op.equals("D")) {
				stack.push(stack.peek() * 2);
				sum += stack.peek();
			} else if (op.equals("+")) {
				int last = stack.pop();
				int secondLast = stack.peek();
				stack.push(last);
				stack.push(last + secondLast);
				sum += stack.peek();
			} else {
				stack.push(Integer.parseInt(op));
				sum += stack.peek();
			}
		}
		return sum;
	}

}
