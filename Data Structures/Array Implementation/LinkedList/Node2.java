package linkedlist;


// Node class wraps "around" LinkedList class
public class Node {
	Node next;
	int data;
	
	Node() {
		
	}
	
	Node(int data) {
		this.data = data;
	}
	
	static void traverse(Node head) {
		for(Node x = head; x != null; x = x.next) {
			System.out.println(x.data);
		}
	}
	
	static void traverseWhile(Node head) {
		Node current = new Node();
		current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;					// increment to next node
		}
	}
	
	public static void main(String[] args) {
		Node node = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		
		node.next = node1; 
		node1.next = node2;
		System.out.println("Traverse LinkedList using for-loop");
		traverse(node);
		System.out.println("\nTraverse LinkedList using While-loop");
		traverseWhile(node);
	}
	
}
