package practice2;

import java.util.Scanner;

// practice functions

public class practice2 {

	public static double salesTax(double tax, double x) {
		tax = 8.875;
		return x / tax; 
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price, total;
		System.out.print("Enter the price of product: ");
		price = input.nextDouble(); 
		total = (salesTax(0,price) + price);
		System.out.printf("The cost with sales tax is $%.2f.", total);
	}
}
