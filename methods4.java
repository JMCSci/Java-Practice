package practice2;

import java.util.Scanner;

// Practice methods


public class practice2 {
	
	public static int sumEven(int a) {				
		int sum = 0; 
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) 
				sum = sum + i; 
		}
		return sum;
	}
	
	public static int addValue(int a) {
		int x;
		x = 1 + 1;
		return x;
	}
	
	public static void printText(){
		System.out.println("Print this line.");
	}
	
	public static String myInput(String a) {
		Scanner input = new Scanner(System.in);
		String b; 
		System.out.print("Enter text: ");
		b = input.next(); 
		System.out.println(b);
		return b;
	}
	
	public static int cubed(int a) {
		Scanner input = new Scanner(System.in);
		int x, y;
		System.out.print("Enter a value to be cubed: "); 
		x = input.nextInt();
		y = x * x * x; 
		System.out.println(y);
		input.close();
		return y; 
	}
	public static void blank() {
		System.out.println(); 
	}
	
	public static void endProgram() {
		System.out.println("----END OF PROGRAM----");
	}
	
	public static void main(String[] args) {
		int u = 0;
		int v = 0; 
		int w = 0;
		int x = 0; 
		String y = null;
		System.out.println(sumEven(u));
		blank();
		System.out.println(addValue(v+1));
		blank();
		printText(); 
		blank();
		myInput(y);
		blank(); 
		cubed(w);  
		blank();
		endProgram();
	}
}
