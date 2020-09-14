package binarytree;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	TreeNode tree = new TreeNode(6);
	tree.insert(1);
	tree.insert(5);
	tree.insert(0);
	tree.insert(2);
	tree.insert(4);
	tree.insert(8);
	tree.inorderStack();
	tree.min();
	tree.max();
	System.out.println(tree.contains(-1));
	tree.delete(4);
	tree.inorder();
    }
}

class TreeNode {
    int data;
    TreeNode root;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        if(root == null){
            root = this;
        }
    }

    void insert(int value){
        TreeNode node = new TreeNode(value);
        TreeNode current = root;
        while(current != null){
            if(value < current.data && current.left != null){
                current = current.left;
            } else if(value > current.data && current.right != null){
                current = current.right;
            } else if(value == current.data){
                return;
            } else{
                break;
            }
        }
        if(value < current.data && current.left == null){
            current.left = node;
        } else if(value > current.data && current.right == null){
            current.right = node;
        }
    }

    void delete(int value){
        // Find the node to be deleted AND its parent
        TreeNode current = root;
        TreeNode parent = null;
        while(current != null){
            if(value == current.data){
                break;
            } else if(value < current.data){
                parent = current;
                current = current.left;
            } else if(value > current.data){
                parent = current;
                current = current.right;
            }
        }
        // CASE 1: There is no left node --> connect predecessor to successor
        if(current.left == null){
            if(parent == null){
                root = current.right;   // If node to be deleted is the root node
            } else{
                if(value < parent.data){
                    parent.left = current.right;
                } else if(value > parent.data){
                    parent.right = current.right;
                }
            }
            return;
        }
        // CASE 2: There is a left node --> find max value in left subtree AND its parent
        if(current.left != null) {
            TreeNode rightMost = current.left;
            TreeNode parentOfRightMost = current;
            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            current.data = rightMost.data;     // Exchange values

            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;   // Delete node
            } else {
                parentOfRightMost.left = rightMost.left;
            }
        }
    }

    boolean contains(int value){
        TreeNode current = root;
        while(current != null){
            if(value == current.data){
                return true;
            } else if(value < current.data){
                current = current.left;
            } else if(value > current.data){
                current = current.right;
            }
        }
        return false;
    }

    int min(){
        TreeNode current = root;
        while(current.left != null){
            current = current.left;
        }
        System.out.println(current.data);
        return current.data;
    }

    int max(){
        TreeNode current = root;
        while(current.right != null){
            current = current.right;
        }
        System.out.println(current.data);
        return current.data;
    }

    void inorderStack(){
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                System.out.print(current.data + " ");
                current = current.right;
            }
        }
        System.out.println();
    }

    void inorder(){
        if(left != null){
            left.inorder();
        }
        System.out.print(data + " ");
        if(right != null){
            right.inorder();
        }
    }


}
