package stack;

public class TestDynamicStack {
	public static void main(String[] args) {
		DynamicStack<Double> dynamic = new DynamicStack<>();
		dynamic.push(1.0);
		dynamic.push(2.5);
		dynamic.push(3.75);
		dynamic.push(4.00);
		dynamic.push(5.25);
		dynamic.push(6.50);
		dynamic.push(7.75);
		dynamic.push(8.00);
		dynamic.push(9.00);
		dynamic.push(10.00);
		dynamic.push(11.00);
		dynamic.push(12.00);
		dynamic.push(13.00);
		dynamic.push(14.00);
		dynamic.push(15.00);
		dynamic.push(16.00);
		dynamic.push(17.00);
		System.out.println(dynamic.peek());
	}
}
