package dsapractice.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC819MostCommonWord {
	
	/*
	 * Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. 
	 * It is guaranteed there is at least one word that is not banned, and that the answer is unique.
     *The words in paragraph are case-insensitive and the answer should be returned in lowercase.
     *
     *
     *Input - String, string[]
     *Output - String
     *
     *2. Test data set 
     * Test Data 1
     * Input : Paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
     * Output : "ball"
     * 
     * Test Data 2
     * Input : paragraph = "a.", banned = []
     * Output : "a"
     * 
     * Test Data 3
     * Input :
     * Output :
     * 
     * 5.Pseudo code 
     * ->Initialize set to store the banned words
     * ->Iterate using for loop untill length of the array
     *   ->add the words into set
     * ->Create hash table
     * ->Iterate using for loop until length of the  paragraph input
     *   ->convert into lower case and add it into map, if alrdy added increase the count
     * ->Iterate using key entry set 
     * ->return the output string
     * 
     * 
     * 
     * Time Complexity - 
     * Space Complexity -


	 */
	
	public String mostCommonWord(String paragraph, String[] banned) {

		String[] paraArray = paragraph.split("[!?',;. ]+");

		Set<String> bannedSet = new HashSet<String>();

		for (int i = 0; i < banned.length; i++) {
			bannedSet.add(banned[i]);
		}

		Map<String, Integer> paraMap = new HashMap<String, Integer>();

		for (int i = 0; i < paraArray.length; i++) {

			if (paraMap.containsKey(paraArray[i].toLowerCase())) {
				paraMap.put(paraArray[i].toLowerCase(), paraMap.get(paraArray[i].toLowerCase()) + 1);
			} else {
				paraMap.put(paraArray[i].toLowerCase(), 1);
			}

			if (bannedSet.contains(paraArray[i].toLowerCase())) {
				paraMap.remove(paraArray[i].toLowerCase());
			}

		}

		int countMostFreqWord = 0;
		String mostFreqWord = "";

		for (String s : paraMap.keySet()) {
			if (paraMap.get(s) > countMostFreqWord) {
				mostFreqWord = s;
				countMostFreqWord = paraMap.get(s);
			}
		}

		return mostFreqWord;
	}
}
