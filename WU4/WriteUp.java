package code;

public class WriteUp {

	/*
	* Your job in this write-up is to do two things:
	*
	* 1) write tests for the required functionality of
	* the method described below
	*
	* 2) fix the bugs in the implementation of
	* the method described below
	*
	* Note that there are TWO implementations available.
	* They are equivalent. One uses a switch statement,
	* the other uses if-else statements. If you are
	* unfamiliar with switch statements, use the if-else
	* version.
	*
	* BE SURE TO UNCOMMENT THE CORRECT LINE IN THE DEFINITION
	* OF THE solution(String s) METHOD!!!!
	*/
	
	/*
	* The method solution accepts a String s as an argment
	* and should return true if and only if s consists of
	* an uppercase letter 'O', followed by one or more occurrences
	* of the lowercase letter 'o', followed by "h la la".
	*
	* Examples of input Strings for which the method must
	* return true:
	*
	* "Ooh la la"
	* "Oooh la la"
	* "Ooooh la la"
	* "Oooooh la la"
	* "Ooooooh la la"
	* "Oooooooh la la"
	*
	* Examples of input Strings for which the method must
	* return false:
	*
	* "Oh la la"
	* "Ooh la"
	* "Ooh la la la"
	* "Oooooh la la la la la la"
	* "ooh la la"
	* "Ooo la la"
	* "I like puppies!"
	* ""
	* null
	*/
	
	public boolean solution(String s) {
		return ifVersion(s);
	}
	
	private boolean ifVersion(String s) {
		int state = 0;
		
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (state == 0) {
				if (ch == 'O') { state = 1; }
				else return false;
			}
		
			else if (state == 1) {
				if (ch == 'o') { state = 2; }
				else return false;
			}
			else if (state == 2) {
				if (ch == 'h') { state = 3; }
				else if (ch == 'o') { state = 2; }
				else return false;
			}
			else if (state == 3) {
				if (ch == ' ') { state = 4; }
				else return false;
			}
			else if (state == 4) {
				if (ch == 'l') { state = 5; }
				else return false;
			}
			else if (state == 5) {
				if (ch == 'a') { state = 6; }
				else return false;
			}
			else if (state == 6) {
				if (ch == ' ') { state = 4; }
				else return false;
			}
			
			else {
				return false;
			}
			
		}
		return state == 6;
	}
}
