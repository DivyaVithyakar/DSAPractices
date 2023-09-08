package dsapractice;

import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class LC2325_DecodeTheMessage {
	
	/*
	 * You are given the strings key and message, which represent a cipher key and a secret message, respectively. 
	 * The steps to decode message are as follows:

     *Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
     *Align the substitution table with the regular English alphabet.
     *Each letter in message is then substituted using the table.
     *Spaces ' ' are transformed to themselves.
     *For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), 
     *we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
     *Return the decoded message.
     *
     *
     *Input - String, String
     *Output - String
     *
     *Pseudo code
     *->to append the string use String builder
     *->replace all the spaces
     *->create map to store letters
     *->Iterate the message using for loop
     *  ->After the first pass all the letters of the key will be mapped with their respective original letters.
     *  ->replacing the letters of the message with appropriate letter according to the key
     * ->return the answer after conver to string
     *  
	 * Time Complexity - O(n) 
	 *  
	 */
	@Test
	public void test1() {
		String test1 = decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
		Assert.assertEquals("this is a secret", test1);
	}
	
	
	@Test
	public void test2() {
		String test2 = decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb");
		Assert.assertEquals("the five boxing wizards jump quickly", test2);
	}
	
	
	
	public String decodeMessage(String key, String message) {
        StringBuilder ans = new StringBuilder();
     key = key.replaceAll(" ", "");
     
     HashMap<Character,Character> letters = new HashMap<Character,Character>();
    
     char original = 'a';
     for (int i = 0; i < key.length() ; i++) {
         if (!letters.containsKey(key.charAt(i))){
             letters.put(key.charAt(i),original++);
         }
     }
    
     for (int i = 0; i < message.length(); i++) {
         if (letters.containsKey(message.charAt(i))){
            
             ans.append(letters.get(message.charAt(i)));
         }else{
             ans.append(message.charAt(i));
           
         }
     }
     return ans.toString();
     
 }

}
