package dsapractice.Stack;

import java.util.Stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC739_DailyTemperature {
	/*
	 * Given an array of integers temperatures represents the daily temperatures, 
	 * return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. 
	 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
	 * 
	 * Input - int[]
	 * Output - int[]
	 * 
	 * Test Data
	 * Example 1:

     *Input: temperatures = [73,74,75,71,69,72,76,73]
     *Output: [1,1,4,2,1,1,0,0]
     *Example 2:

     *Input: temperatures = [30,40,50,60]
     *Output: [1,1,1,0]
     *Example 3:

     *Input: temperatures = [30,60,90]
     *Output: [1,1,0]


	 */
	@Test
	public void test1() {
		int[] dailyTemperature = dailyTemperature(new int[] {73,74,75,71,69,72,76,73});
		int[] expected = new int[] {1,1,4,2,1,1,0,0};
		Assert.assertEquals(dailyTemperature, expected);
	}
	
	
	public int[] dailyTemperature(int[] temperatures) {
		
		int[] temps = new int[temperatures.length];
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0 ; i < temperatures.length;i++) {
			while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int index = stack.pop();
				temps[index] = i - index;
			}
			stack.push(i);
		}
		return temps;
	}

}
