/* Array implementation of queue data structure */

package queue;

public class MyQueue <E> {
	final int INITIAL_SIZE = 4;
	int front = -1;		// remove things here -- empty queue starts at -1
	int rear = -1;		// add things here -- empty queue starts at -1 
	boolean reachCapacity = false;
	boolean empty = true;
	E[] elements = null;
	int size = 0;
	
	MyQueue() {
		elements = (E[]) new Object[INITIAL_SIZE];
	}
	
	/* add: Inserts the specified element into this queue if it is possible to do so 
	 * without immediately without violating capacity restrictions
	 * Empty array - Front = -1, Rear = -1
	 * First addition -  Front = 0, Rear = 0
	 * Second addition F = 0, R = 1; */
	public boolean add(E e) throws IllegalStateException {
		try {
			// First check if array is full
			isEmpty();
			if(empty == true) {
				front++;
				rear++;
				elements[rear] = e;
				empty = false;
				reachCapacity = false;
				// Check if it is full; if it is do not add it to array
			} else { 
				if(rear == INITIAL_SIZE - 1) {
					reachCapacity = true;
					System.out.println("FULL");
				// If it isn't, add it to array	
				} else {
					rear++;
					elements[rear] = e;
					reachCapacity = false;
				}
			}
		} catch(IllegalStateException ex) {
			System.out.println("FULL");
		}
		return reachCapacity;
	}
	/* peek: Retrieves, but does not remove, the head of this queue
	 * Retrieves, but does not remove, the head of this queue */
	public E peek() {
		if(isEmpty() == true) {
			return null;
		}
		return elements[front];
	}
	
	/* remove: Retrieves and removes the head of this queue 
	 * First removal moves front forward +1 until it equals rear */ 
	public E remove() {
		E e = null;
		// Check if empty
		isEmpty();
		// If it's empty return null
		if(empty == false) {
			// Check if front = rear; remove and return element
			if(front == rear) {
				e = elements[front];
				// Front and rear will be -1; creating an "empty array"
				front = -1;
				rear = -1;
				empty = true;
				return e;
			// Return element, move front forward +1	
			} else {
				e = elements[front];
				front++;
				return e;
			}
		} 
		return null;
	}
	
	/* isEmpty: Check if array is empty */
	public boolean isEmpty() {
		if(front == -1 && rear == -1) {
			empty = true;
		} else {
			empty = false;
		}
		return empty;
	}
	
	/* sizeL Current size of array */
	public int size() {
		size = rear + 1;
		return size;
	}
	
	/* reachCapacity: Returns boolean if array reach maximum size */
	public boolean reachCapcity() {
		if(reachCapacity == true) {
			System.out.println("full");
			reachCapacity = true;
			return reachCapacity;
		} else {
			reachCapacity = false;
		}
		return reachCapacity;
	}
}
