/* Binary Tree (recursive) */

package binarytree;

public class Node {
	int data;		// root value
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

		// CASE 1 -- Not in tree
		
		

		// CASE 2 -- If no children -- LEAF
		if(current.left == null && current.right == null) {
			if(current.data < parent.data) {
				parent.left = null;
			} else {
				parent.right = null;
			}
			
		}
		
		// CASE 3 -- If its the root 
		// Go to the left, then as far right as possible
		else if(parent == null) {
			Node leftChild;
			Node rightChild;
			Node leftMost;
			Node rightMost;
			Node rightMostParent = null;

			/* LEFT SIDE */
			// Save left and right child of root
			leftChild = current.left;
			rightChild = current.right;
			// Find second largest node on left side of tree -- rightMost 
			if(current.left != null) {
				// Go left
				rightMost = current.left;
				// Keep going to the right
				while(rightMost != null) { 
					// If there isn't a right then rightMost will be the current value
					if(rightMost.right == null) {
						break;
					}
					rightMostParent = rightMost;
					rightMost = rightMost.right;
				}
				// Check if rightMost has a left child 
				// If it does it must connect to parent of rightMost
				if(rightMost.left != null) {
					rightMostParent.right = rightMost.left;
				}

				// Connect 
				current.data = rightMost.data;		// copy contents into root node
				rightMostParent.right = null;
			} else {
				if(current.right != null) {
					// Go right
					leftMost = current.right;
					// Keep going to the left
					while(leftMost.left != null) {
						// If there isn't a right left then rightMost will be the current value
						if(leftMost.left == null) {
							break;
						}
						leftMost = leftMost.left;
						// Connect
						leftChild = current.left;
						rightChild = current.right;
						current = leftMost;
						current = null;
						
					}
				}
			}
		}
			/* RIGHT SIDE */
			// Find second smallest node on right side of tree -- leftMost
		// CASE 3 -- If one child
		else if(current.left == null || current.right == null) {
			/* LEFT SIDE */
			// Look to the left of parent -- b/c we are going need to connect to it -- need to know which side to connect
			if(current.data < parent.data) {
				// Data is less than parent data so we now know we have to connect to parents left
				if(current.left != null) {
				// If there is a left node then we do this	
					parent.left = current.left;
					current = null;
				} else {
				// If there is a right node	then we do this 
					parent.left = current.right;
					current = null;
				}

				/* RIGHT  SIDE */
				// Look to the right of parent -- b/c we are going need know which side of parent to connect to
			} else {
				// We have to connect to parents right
				if(current.right != null) {
				// If there is a left node then we do this	
					parent.right = current.right; 
					current = null;
				} else {
				// If there is a right node	then we do this
					parent.right = current.left;
					current = null;
				}

			}
			// CASE 4 -- If two children  
			// Find leftmost child of right subtree -- go to right, then go as far left as possible
		} else if(current.left != null && current.right != null) {
			// We don't know which side current (child) is on parent -- this will verify
			Node leftMostParent = null;	// temp to track parent of leftmost node -- needed to remove connection
			Node leftMost;
			Node leftChild;			// temp hold left node child node of soon to be deleted node
			Node rightChild;		// temp hold right child node of soon to be deleted node
			/* LEFT SIDE */
			if(current.data < parent.data) {
				// Save right child (and its tree)
				rightChild = current.right;
				// Check if there is a right node
				if(current.right != null) {
					leftMost = current.right;
					// Find left most node -- go as far left as possible
					while(leftMost.left != null) { 
						if(leftMost.left == null) {
							break;
						}
						// Need to track parent of left most node 
						leftMostParent = leftMost;
						// Need parent of leftmost to remove connection to left side
						leftMost = leftMost.left;
					}
					// If right child doesn't have a left child -- set parent to current
					if(leftMostParent == null) {
						leftMostParent = current; 
					}
				} else {
					// There isn't a left node -- we just take the right node instead
					leftMost = current.right;
				}
				current.data = leftMost.data;
				// Need parent of leftmost to remove connection to left side
				leftMostParent.right = null;   
			/* RIGHT SIDE */
			} else {
				leftChild = current.left;
				if(current.right != null) {
					leftMost = current.right; 
					
				
					// Find left most node -- go as far left as possible 
					while(leftMost.left != null) {
						if(leftMost.left == null) {
							break;
						}
						// Need to track parent of left most node
						leftMostParent = leftMost;
						leftMost = leftMost.left;
					}
				} else {
					// There isn't a left node -- we just take the right node instead
					leftMost = current.right;
				}
				
				current.data = leftMost.data;
				// Need parent of leftmost to remove connection to left side
				leftMostParent.left = null;
				
			}

		} 

	}


}
