package code;

public class WriteUp {
	/*
	* Define this method so that it accepts a String as
	* input (a String you may assume consists only of
	* UPPER CASE LETTERS, 'A' through 'Z').
	*
	* Define the method so it returns a new String
	* consisting of the characters from input each shifted
	* by one value in the character encoding ('A' is shifted
	* to 'B', 'B' to 'C', ... and 'Z' is shifted back to 'A').
	*
	* Examples:
	* solution("ABC") must return "BCD"
	* solution("XYZ") must return "YZA"
	* solution("") must return ""
	* solution("COOL") must return "DPPM"
	*
	* You may assume that input is not null.
	*
	*/
	
	public String solution(String input) {
		String s = "";
		String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i=0 ; i<input.length() ; i++) {
			for(int j=0 ; j<s1.length() ; j++){
				
				char ch = input.charAt(i);
				char ch1 = s1.charAt(j);
				
				if(ch == 'Z') {
					s = s + 'A';
				}
				else if(ch == ch1){
					s = s + s1.charAt(j+1);
				}
				
			}
		}
		
		return s;
	}
}
