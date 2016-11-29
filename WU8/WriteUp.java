package code;

import java.util.HashSet;
import brstruct.BRStruct;
import brstruct.BRStruct.IAlgo;

/**
* A visitor for a BRStruct<E> that adds all members of the tree to
* the HashSet<E> passed in as argument.
*
* Hint: The HashSet has a method add(E e).
*/

public class Visitor<E> implements IAlgo<Void, E, HashSet<E>>{
	
    @Override public Void emptyCase(BRStruct<E> host, HashSet<E> set) {
        return null;
    }
	
    @Override public Void nonEmptyCase(BRStruct<E> host, HashSet<E> set) {
        set.add(host.getDatum());
        set.add(host.getRight().getDatum());
        set.add(host.getLeft().getDatum());
        return null;
    }
	
}
