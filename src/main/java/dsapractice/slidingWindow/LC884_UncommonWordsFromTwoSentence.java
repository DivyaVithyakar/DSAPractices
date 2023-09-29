package dsapractice.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class LC884_UncommonWordsFromTwoSentence {
	
	/*
	 * A sentence is a string of single-space separated words where each word consists only of lowercase letters.
     *A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
     *Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
     *
     *
     *
     *Input - string,string
     *Output - string[]
     *
     *2. Test data set - 5 MINS
     * Test Data 1
     * Input : s1 = "this apple is sweet", s2 = "this apple is sour"
     * Output : ["sweet","sour"]
     * 
     * Test Data 2
     * Input : s1 = "apple apple", s2 = "banana"
     * Output : ["banana"]
     * 
     * 5.Pseudo code 
     * ->Initialize one string list to store the output
     * ->Create map to store the words
     * ->split the s1,s2 by using space
     * ->Iterate using for loop until length of s1
     *   ->if map contains the key s1[i] ->put in to map if alrdy present add the count
     *   ->else put into map
     * ->Iterate s2 string
     *  ->use the same logic
     * ->if map contains the value <=1
     * ->add to the list
     * ->create one string array to list size
     * ->add the values to the string[]
     * ->return string[]
     *
     * Time Complexity - 
     * Space Complexity -



	 */
	@Test
	public void test1() {
		String[] test1 = uncommonFromSentences("this apple is sweet", "this apple is sour");
		Assert.assertArrayEquals(test1, new String[] {"sweet","sour"});
	}
	
	@Test
	public void test2() {
		String[] test1 = uncommonFromSentences("apple apple", "banana");
		Assert.assertArrayEquals(test1, new String[] {"banana"});
	}
	
	
	public String[] uncommonFromSentences(String s1, String s2) {
        List<String> output = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] sentence1 = s1.split(" ");
        String[] sentence2 = s2.split(" ");
        for (int i = 0; i < sentence1.length; i++) {
            map.put(sentence1[i], map.getOrDefault(sentence1[i], 0) + 1);
        }
        for (int i = 0; i < sentence2.length; i++) {
            map.put(sentence2[i], map.getOrDefault(sentence2[i], 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() <= 1) {
                output.add(entry.getKey());
            }
        }
        int i = 0;
        String[] output2 = new String[output.size()];
        for(String s : output) {
            output2[i++] = s;
        }
        return output2;
	}

}
