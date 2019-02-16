// Program that evaluates a quadratic equation

import java.util.Scanner;
import java.lang.Math; 

class practice 
	{
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in); 
			
			double a, b, c; 
			double QFormula; 
			
			System.out.print("Input a value for a: ");
			a = input.nextDouble();
			
			System.out.print("Input a value for b: ");
			b = input.nextDouble(); 
			
			System.out.print("Input a value for c: ");
			c = input.nextDouble(); 
			
			QFormula = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			
			System.out.println("The answer is: " + QFormula);
			
		}
	}	
