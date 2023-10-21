package dsapractice.Stack;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class LC1598_CrawlerLogFolder {
	
	/*
	 * The Leetcode file system keeps a log each time some user performs a change folder operation.
     *The operations are described below:
     *"../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
     *"./" : Remain in the same folder.
     *"x/" : Move to the child folder named x (This folder is guaranteed to always exist).
     *You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.
     *The file system starts in the main folder, then the operations in logs are performed.
     *Return the minimum number of operations needed to go back to the main folder after the change folder operations.
     *
     *
     *
     *2. Test data set 
     * Test Data 1
     * Input : logs = ["d1/","d2/","../","d21/","./"]
     * Output : 2
     * 
     * Test Data 2
     * Input : logs = ["d1/","d2/","./","d3/","../","d31/"]
     * Output : 3
     * 
     * Test Data 3
     * Input : logs = ["d1/","../","../","../"]
     * Output : 0
     * 
     * 5.Pseudo code 
     * ->Initialize stack
     * ->Iterate the string 
     *   ->if stack is not empty and equals to ..
     *   ->pop the stack
     *  ->else if string is equlas to .
     *  ->continue
     *  ->else if string not equals to .. and not equals to .
     *  ->push to stack
     * ->return the size of the stack
     * 
     *
     * 
     * 
     * Time Complexity - 
     * Space Complexity -

	 */
	@Test
	public void test1() {
		int test1 = minOperations(new String[] {"d1/","d2/","../","d21/","./"});
		Assert.assertEquals(test1, 2);
	}
	
	@Test
	public void test2() {
		int test1 = minOperations(new String[] {"d1/","d2/","./","d3/","../","d31/"});
		Assert.assertEquals(test1, 3);
	}
	
	@Test
	public void test3() {
		int test1 = minOperations(new String[] {"d1/","../","../","../"});
		Assert.assertEquals(test1, 0);
	}
	
	
	
	 public int minOperations(String[] logs) {
	       Stack<String> stack = new Stack<String>();
	        for(String s : logs){
	             if(!stack.isEmpty() && s.equals("../")){
	                 stack.pop(); 
	             }else if(s.equals("./")){
	                 continue; 
	             }else if(!s.equals("../") && !s.equals("./")){
	                 stack.push(s); 
	             }
	        }
	        return stack.size(); 
	     
	    }

}
