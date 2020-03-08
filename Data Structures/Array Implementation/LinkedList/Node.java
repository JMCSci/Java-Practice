package linkedlist;

public class Node {
	int data = 0;
	Node next = null;
	
	
	Node(int data) {
		this.data = data;
	}
	
	// getData: Returns data value
	public int getData() {
		return data;
	}
	
	// getNext: Returns value of next node
	public Node getNext() {
		return next;
	}
	
	public void append(Node newData) {
		
	}
	
	// listLength: Finds the size of the list
	public int listLength(Node head) {
		int count = 1;
		Node current = head;
		while(current.next != null) {
			current = current.next;
			count += 1;
		}
		return count;
	}
	
	/* traverse: Traverse linked list -- for loop
	 * Set condition as head of linked list
	 *  Increment to loop by setting x to the next node 
	 *  Stop when the x is equal to null
	 */
	public void traverse(Node head) {
		for(Node x = head; x != null; x = x.next) {
				System.out.println(x);
		}
	}
	
	@Override
	public String toString() {
		int temp = data;
		return Integer.toString(temp);
	}
	
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		// Chains nodes together
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		
		// Insert a new node at beginning of list
		Node node0 = new Node(0);
		node0.next = node1;
		node0.traverse(node0);
		
	}
	
	


}
