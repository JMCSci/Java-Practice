// Do-while loop and exception handling used to force user to enter a number

package exceptionsprac;

import java.util.InputMismatchException;

import java.util.Scanner;

public class ExceptionsPrac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Boolean continueProgram = false;
		
		do {
			System.out.print("Enter a number: ");
		try {
			userInput(input.nextInt());
			continueProgram = false;
		}
		catch (InputMismatchException ex) {
			System.out.println("Incorrect input. Try again.");
			continueProgram = true;
		}
			input.nextLine();
		} while(continueProgram);
			System.out.println("\n*** END OF PROGRAM ***"); 
			input.close();
		}

	public static void userInput(int x)  {
		System.out.println("Your number is: " + x);
	}

}
