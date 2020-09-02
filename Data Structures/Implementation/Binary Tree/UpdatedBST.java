package bst1;

import java.util.Stack;

public class TreeNode {
	int data;
	int size;
	TreeNode root;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.data = data;
		size = 1;
		if(root == null) {
			root = this;
		}
	}
	
	void insert(int value) {
		TreeNode node = new TreeNode(value);
		TreeNode current = root;
		
		while(current != null) {
			if(value < data && current.left != null) {
				current = current.left;
			} else if(value > data && current.right != null) {
				current = current.right;
			} else {
				break;
			}
		}
		
		if(value < current.data && current.left == null) {
			current.left = node;
		} else if(value > current.data && current.right == null) {
			current.right = node;
		}
		size++;
	}
	
	boolean insertRecursive(int value) {
		if(data == value) {
			return false;
		}
		
		if(data <= value) {
			if(left == null) {
				left = new TreeNode(value);
				size++;
				return true;
			} else {
				left.insertRecursive(value);
			}
		} else {
			if(right == null) {
				right = new TreeNode(value);
				size++;
				return true;
			} else {
				right.insertRecursive(value);
			}
		}
		return false;
	}
	
	void inorder() {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;
		
		while(!stack.isEmpty() || current != null) {
			if(current != null) {
				stack.push(current);
				current = current.left;
			} else {
				current = stack.pop();
				System.out.println(current.data);
				current = current.right;
			}
		}
	}
	
	void inorderRecursive() {
		TreeNode current = root;
		if(current.left != null) {
			left.inorderRecursive();
		}
		System.out.println(data);
		if(current.right != null) {
			right.inorderRecursive();
		}
	}
	
	boolean contains(int value) {
		TreeNode current = root;
		while(current != null) {
			if(value == current.data) {
				return true;
			} else if(value < current.data) {
				current = current.left;
			} else if(value > current.data) {
				current = current.right;
			}
		}
		return false;
	}
	
	int size() {
		return size;
	}
	
	int getRoot() {
		return data;
	}
	
	TreeNode getRootNode() {
		return root;
	}
	

}
