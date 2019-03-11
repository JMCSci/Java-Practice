package practice2;

import java.util.Scanner;

public class practice2 {
	public static void emptyLine() {
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number, sum = 0;
		System.out.println("This program will sum all consecutive even integers.");
		emptyLine();
		System.out.print("Enter a maximum number: ");
		number = input.nextInt(); 
		
		for(int i = 1; i <= number; i++) {
			if(i % 2 == 0) {
				sum = i + sum;
				}
		}
		System.out.println(sum);		// prints sum of even numbers
		input.close();
	}
}
