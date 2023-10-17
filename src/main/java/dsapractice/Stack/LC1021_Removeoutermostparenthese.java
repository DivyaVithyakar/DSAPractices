package dsapractice.Stack;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class LC1021_Removeoutermostparenthese {
	/*
	 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
     *For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
     *A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
     *Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
     *Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
     *
     *
     *Input - String
     *Output - String
     *
     *Test data set
     * Test Data 1
     * Input : s = "(()())(())"
     * Output : "()()()"
     * 
     * Test Data 2
     * Input : s = "(()())(())(()(()))"
     * Output : "()()()()(())"
     * 
     * Test Data 3
     * Input : s = "()()"
     * Output : ""
     * 
     * 5.Pseudo code 
     * -> Initialize stack
     * ->Iterate using for loop
     *   ->if charAt(i) is ( push & found match ) pop it
     *   ->if empty add it substring  and break
     * ->return the string answer
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	@Test
	public void test1() {
		String test1 = removeOuterParentheses("(()())(())");
		Assert.assertEquals(test1, "()()()");
	}
	
	@Test
	public void test2() {
		String test1 = removeOuterParentheses("(()())(())(()(()))");
		Assert.assertEquals(test1, "()()()()(())");
	}
	
	@Test
	public void test3() {
		String test1 = removeOuterParentheses("()()");
		Assert.assertEquals(test1, "");
	}
	
	
	public String removeOuterParentheses(String s) {
		String ans = "";
		Stack<Character> stackParantheses = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stackParantheses.push(s.charAt(i));
			if (s.charAt(i) == ')')
				stackParantheses.pop();
			if (stackParantheses.empty()) {
				ans = s.substring(1, i);
				ans += removeOuterParentheses(s.substring(i + 1));
				break;
			}
		}
		return ans;

	}

}
