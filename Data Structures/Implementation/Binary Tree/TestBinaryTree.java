/* Test Binary Tree */

package binarytree;

public class TestBinaryTree {
	public static void main(String[] args) {
		Node tree = new Node(1);
		boolean inTree = false;
		int value = 4;
		tree.insert(8);
		tree.insert(4);
		tree.insert(32);
		tree.insert(16);
		System.out.println("### Inorder Traversal ###\n");
		tree.printInorder();
		System.out.println("\n### Postorder Traversal ###\n");
		tree.printPostorder();
		System.out.println("\n### Preorder Traversal ###\n");
		tree.printPreorder();
		inTree = tree.contains(value);
		System.out.println("\nIs the number " + value + " in the binary tree ? " + inTree);
		
	}
	
}
