package code;

public class WriteUp {
	/*
	* Define this method so that it returns a new String which has exactly same
	* characters as input, in the same order, except that any punctuation
	* character ( . , ! ? : ; ) is doubled.
	*
	* You may assume that the input String is not null.
	*
	* For example:
	* solution("Hi, there!") must return "Hi,, there!!"
	* solution("") must return ""
	* solution("Hi there") must return "Hi there"
	*
	*/
	
	public String solution(String input) {
		String str="";
		
		for(int i=0 ; i<input.length() ; i++)
		{
			if(input.charAt(i) == '.' || input.charAt(i) == ',' || input.charAt(i) == '!' || input.charAt(i) =='?' || input.charAt(i) ==':' || input.charAt(i) == ';') {
				str = str + input.charAt(i) + input.charAt(i);
			}
			else{
				str = str + input.charAt(i);
			}
			
		}
		
		return str;
	}
}
