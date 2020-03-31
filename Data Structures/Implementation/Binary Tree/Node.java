/* Binary Tree (recursive) */

package binarytree;

public class Node {
	int data;		// root value
	Node left;
	Node right;
	
	// Constructor will be the first node/root node
	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	void insert(int newValue) {
		// If newValue is less than or equal to data in node
		// Look to left and right to see where we want to insert it
		if(newValue <= data) {
			// BASE CASE -- STOPPING CONDITION
			// If newValue meets condition, then we insert it on the left side  
			// If node on left doesn't exist, create one with newValue
			if(left == null) {
				left = new Node(newValue);	
			} else {
				// If it already does, insert it   
				left.insert(newValue);
			}
			// If newValue is greater than data, insert Node on right
		} else {
			// BASE CASE -- STOPPING CONDITION
			// If there is no right node, create a new one
			if(right == null) {
				right = new Node(newValue);
			} else {
				// Ask right to insert node 
				right.insert(newValue);
			}
		}
		
	}
	
	boolean contains(int value) {
		// BASE CASE -- STOPPING CONDITION
		if(value == data) {
			return true;
		// If value is less than data, check if left exists	
		} else if (value < data) {
			// If not, return false
			if(left == null) {
				return false;
			// If it does, recursive call to left node
			} else {
				return left.contains(value);
			}		
		// If value is greater than data, check if right exists	
		} else {
			// If not, return false
			if(right == null) {
				return false;
			} 
		}
		// If it does, recursive call to right node
			return right.contains(value);

	}
	
	void printInorder() {
		// Left 
		if(left != null) {
			left.printInorder();
		}
		// Root
		System.out.println(data);
		// Right
		if(right != null) {
			right.printInorder();
		} 
		
	}
	
	void printPostorder() {
		// Left
		if(left != null) {
			left.printPostorder();
		}
		// Right
		if(right != null) {
			right.printPostorder();
		}
		// Root
		System.out.println(data);
	}
	
	void printPreorder() {
		// Root
		System.out.println(data);
		// Left
		if(left != null) {
			left.printPreorder();
		}
		// Right
		if(right != null) {
			right.printPreorder();
		}
	}



}
