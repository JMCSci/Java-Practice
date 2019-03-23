package practice2;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0, num2 = 0, answer;
		System.out.print("Enter two numbers: "); 
		num1 = input.nextInt(); 
		num2 = input.nextInt();
		answer = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1 + num2 == answer));
		}
}
