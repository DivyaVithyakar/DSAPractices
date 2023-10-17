package dsapractice.Stack;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class LC844_BackSpaceStringCompare {
	
	/*
	 * Given two strings s and t, return true if they are equal when both are typed into empty text editors.
	 *'#' means a backspace character.
     *Note that after backspacing an empty text, the text will continue empty.
     *
     *
     *Input - String, String
     *Output - Boolean
     *
     *Test data set
     * Test Data 1
     * Input : s = "ab#c", t = "ad#c"
     * Output : true
     * 
     * Test Data 2
     * Input : s = "ab##", t = "c#d#"
     * Output : true
     * 
     * Test Data 3
     * Input : s = "a#c", t = "b"
     * Output : false
     * 
     * Pseudo code 
     * -> initialize 2 stack for both strings s & t
     * ->Iterate the string s & t until length
     *   ->if its !=empty & # ->pop the stack
     *   ->else if != # ->push to stack
     *  ->If stack S & T equals
     *  ->return true
     *  ->else return false
     * 
     * 
     * Time Complexity - 
     * Space Complexity -



	 */
	@Test
	public void test1() {
		boolean test1 = backspaceCompare( "ab#c", "ad#c");
		Assert.assertEquals(test1, true);
	}
	
	@Test
	public void test2() {
		boolean test1 = backspaceCompare("ab##", "c#d#");
		Assert.assertEquals(test1, true);
	}
	
	
	@Test
	public void test3() {
		boolean test1 = backspaceCompare("a#c","b");
		Assert.assertEquals(test1, false);
	}
	
	
	public boolean backspaceCompare(String s, String t) {
		Stack<Character> stackS = new Stack<Character>();
		Stack<Character> stackT = new Stack<Character>();

		for (char ch : s.toCharArray()) {
			if (!stackS.isEmpty() && ch == '#') {
				stackS.pop();
			}

			else if (ch != '#') {
				stackS.push(ch);
			}
		}

		for (char ch : t.toCharArray()) {
			if (!stackT.isEmpty() && ch == '#') {
				stackT.pop();
			}

			else if (ch != '#') {
				stackT.push(ch);
			}
		}

		if (stackS.equals(stackT)) {
			return true;
		}

		return false;
	}

}
