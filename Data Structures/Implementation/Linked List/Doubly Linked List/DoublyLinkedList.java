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
	
	// removeFirst: Remove first element in list
	void removeFirst() {
		Node current = head;
		head = current.next;
		current = null;
	}
	
	// removeLast: Remove last element in list
	void removeLast() {
		Node current = head;
		while(current != null) {
			if(current.next.next == null) {
				tail = current;
				current.next = null;
			}
			current = current.next;
		}
	}
	
	
	// addFirst: Add element to front of list
	void addFirst(int data) {
		Node node = new Node(data);
		node.next = head;
		head.prev = node;
		head = node;
	}
	
	// addLast: Add element to end of list
	void addLast(int data) {
		Node current = head;
		while(current != null) {
			if(current.next == null) {
				Node node = new Node(data);
				current.next = node;
				node.prev = current;
				tail = node;
				break;
			}
			current = current.next;
		}
	}
	
	// delete: Delete current node (doubly linked list algorithm)
	void delete(int data) {
		Node current = head;
		Node previous = null;
		// traverse through list to find data
		while(current != null) {
			if(current.data == data) {
				break;
			}
			previous = current;			// tracks the previous node
			current = current.next;
			}
		// Previous is null so that means this head of list
		if(previous == null) {
			head = current.next;
		} else {
			current.next.prev = current.prev;
			current.prev.next = current.next;
		}
		
	}
	
	// contains: Checks if value is in list (iterative)
	boolean contains(int data) {
		Node current = head;
		while(current != null) {
			if(current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	
}
