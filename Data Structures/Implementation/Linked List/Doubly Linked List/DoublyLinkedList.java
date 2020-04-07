/* Doubly Linked List implementation */

package doublylist;

public class DoublyLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int num = 11;
		for(int i = 1; i < 10; i++) {
			list.insert(num * i);
		}
		list.traverseBackward();
	}

}

class Node {
	int data;
	Node prev;
	Node next;
	
	Node(int data) {
		this.data = data;
	}
	
}

class LinkedList {
	Node head;
	Node tail;
	
	LinkedList() {
		
	}
	
	// insert: Insert node into list
	void insert(int data) {
		Node node = new Node(data);
		if(tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = tail.next;
		}
	}
	
	// traverseForward: Traverse forward through list
	void traverseForward() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	// traverseBackward: Traverse backward through list
	void traverseBackward() {
		Node current = tail;
		while(current != null) {
			System.out.println(current.data);
			current = current.prev;
		}
	}
	
	
}
