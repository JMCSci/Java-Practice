
/* Implementation of a stack data structure */

package stack;

public class MyStack <E> {
	final int INITIAL_CAPACITY = 4;
	E[] elements = null;
	int top = INITIAL_CAPACITY;
	int bottom = INITIAL_CAPACITY;
	boolean empty = true;
	boolean reachCapacity = false;
	int size = 0;
	
	MyStack() {
		elements = (E[])(new Object[INITIAL_CAPACITY]);
	}
	
	// Start at INITIAL_CAPACITY
	public void push(E e) {
		// Check if stack is empty
		isEmpty();
		if(empty == true) {
			top -= 1;	// top = 3; bottom = 3 {bottom remains at INITIAL_CAPACITY - 1}
			bottom -= 1;
			size++;
			elements[top] = e;
			empty = false;
		} else {
			// Check if stack is full
			reachCapacity();
			// If it is, print message and do nothing
			if(reachCapacity == true) {
				System.out.println("FULL");
			} else {
				// If it is not full add value to top of stack
				top--;
				size++;
				elements[top] = e;
			}
			
		}
		
	}
	
	public void pop() {
		
		
	}
	
	public E peek() {
		E e = null;
		// Check if top of stack equals initial capacity; if it does, the stack is empty - return null
		if(top == INITIAL_CAPACITY) {
			return null;
		// If it doesn't return the value
		} else {
			e = elements[top];
		}
		return e;
	}
	
	public boolean isEmpty() {
		// If top = 4; it is empty -- REMEMBER STACK STARTS AT 3
		if(top == INITIAL_CAPACITY) {
			empty = true;
			return empty;
		} 
		empty = false;
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public void reachCapacity() {
		if(size == INITIAL_CAPACITY) {
			reachCapacity = true;
		} else {
			reachCapacity = false;
		}
	}
	
	

}
