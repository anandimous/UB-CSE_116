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
    */
	
    /*
    * The method solution accepts a String s as an argment
    * and *should* return true if and only if s contains
    * matched opening <html> and closing </html> tags. Any
    * text can precede the opening tag, any text can come
    * between the <html> and </html> tags, and any text can
    * come after the closing </html> tag.
    *
    * Examples of input Strings for which the method must
    * return true:
    *
    * "<html></html>"
    * "Oooh la la <html><head></head><body><body></html> something else"
    * "<html></html><html></html><html></html>"
    * "<html><html><html></html></html></html>"
    *
    * Examples of input Strings for which the method must
    * return false:
    *
    * "</html><html>"
    * "<html>"
    * "</html>"
    * "I like puppies!"
    * ""
    * null
    */
	
    public boolean solution(String s) {
        if (s==null) { return false; }
		
        int state = 0;
		
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
			
            switch (state) {
                case 0:
                if (ch == '<') { state = 1; }
                else { state = 0; }
                break;
				
                case 1:
                if (ch == 'h') { state = 2; }
                else if (ch == '<') { state = 1; }
                else { state = 0; }
                break;
				
                case 2:
                if (ch == 't') { state = 3; }
                else if (ch == '<') { state = 1; }
                else { state = 0; }
                break;
                
				case 3:
                if (ch == 'm') { state = 4; }
                else if (ch == '<') { state = 1; }
                else { state = 0; }
                break;
                
				case 4:
                if (ch == 'l') { state = 5; }
                else if (ch == '<') { state = 1; }
                else { state = 0; }
                break;
                
				case 5:
                if (ch == '>') { state = 10; }
                else if (ch == '<') { state = 1; }
                else { state = 0; }
                break;
                
				case 10:
                if (ch == '<') { state = 11; }
                else { state = 10; }
                break;
                
				case 11:
                if (ch == '/') { state = 12; }
                else if (ch == '<') { state = 11; }
                else { state = 10; }
                break;
                
				case 12:
                if (ch == 'h') { state = 13; }
                else if (ch == '<') { state = 11; }
                else { state = 10; }
                break;
                
				case 13:
                if (ch == 't') { state = 14; }
                else if (ch == '<') { state = 11; }
                else { state = 10; }
                break;
                
				case 14:
                if (ch == 'm') { state = 15; }
                else if (ch == '<') { state = 11; }
                else { state = 10; }
                break;
                
				case 15:
                if (ch == 'l') { state = 16; }
                else if (ch == '<') { state = 11; }
                else { state = 10; }
                break;
                
				case 16:
                if (ch == '>') { state = 17; }
                else if (ch == '<') { state = 11; }
                else { state = 10; }
                break;
                
				case 17:
                break;
            }
        }
        return state == 17;
		
    }
}
