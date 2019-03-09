package practice2;

import java.util.Scanner;


// practice switch statement

public class practice2 {
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		int x; 
		System.out.print("Enter either 1 or 2: "); 
		x = input.nextInt(); 
		
		switch(x) {
		case 1 : System.out.println("This is my number"); break;
		case 2 : System.out.println("This is not my number"); break;
		default: System.out.println("Invalid number");
		input.close();
		}
	}
} 
