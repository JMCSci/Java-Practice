package practice2;

import java.util.Scanner;

// practice String

public class practice2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.print("Enter your name: ");
		name = input.nextLine(); 
		System.out.println("Hello " + name + "");	
		input.close();
	}
}
