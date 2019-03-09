package practice2;

import java.util.Scanner;


// practice functions

public class practice2 {
	
	public static int square(int x, int y) {	//	method that squares a number
		x = y * y;
		return x;
	}
	
	public static void main(String[] args)
	{
		int test;
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter a number to be squared: ");
		test = input.nextInt();
		System.out.println("Your number squared is: " + square(0,test));
		input.close();
	}
}
