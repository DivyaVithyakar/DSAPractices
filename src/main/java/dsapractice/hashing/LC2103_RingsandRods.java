package dsapractice.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LC2103_RingsandRods {
	/*
	 * There are n rings and each ring is either red, green, or blue. The rings are distributed across ten rods labeled from 0 to 9.
     *You are given a string rings of length 2n that describes the n rings that are placed onto the rods. 
     *Every two characters in rings forms a color-position pair that is used to describe each ring where:
     *The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
     *The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
     *For example, "R3G2B1" describes n == 3 rings: 
     *a red ring placed onto the rod labeled 3, a green ring placed onto the rod labeled 2, and a blue ring placed onto the rod labeled 1.
     *Return the number of rods that have all three colors of rings on them.
     *
     *
     *Input - String 
     *Output - Int
     *
     *2. Test data set 
     * Test Data 1
     * Input : rings = "B0B6G0R6R0R6G9"
     * Output : 1
     * 
     * Test Data 2
     * Input : rings = "B0R0G0R9R0B0G0"
     * Output : 1
     * 
     * Test Data 3
     * Input : rings = "G4"
     * Output : 0
     * 
     * 5.Pseudo code 
     * ->Create map to store
     * ->Iterate using for loop until length
     *   ->when map doesn't contain key of ringNum
     *
     * Time Complexity - 
     * Space Complexity -



	 */
	
	
	public int countPoints(String rings) {
		int count = 0;
		if (rings.length() == 0)
			return count;

		Map<Integer, HashSet<Character>> map = new HashMap<Integer, HashSet<Character>>();

		for (int i = 0; i < rings.length();) {

			Integer ringNo = Character.getNumericValue(rings.charAt(i + 1));
			Character color = rings.charAt(i);

			if (!map.containsKey(ringNo)) {
				map.put(ringNo, new HashSet<Character>());
				map.get(ringNo).add(color);
			} else
				map.get(ringNo).add(color);

			i = i + 2;
		}

		for (HashSet<Character> set : map.values()) {

			if (set.size() == 3)
				count++;
		}

		return count;
	}

}
