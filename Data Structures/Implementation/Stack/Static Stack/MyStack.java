/* Array implementation of a stack data structure 
 * Array has an initial capacity of two
 * */

package stack;

public class MyStack <E> {
	final int INITIAL_CAPACITY = 2;		// default size
	int arraySize = INITIAL_CAPACITY;	// total array size 
	E[] elements = null;				// generic array
	int top = 2;						// initial pointer location is "outside" of array		
	int bottom = 2;						// initial pointer location is "outside" of array
	boolean empty = true;
	boolean reachCapacity = false;
	int size = 0;
	
	MyStack() {
		elements = (E[])(new Object[INITIAL_CAPACITY]);
	}
	
	/* push: Pushes an item onto the top of this stack */
	// Start at INITIAL_CAPACITY
	public void push(E e) {
		// Check if stack is empty
		isEmpty();
		if(empty == true) {
			top -= 1;					// moves pointer to location "inside" of array 
			bottom -= 1;				// moves pointer to location "inside" of array
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
	
	/* pop: Removes the object at the top of this stack
	 * Returns that object as the value of this function
	 */
	public E pop() {
		E e = null;
		// Check if stack is empty -- if it is return null
		// Java stack class throws EmptyStackException if there is nothing to remove in the stack
		isEmpty();
		if(empty == true) {
			e = null;
		} else {
		// If it isn't, remove and return element at top of stack
			e = elements[top];
			top++;
			size--;
			// If final element is removed, set bottom to INITIAL_CAPACITY
			// Returns back to an empty stack
			if(top == arraySize) {
				bottom = arraySize;
			}
		}
		
		return e;
	}
	
	/* peek: Looks at the object at the top of this stack without removing it from the stack */
	public E peek() {
		E e = null;
		// Check if top of stack equals arraySize + 1 ("outside" of array) 
		// If it does, the stack is empty - return null
		if(top == arraySize) {
			return null;
		// If it doesn't return the value
		} else {
			e = elements[top];
		}
		return e;
	}
	/* isEmpty: Tests if this stack is empty */
	public boolean isEmpty() {
		// If top = 4; it is empty -- REMEMBER STACK STARTS AT 3
		if(top == arraySize) {
			empty = true;
			return empty;
		} 
		empty = false;
		return false;
	}
	
	/* size: Returns the size of the stack */
	public int size() {
		return size;
	}
	
	/* reachCapacity: Tests if stack has reach capacity */
	public void reachCapacity() {
		if(top == 0) {
			reachCapacity = true;
		} else {
			reachCapacity = false;
		}
	}
	
	/* getTop: Returns the index number of the top of the stack */
	public int getTop() {
		return top;
	}
	
	/* getBottom: Returns the index number of the bottom of the stack */
	public int getBottom() {
		return bottom;
	}
	
}
