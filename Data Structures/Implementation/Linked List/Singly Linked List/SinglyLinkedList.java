/* Singly Linked List */

package linkedlist;

public class SinglyLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int num = 11;
		for(int i = 1; i < 10; i++) {
			list.insert(num * i);
		}
		list.traverse();
		list.removeFirst();
		System.out.println();
		list.traverse();
		list.removeLast();
		System.out.println();
		list.traverse();
	}

}

class Node {
	int data;
	int index;				// create an index for this node
	Node next;
	
	
	Node(int data) {
		this.data = data;
	}
	
}

class LinkedList {
	Node head;
	Node tail;
	int size;
	
	LinkedList() {
		
	}
	
	// insert: Insert node into list
	void insert(int data) {
		Node node = new Node(data);
		if(tail == null) {
			head = tail = node;
			size = 1;
			node.index = size - 1;
		} else {
			tail.next = node;
			tail = tail.next;
			size++;
			node.index = size - 1; 
		}
	}
	
	// traverse: Traverse list
	void traverse() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	// removeFirst: Removes the first node in the list
	int removeFirst() {
		Node temp = head;
		if(temp.next == null) {	
			head = tail = null;
		}
		head = head.next;
		// Size will decrease -- Node indices will have to be adjusted
		size--;
		return temp.data;
	}
	
	// removeLast(): Removes the last node in list
	int removeLast() {
		Node current = head;
		Node temp = tail;
		if(temp.next == null) {
			head = tail = null;
		}
		while(current != null) {
			if(current.next.next == null) {
				tail = current;
				temp = tail.next;
				tail.next = null;
			}
			current = current.next;
		}
		// Size will decrease -- Node indices will have to be adjusted
		size--;
		return temp.data;
		
	}
	
	int size() {
		return size;
	}
	
	// delete: Delete current node (singly linked list algorithm)
	void delete(int data) {
		Node current = head;
		Node previous = null;			// pointer to previous node
		while(current != null) {
			if(current.data == data) {
				break;
			}
			previous = current;
			current = current.next;
		}
		if(previous == null) {
			head = current.next;
		} else {
			previous.next = current.next; 
		}
		
	
	}
	
	
}

