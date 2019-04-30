// Print first and last name in reverse
package practice2;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		String firstName, lastName;
		System.out.print("Enter your first name: ");
		firstName = input.next();
		System.out.print("Enter your last name: ");
		lastName = input.next(); 
		reverse(firstName, lastName);
		input.close();
	}
	public static void reverse(String firstName, String lastName) {
		char temp;
		for(int i = firstName.length() - 1; i >= 0; i--) {
			temp = firstName.charAt(i);
			System.out.print(Character.toString(temp));
		}
		System.out.print(" ");
		for(int j = lastName.length() - 1; j >= 0; j--) {
			temp = lastName.charAt(j);
			System.out.print(Character.toString(temp));
		}
	}
}
