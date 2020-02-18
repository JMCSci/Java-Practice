/* Test implementation of a stack data structure */

package stack;

public class TestStack {
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<>();
		
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.isEmpty());
		System.out.println("SIZE: " + stack.size());
		System.out.println("PEEK: " + stack.peek());
	}

}
