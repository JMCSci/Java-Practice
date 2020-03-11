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
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());	
		System.out.println("SIZE: " + stack.size());
		System.out.println(stack.getTop());
		System.out.println(stack.getBottom());
		System.out.println(stack.peek());
		stack.push(2);
		stack.push(5);
		System.out.println("SIZE: " + stack.size());
		System.out.println(stack.getTop());
		System.out.println(stack.getBottom());
		System.out.println(stack.pop());
		System.out.println(stack.getTop());
		System.out.println("PEEK: " + stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.getTop());
		System.out.println(stack.getBottom());
		System.out.println("PEEK: " + stack.peek());	
	}

}
