package practice2;

import java.util.Scanner;

// call a method to use as input 

public class practice2 {
	
	public static String firstName(String a) {
		Scanner input = new Scanner(System.in);
		String b = input.next();
		input.close();
		return b;
	}
	
	public static void main(String[] args) {
		String x = null;  
		System.out.println("Enter your first name: ");
		System.out.print(firstName(x));
		
	}
}
