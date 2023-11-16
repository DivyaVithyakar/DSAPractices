package dsapractice.twopointers;

public class LC925_LongPressedName {
	
	/*
	 * Your friend is typing his name into a keyboard. Sometimes, when typing a character c, 
	 * the key might get long pressed, and the character will be typed 1 or more times.
     *You examine the typed characters of the keyboard. 
     *Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
     *
     *
     *Input - String,String
     *Output - Boolean
     *
     * Test Data 1
     * Input : name = "alex", typed = "aaleex"
     * Output : true
     * 
     * Test Data 2
     * Input : name = "saeed", typed = "ssaaedd"
     * Output : false
     * 
     * 
     * Pseudo code 
     * ->Count consecutive occurrences of nameChar in name
     * ->Compare consecutive occurrences of nameChar in typed
     * ->If typed doesn't have enough consecutive occurrences of nameChar
     * ->If j is not at the end of typed, it means there are extra characters in typed
     * ->If all conditions are satisfied, typed is a valid representation of name
     * 
     * Time Complexity - 
     * Space Complexity -



	 */
	
	public boolean isLongPressedName(String name, String typed) {
		if (name == null || name.length() == 0)
			return false;
		if (typed.length() < name.length())
			return false;
		if (typed.length() == name.length())
			return name.equals(typed);
		int i = 0;
		int j = 0;
		while (i < name.length()) {
			char nameChar = name.charAt(i);
			int count = 1;
			i++;
			while (i < name.length() && name.charAt(i) == nameChar) {
				i++;
				count++;
			}
			while (j < typed.length() && typed.charAt(j) == nameChar) {
				j++;
				count--;
			}
			if (count > 0) {
				return false;
			}
		}
		if (j != typed.length()) {
			return false;
		}
		return true;
	}

}
