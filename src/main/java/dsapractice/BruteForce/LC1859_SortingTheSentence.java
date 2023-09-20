package dsapractice.BruteForce;

import org.junit.Assert;
import org.junit.Test;



public class LC1859_SortingTheSentence {
	
	/*
	 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. 
	 * Each word consists of lowercase and uppercase English letters.
     *A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
     *For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
     *Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
     *
     *
     *
     *Input - String 
     *Output - String
     *
     *Pseudo code 
     *->return same if string is null or 0
     *->create string[] to store the output
     *->Iterate using for loop
     *  ->get the last char of the current word and convert to int
     *  ->store the word removed with last char in result array
     *->Again Iterate using for loop the result
     *  ->Append the to string builder
     *  ->if i<result -1 append it
     * Return the sb after convert to string
     * 
	 * Time Complexity - O(n)
     *
	 */
	
	@Test
	public void test1() {
		String test1 = sortSentence("is2 sentence4 This1 a3");
		Assert.assertEquals("This is a sentence", test1);
	}
	
	
	@Test
	public void test2() {
		String test2 = sortSentence("Hello1 World2");
		Assert.assertEquals("Hello World", test2);
	}
	
	 public String sortSentence(String s) {
		 
         if(s == null || s.length() == 0) {
      return s;
   }

   String[] words = s.split(" ");

   String[] result = new String[words.length];

   for(String word : words) {
      int i = word.charAt(word.length()-1) - '0';
      result[i-1] = word.substring(0, word.length()-1);
   }
   StringBuilder sort = new StringBuilder();
   for(int i = 0; i < result.length; i++) {
	   sort.append(result[i]);
      if(i < result.length-1) {
    	  sort.append(" ");
      }
   }

   return sort.toString();  
 }
}
