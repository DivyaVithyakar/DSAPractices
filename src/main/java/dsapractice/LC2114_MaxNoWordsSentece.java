package dsapractice;

import org.junit.Test;
import org.testng.Assert;

public class LC2114_MaxNoWordsSentece {
	
	/*
	 *  * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
     *You are given an array of strings sentences, where each sentences[i] represents a single sentence.
     *Return the maximum number of words that appear in a single sentence.
     *
     *Input - String []
     *Output - int
     *
     *Pseudo code
     * ->Initialize variable to track the count
     * ->Iterate the array using for loop
     *   ->Split the words using space until length
     *   ->if  current sentence count > count
     *   ->set count value as current count
     * ->return count
     * 
     * Time Complexity - O(n)
     *
	 */
	
	@Test
	public void test1() {
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int result = mostWordsFound(sentences);
        Assert.assertEquals(6, result);
	}
	
	
	 @Test
	    public void test2() {
	        String[] sentences = {}; 
	        int result = mostWordsFound(sentences);
	        Assert.assertEquals(0, result);
	    }

	    @Test
	    public void test3() {
	        String[] sentences = {"word1", "word1 word2", "word1 word2 word3"};
	        int result = mostWordsFound(sentences);
	        Assert.assertEquals(3, result);
	    }
	
	
	public int mostWordsFound(String[] sentences) {
		int count =0;
		for (String sentence : sentences) {
			int currentcount = sentence.split(" ").length;
			if(count < currentcount);
			count =currentcount;
			
		}
		
		return count;
		
	}


}
