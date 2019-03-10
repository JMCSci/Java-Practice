package practice2;

import java.util.Scanner;

// practice String and switch

public class practice2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int number;
		System.out.print("Enter your name: ");
		name = input.nextLine(); 
		System.out.println("Hello " + name);	
		System.out.print(name + ", please enter 1 , 5 or 10: ");
		number = input.nextInt();
		switch(number) {
		case 1: System.out.println(name + ", you picked 1. Thank you."); break;
		case 5: System.out.println(name + ", you picked 2. Thank you."); break;
		case 10: System.out.println(name + ", you picked 10. Thank you."); break; 
		default: System.out.println("Invalid number"); 
		input.close();
		}
  }
}
