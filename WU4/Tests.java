package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import code.WriteUp;

public class Tests {
	
    @Test public void test00() {
        String str = "Ooh la la";
        boolean expected = true;
        WriteUp wu = new WriteUp();
        boolean actual = wu.solution(str);
        assertTrue("I was expecting " + expected + " but the actual value is " + actual , actual==expected);
    }
	
    @Test public void test01() {
        String str = "Oooooooooh la la";
        boolean expected = true;
        WriteUp wu = new WriteUp();
        boolean actual = wu.solution(str);
        assertTrue("I was expecting " + expected + " but the actual value is " + actual , actual==expected);
    }
	
    @Test public void test02() {
        String str = "Oooooh la la la la la la";
        boolean expected = false;
        WriteUp wu = new WriteUp();
        boolean actual = wu.solution(str);
        assertTrue("I was expecting " + expected + " but the actual value is " + actual , actual==expected);
    }
	
    @Test public void test03() {
        String str = "";
        boolean expected = false;
        WriteUp wu = new WriteUp();
        boolean actual = wu.solution(str);
        assertTrue("I was expecting " + expected + " but the actual value is " + actual , actual==expected);
    }
	
}
