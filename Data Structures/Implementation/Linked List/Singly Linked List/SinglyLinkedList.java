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
	
