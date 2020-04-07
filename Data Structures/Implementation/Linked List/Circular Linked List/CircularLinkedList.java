/*  Circular Linked List implementation */

package circularlinkedlist;

public class CircularLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int num = 11;
		for(int i = 1; i < 10; i++) {
			list.insert(num * i);
		}
		list.traverse();
	}

}

class Node {
	int data;
	Node next;
	Node prev;
	
	
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
			tail.next = head;
			head.prev = tail;
		}
	}
	
	// traverse: Traverse through list (this will be an infinite loop since it is circular)
	void traverse() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	
	}
	
	
	
}
