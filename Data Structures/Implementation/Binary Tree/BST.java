package binarytree;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	TreeNode tree = new TreeNode(6);
	tree.insert(4);
	tree.insert(-2);
	tree.insert(9);
	tree.insertRecursive(100);
	tree.insertRecursive(-200);
    tree.inorderStack();
    boolean inTree = tree.contains(4);
    System.out.println(inTree);
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
            if(value == current.data){
                break;
            } else if(value < current.data && current.left != null){
                current = current.left;
            } else if(value > current.data && current.right != null){
                current = current.right;
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

    void insertRecursive(int value){
        if(value == data){
            return;
        }

        if(value < data){
            if(left != null){
                left.insertRecursive(value);
            }
        } else if(value > data){
            if(right != null){
                right.insertRecursive(value);
            }
        }

        if(value < data && left == null){
            left = new TreeNode(value);
        } else if(value > data && right == null){
            right = new TreeNode(value);
        }
    }

    void delete(int value){
        // Find the node to delete and its parent
        TreeNode parent = null;
        TreeNode current = root;
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

        // Case 1: If there is no left node --> connect parent with current node successor
        if(current.left == null){
            if(parent == null){
                root = current.right;
            } else if(value < current.data){
                parent.left = current.right;
            } else if(value > current.data){
                parent.right = current.right;
            }
        // Case 2: If there is a left node --> find max and parent of max in left subtree
        } else{
            TreeNode parentOfRightMost = current;
            TreeNode rightMost = current.left;
            while(current.right != null){
                parentOfRightMost = current;
                current = current.right;
            }
            if(parentOfRightMost.right == rightMost){
                parentOfRightMost.left = rightMost.left;
            } else{
                parentOfRightMost.right = rightMost.left;
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

    void inorderStack(){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(!stack.isEmpty() || current != null){
            if(current != null){
                stack.push(current);
                current = current.left;
            } else{
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
        System.out.println();
    }
    
}
