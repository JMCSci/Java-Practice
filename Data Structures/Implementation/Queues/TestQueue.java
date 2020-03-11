/* Test array implementation of queue data structure */

package queue;

public class TestQueue {
	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.remove();
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		queue.add(100);
		System.out.println(queue.peek());
		queue.add(200);
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
	}

}
