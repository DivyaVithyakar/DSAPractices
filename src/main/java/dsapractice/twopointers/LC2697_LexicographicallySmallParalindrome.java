package dsapractice.twopointers;

import org.junit.Assert;
import org.junit.Test;

public class LC2697_LexicographicallySmallParalindrome {
	
	/*
	 * You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. 
	 * In one operation, you can replace a character in s with another lowercase English letter.
     *Your task is to make s a palindrome with the minimum number of operations possible. 
     *If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.
     *A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, 
     *string a has a letter that appears earlier in the alphabet than the corresponding letter in b.
     *Return the resulting palindrome string.
     *
     *
     *Input - String
     *Output - String
     *
     *5)Pseudo code 
     *->Initialize 2 pointer in left & right
     *   ->left =0
     *   ->right= length-1
     * ->convert string to char[]
     *->In while loop
     *  ->left ==right
     *  ->increase left & reduce right
     *->If left!=right
     *->change left(i) = right(i)
     *->return string
     * 
     * 
     * Time Complexity - O(n)
     * Space Complexity -O(1)


	 */
	@Test
	public void test1() {
		String test1 = smallParalindrome("egcfe");
		Assert.assertEquals(test1, "efcfe");
	}
	
	public String smallParalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		char[] ch = s.toCharArray();
		while(left<right) {
			if(ch[left]==ch[right]) {
				left ++;
				right --;
				
			}else {
				//ch[left]=ch[right];
				if(ch[left]<ch[right]) {
					ch[right]=ch[left];
				}else {
					ch[left] = ch[right];
				}
			}
			
		}
		
		return new String(ch);
		
	}

}
