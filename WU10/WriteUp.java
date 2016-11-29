package code;

import stack.EmptyStackException;
import stack.Stack;

public class Queue<E> implements IQueue<E> {
	
    /**
    * Implement a Queue which uses two Stacks as storage.
    *
    * Declare instance variables (and a constructor) as
    * appropriate. Define the methods below. Run the provided
    * JUnit tests and ensure they all pass.
    *
    * You must use the Stack implementation provided in the "stack" package.
    * Ensure the peek and dequeue methods throw an
    * EmptyQueueExceptions when appropriate.
    *
    * HINTS:
    * 1) enqueue must push data onto the first stack
    * 2) dequeue must pop data from the second stack
    * 3) shift data from first to second stack when second stack is empty
    */
	
    private Stack<E> s1;
    private Stack<E> s2;
	
    public Queue(){
        s1 = new Stack<E>();
        s2 = new Stack<E>();
    }
	
    @Override
    public void enqueue(E item) {
        s1.push(item);
    }
	
    @Override
    public E dequeue() {
        if(s1.isEmpty()){
            throw new EmptyStackException("Cannot pop an empty stack.");
        }
        else{
            if(s2.isEmpty()){
                E item = s1.pop();
                s2.push(item);
            }
            return s2.pop();
        }
    }
	
    @Override
    public E peek() {
        if(s1.isEmpty()) {
            throw new EmptyStackException("Cannot pop an empty stack.");
        }
        else {
            return s1.peek();
        }
    }
	
    @Override
    public boolean isEmpty() {
        return false;
    }
	
}
