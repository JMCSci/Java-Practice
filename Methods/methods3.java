package practice2;

import java.util.Scanner;

// call a method to use as input 
// use this method in another method
// THE LOOP NEEDS TO BE FIXED

public class practice2 {
	
	public static int number(int a) {
		Scanner input = new Scanner(System.in);
		int b = input.nextInt(); 
		return b;
	}
	
	public static int sum(int a) {
		int x = 0, y = 0;
		for(int i = 0; i <= number(x); i++) {
			System.out.println("Print line");
		}
		return y; 
	}
	
	public static void main(String[] args) {
		int x = 0, y = 0;  
		System.out.println("Enter a number: ");
		number(x);
		System.out.println(sum(y));
		
	}

}
