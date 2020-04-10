/* Singly Linked List */

package singlylinkedlist;

public class SinglyLinkedList {
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
			return -1;
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
	
	
}

