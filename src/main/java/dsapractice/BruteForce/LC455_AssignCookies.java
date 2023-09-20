package dsapractice.BruteForce;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;




public class LC455_AssignCookies {
	
	/*
	 * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
     *Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. 
     *If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. 
     *Your goal is to maximize the number of your content children and output the maximum number.
	 * 
	 * Input - int[], int[]
	 * Output - int
	 * 
	 * Pseudo Code:
	 *  ->Sort the array
	 *  ->Initialize 3 variables for children pointer, cookie pointer & content count
	 *  ->Iterate the cookies until cookie length using for loop
	 *  ->While condition is children until length & s[j] >= g[i]
	 *  -> increase the children count & content count
	 *  -> return content
	 *  
	 * 
	 */
	
	
	public int assignCookies(int[]childs , int[]cookies) {
		Arrays.sort(childs);
		Arrays.sort(cookies);
		
		int children =0;
		int cookie =0;
		int content =0;
		for(cookie =0;cookie<cookies.length;cookie++) {
			while(children<childs.length && cookies[cookie]>=childs[children]) {
				children ++;
				content ++;
			}
			
		}
		return content;
				
	}
	
	
	@Test
	public void test1() {
		int test1 = assignCookies(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });
		Assert.assertEquals(3, test1);
	}

	@Test
	public void test2() {
		int test2 = assignCookies(new int[] { 5, 6, 7 }, new int[] { 1, 2, 3 });
		Assert.assertEquals(0, test2);
	}

	@Test
	public void test3() {
		int test3 = assignCookies(new int[] {}, new int[] { 1, 2, 3 });
		Assert.assertEquals(0, test3);
	}

}
