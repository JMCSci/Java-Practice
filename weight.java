// Program expresses weight in pounds and displays it terms of pounds and ounces
// Example: 5.2 pounds = 5 pounds 3 ounces

import java.util.Scanner;

class practice 
	{
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			double weight, decimal, ounces;
			System.out.print("Please enter weight: ");
			weight = input.nextDouble(); 
			decimal = weight - Math.floor(weight); // leaves numbers after decimal
			ounces = (decimal * 16);
			System.out.printf("You weigh " + (int)(weight) + " pounds and " + "%.0f" + " ounces.", ounces); 
		}
	}
