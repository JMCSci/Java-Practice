/* Implementation of a Linked List */

package linkedlist;

public class Node {
	Node next;
	int data;
	
	Node() {
		
	}
	
	Node(int data){
		this.data = data;
	}	
		
}
	
// Wraps Node class so that its data fields are accessible
class LinkedList {
	Node head;
	Node tail;
	int size = 0;

/* prepend: Adds a new node to the beginning of the list */
	void prepend(int data) {
		Node newNode = new Node(data);
		if(head == null) {					// list is empty
			head = newNode;					// head is new node -- this is the front of the list
			tail = head;					// tail is new node  -- this is the front of the list
			size++;
		} else {
			newNode.next = head;			// next node is the current head
			head = newNode;					// head is new node
			tail = newNode.next;			// tail is the previous head
			size++;
		}
		
	}

/* append: Adds a new node the end of the list */
	void append(int data) {
		Node newNode = new Node(data);
		if(head == null) {						// list is empty 
			head = newNode;
			tail = head;
			size++;
		} else { 
			Node current = new Node();
			current = head;
			while(current != null) {			// walk through list
				if(current.next == null) {		// if next nodes next data field is equal to null -- this is the end of the list
					current.next = newNode;		// node next value will equal newNode -- this is now the end of the list
					tail = newNode;
					break;
				}
				current = current.next;			// increment 
			}
		}
	
		
	}
	
/* deleteFirst: Delete the first node in the list */
	void deleteFirst() {
		// Get head of list
		// Make head.next node the head of the list
		// Make second node in list the head
		head = head.next;
	}
	
/* deleteLast: Delete the last node in the list */
	void deleteLast() {
		// Walk through list
		// If the next node equals null make previous node the tail
		// Make second to last node the tail
		Node current = new Node();
		current = head;
		while(current != null) {
			if(current.next.next == null) {
				current.next = null;
				tail = current.next;	
				break;
			}
			current = current.next;
		}
	}
	
/* traverse: Walk through a LinkedList using a for loop */
	void traverse() {
		Node current = new Node();
		current = head;
		for(Node x = current; x != null; x = x.next) {
			System.out.println(x.data);
		}
	}
	
/* traverseWhile: Walk through a LinkedList using a while loop */	
	void traverseWhile() {
		Node current = new Node();
		current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	

/* size: Get the size of the LinkedList */
	void size() {
		System.out.println(size);
	}
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.append(0);
		list.prepend(1);
		list.prepend(3);
		list.append(4);
		list.append(5);
		list.deleteFirst();
		list.deleteLast();
		list.traverse();
	}


}


