/* This program computes the cost in dollars of a first class package
 * The price is $0.33 for first ounce and $0.17 for each additional ounce
 */

package practice2;
import java.util.Scanner;

public class practice2 
{
		public static void main(String[] args)
		{
			// cost of 1st ounce = 0.33; cost of additional ounce = 0.17 
			
			double cost1 = 0.33; 
			double cost2 = 0.17; 
			double weight; 						     // weight in ounces

			Scanner input = new Scanner(System.in);
			System.out.print("Please enter the weight of your package in ounces: ");
			weight = input.nextDouble();
			double firstOunce = ((weight / weight) * cost1);	    // cost of first ounce
			double addOunce = ((weight - 1)* cost2);		    // cost of each additional ounce
			double totalCost = firstOunce + addOunce; 
			System.out.printf("The cost of your package is $" + "%.2f.", totalCost);	
		}
}
