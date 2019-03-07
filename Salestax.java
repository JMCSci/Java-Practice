package practice2;

import java.util.Scanner;

// practice functions/methods

public class practice2 {

	public static double salesTax(double tax, double x) {
		tax = 6.875;
		return x / tax; 
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price, total;
		System.out.print("Input a price: ");
		price = input.nextDouble(); 
		total = (salesTax(0,price) + price);
		System.out.printf("The price with taxes is $%.2f.", total);
	}
}
