package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import code.WriteUp;

public class Tests {
    
	WriteUp w = new WriteUp();
	
    @Test public void test00() {
        String s = "<html></html>";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be" + b + "but it was" + b1, b==b1);
    }
	
    @Test public void test01() {
        String s = "Oooh la la <html><head></head><body><body></html> something else";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be" + b + "but it was" + b1, b==b1);
    }
	
    @Test public void test02() {
        String s = "<html></html><html></html><html></html>";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be" + b + "but it was" + b1, b==b1);
    }
	
    @Test public void test03() {
        String s = "<html><html><html></html></html></html>";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be" + b + "but it was" + b1, b==b1);
    }
	
    @Test public void test04() {
        String s = "<html>";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be " + b + " but it was " + b1, b!=b1);
    }
	
    @Test public void test05() {
        String s = null;
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be " + b + " but it was " + b1, b!=b1);
    }
	
    @Test public void test06() {
        String s = "</html><html>";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be " + b + " but it was " + b1, b!=b1);
    }
	
    @Test public void test07() {
        String s = "</html>";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be " + b + " but it was " + b1, b!=b1);
    }
	
    @Test public void test08() {
        String s = "I like puppies!";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be " + b + " but it was " + b1, b!=b1);
    }
	
    @Test public void test09() {
        String s = "";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be " + b + " but it was " + b1, b!=b1);
    }
	
    @Test public void test10() {
        String s = "<<html></html>>";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be " + b + " but it was " + b1, b==b1);
    }
	
    @Test public void test11() {
        String s = "<html>>/html<";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be " + b + " but it was " + b1, b!=b1);
    }
	
    @Test public void test12() {
        String s = "<ht<<>ml><html></html>";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be " + b + " but it was " + b1, b==b1);
    }
	
    @Test public void test13() {
        String s = "<<<>><html>";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be " + b + " but it was " + b1, b!=b1);
    }
	
    @Test public void test14() {
        String s = "<ht</ht<<</html>ml>";
        Boolean b = true;
        Boolean b1 = w.solution(s);
        assertTrue("I expected anser to be " + b + " but it was " + b1, b!=b1);
    }
	
}
