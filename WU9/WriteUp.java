package code;

import brstruct.BRStruct;
import brstruct.BRStruct.IAlgo;

/**
* Define this BRStruct<String> visitor so that it returns true
* if every String in the BRStruct ends with the Character ch,
* and false otherwise.
*
* Assume that all values in the tree are non-null, and that they
* refer to Strings that have length > 0.
*
* Recall that the number of characters in a String is given by the
* length() method.
*
*/

public class Visitor implements IAlgo<Boolean,String,Character> {
	
    @Override
    public Boolean emptyCase(BRStruct<String> host, Character ch) {
        return false;
    }
	
    @Override
    public Boolean nonEmptyCase(BRStruct<String> host, Character ch) {
        String str = "" + ch;
		
        if(host.getDatum().endsWith(str) && host.getLeft().execute(this, ch) && host.getRight().execute(this, ch)){
            return true;
        }
        else{
            return false;
        }
    }

}
