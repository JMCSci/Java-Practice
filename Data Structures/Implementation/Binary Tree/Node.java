/* Binary Tree (recursive) */

package binarytree;

public class Node {
	int data;		// root value
	static int leaves;
	Node left;
	Node right;
	Node root;
	
	// Constructor will be the first node/root node
	Node(int data) {
		this.data = data;
		if(root == null) {
		   this.root = this;
		}
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
	
	// containsR: Searches for node (Recursive)
	boolean containsR(int value) {
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
				return left.containsR(value);
			}		
		// If value is greater than data, check if right exists	
		} else {
			// If not, return false
			if(right == null) {
				return false;
			} 
		}
		// If it does, recursive call to right node
			return right.containsR(value);

	}
	
	// containI: Searches for node (Iterative) 
	boolean containsI(int data) {
		Node current = root;
		while(current != null) {
			if(data == current.data) {
				return true;
			}
			if(data < current.data) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return false;
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
	
	// min: Returns the smallest number in the tree
	int min() {
		Node current = root;
		if(current.left == null) {
			return current.data;
		} else {
			while(current != null) {
				if(current.left == null) {
					break;
				}
				current = current.left;
			}
			return current.data;
		}
	
	}
	
	// max: Returns the largest number in the tree
	int max() {
		Node current = root;
		if(current.right == null) {
			return current.data;
		} else {
			while(current != null) {
				if(current.right == null) {
					break;
				}
				current = current.right;
			}
			return current.data;	
		}
	}
	
	
	void delete(int value) {
		// Find node
		Node current = root;		 			
		Node parent = null;						// keep track of node to be removed parent 
		while(current != null) {
			if(value == current.data) {		
				break;							// stop checking when value is found - current node and parent node are now saved
			} else {
				parent = current;
				if(value < current.data) {
					current = current.left;
				} else {
					current = current.right;
				}
			}
		}
		// Check if current's left is null
		// If it is...
		if(current.left == null) {
			// Check if parent node is null
			// Set root equal to current's right
			if(parent == null) {
				root = current.right;
			} else { 
				// If current is less than parent
				// Set parents's left equal to current's right
				// Or else, set parent's right equal to current's right
				if(current.data < parent.data) {
					parent.left = current.right;
				} else {
					parent.right = current.right;
				}
			}
		// If current's left is not null
		} else {
			Node rightMostParent = current;
			// Set rightMost to the current node's left
			Node rightMost = current.left;
			// If there is a right node, keep going right
			while(rightMost.right != null) {
				rightMostParent = rightMost;
				rightMost = rightMost.right;
			}
			// Change contents of current node with those of rightMost node
			current.data = rightMost.data;
			// Check if rightMost's parent is rightMost
			// If it is, set it to rightMost's left -- which should be null
			// Or else, set it rightMost's parent' left equal to rightMost's left  
			if(rightMostParent.right == rightMost) {
				rightMostParent.right = rightMost.left;
			} else {
				rightMostParent.left = rightMost.left;
			}
					
		}
		
	}
	
	// numberOfLeaves: Returns number of leaves in tree
	int numberOfLeaves() {
		if(left == null && right == null) {
			leaves++;
		}
		if(left != null) {
			left.numberOfLeaves();
		}
		if(right != null) {
			right.numberOfLeaves();
		}
			return leaves;
		}



}
