package code;

public class WriteUp {
    /*
    * In this write-up you will define TWO methods that will together
    * encode a String. One of the two method encodes a single char.
    * The other method encodes all of the characters of a String.
    */
	
    /*
    * THE FIRST METHOD:
    * Define a method
    *  public char encode(char ch) { ... }
    * so it encodes a single character by rearranging the bits in its
    * char representation. For example, 'm' is represented by this
    * 16 bit wide pattern:
    *
    * 0000 0000 0110 1101
    *
    * If we label each of these four groups of bits from left to right
    * as A, B, C, and D, then the original arrangement is ABCD.
    *
    * Define this method so it produces the rearrangement CDAB.
    *
    * How do you do this? Since we are looking at groups of 4 bits
    * you need to compute the quotient and remainder when dividing
    * by 2^4, or 16:
    *
    * ABCD / (16*16) yields AB
    * ABCD % (16*16) yields CD
    * CDAB is then CD * (16*16) + AB
    *
    * Remember that the result of arithmetic operations on char values
    * is of type int, and must be typecast back to char.
    */
	
    public char encode(char ABCD) {
        char ch = (char) ( ( (ABCD % (16*16)) * (16*16) ) + (ABCD / (16*16)) ) ;
        return ch;
    }
	
    /*
    * THE SECOND METHOD
    * Define a method
    *  public String encode(String input) { ... }
    * so that it encodes a String by creating a new String whose
    * characters are the encodings of the characters in input,
    * in the same order.
    *
    * You may assume that input is not null.
    */
	
    public String encode(String s) {
        String str = "";
		
        for ( int i=0 ; i<s.length() ; i++) {
            str = str + encode(s.charAt(i));
        }
		
        return str;
    }
	
}
