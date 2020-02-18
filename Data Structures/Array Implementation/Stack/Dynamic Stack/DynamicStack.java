/* Array implementation of a stack data structure 
 * Array inherits methods from the MyStack class
 * Overrides push method and creates a new array when capacity has been reached
 * Array size is double that of the previous array
 * */

package stack;

public class DynamicStack <E> extends MyStack<E> {
	
	DynamicStack() {
		elements = (E[])(new Object[INITIAL_CAPACITY]);
	}
	
	@Override
	/* push: Pushes an item onto the top of this stack 
	 * Size of array increases in size if push goes beyond INITIAL_CAPACITY */
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
			// If it is, increase the size of the array
			/* CREATE A NEW ELEMENT ARRAY  -- ARRAYSIZE * 2
			 * TOP AND BOTTOM POINTERS WILL HAVE TO MOVE
			 * SIZE WILL HAVE TO INCREASE
			 */
			if(reachCapacity == true) {
				arraySize *= 2;
				E[] newElements = (E[])(new Object[arraySize]);
				// Reverse copy array contents to new array
				for(int i = size - 1; i >= 0; i--) {
					// Increment new array index, decrement old array index
					newElements[size + i] = elements[i];
				}
				// Change location of top and bottom pointer
				top = arraySize / 2; 	// top will be center of new array - 1
				bottom = arraySize - 1;
				top--;					// move pointer so new value can be added to top of stack
				newElements[top] = e;
				size++; 				// increase size of array by 1 
				elements = newElements; 
				System.out.println("Array Size: " + arraySize);
			} else {
			    // If it's not full add value to top of stack
				top--;
				size++;
				elements[top] = e;
			}
					
		}
		
	}
	
	

}
