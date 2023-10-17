package dsapractice.Stack;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class LC20_ValidParenthesis {
	/*
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *An input string is valid if:
     *Open brackets must be closed by the same type of brackets.
     *Open brackets must be closed in the correct order.
     *Every close bracket has a corresponding open bracket of the same type.
     *
     *Pseudo code
     *->Implement inbuilt stack to store the result
     *->Iterate using for loop 
     *  ->If any symbols ({[ found add it to stack
     *  ->else if return false
     * ->find the pair for this symbols and pop it
     * -> return false if any closing symbol is missing
     * ->return true if string is empty
 


	 */
	@Test
	public void test1() {
		boolean test1 = isValid("()");
		Assert.assertEquals(test1, true);
	}
	
	@Test
	public void test2() {
		boolean test1 = isValid("()[]{}");
		Assert.assertEquals(test1, true);
	}
	
	@Test
	public void test3() {
		boolean test1 = isValid("(]");
		Assert.assertEquals(test1, false);
	}
	
	public boolean isValid(String s) {
		
		 Stack<Character> validParenthesis=new Stack<Character>();
	     for(int i=0;i<s.length();i++){
	         
	     if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
	    	 validParenthesis.push(s.charAt(i));
	         }
	    else if(validParenthesis.empty()){
	             return false;
	         }
	
	         else if (validParenthesis.peek() == '{' && s.charAt(i) == '}' ) {
	        	 validParenthesis.pop();
	         } else if (validParenthesis.peek() == '(' && s.charAt(i) == ')' ) {
	        	 validParenthesis.pop();
	         } else if (validParenthesis.peek() == '[' && s.charAt(i) == ']' ) {
	        	 validParenthesis.pop();
	         }else{
	             return false;
	         }
	}
	             
	     
	     return validParenthesis.isEmpty();
	 }
 

}
