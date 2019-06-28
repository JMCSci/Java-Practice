// Test finally in try-catch block

package exceptionsprac;

import java.util.InputMismatchException;

import java.util.Scanner;

public class ExceptionsPrac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		try {
			userInput(input.nextInt());
		}
		catch (InputMismatchException ex) {
			System.out.println("Incorrect input.");
		}
		finally {
			System.out.println("Finally test");
		}
		input.close();
	}
	
	public static void userInput(int x)  {
		System.out.println(x);
	}

}
