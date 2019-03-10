package practice2;

import java.util.Scanner;

// practice String, switch, methods


public class practice2 {

	public static void newLine(){			// empty line
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int number;
		System.out.print("Enter your name: ");
		name = input.nextLine(); 
		System.out.println("Hello " + name);	
		newLine(); 
		System.out.print(name + ", please enter 1 , 5 or 10: ");
		number = input.nextInt();
		switch(number) {
		case 1: System.out.println(name + ", you picked 1. Thank you. \n\n ---END OF PROGRAM---"); break;
		case 5: System.out.println(name + ", you picked 2. Thank you. \n\n ---END OF PROGRAM---"); break;
		case 10: System.out.println(name + ", you picked 10. Thank you."); break; 
		default: System.out.println("Sorry " + name + ", you selected an invalid number.\n\n ---END OF PROGRAM---");
		input.close();
		}
   	 }
   }
