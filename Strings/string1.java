/* Program correctly capitalizes first and last name
 * Output is displayed to the console
 */

package practice2;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName, lastName, temp1, temp2, temp3, temp4;
		System.out.print("Enter your first name: ");
		firstName = input.next();
		System.out.print("Enter your last name: ");
		lastName = input.next();
		// temp1 & temp2 variables hold first letter in both first and last name
		// temp3 & temp4 variables hold remaining letters in both first and last name
		temp1 = firstName.substring(0, 1);
		temp2 = firstName.substring(1, firstName.length());
		temp3 = lastName.substring(0, 1);
		temp4 = lastName.substring(1, lastName.length());
		// temp1 & temp3 variables capitalizes letter in first name
		// temp2 & temp4 variables ensure remaining letters remain lowercase
		temp1 = temp1.toUpperCase();
		temp2 = temp2.toLowerCase(); 
		temp3 = temp3.toUpperCase();
		temp4 = temp4.toLowerCase();
		System.out.println("Your name is " + temp1 + temp2 + " " + temp3 + temp4 + ".");
		input.close();
	}
}
