package practice2;

// practice functions

public class practice2 {
		public static void blank()			    //  empty line
		{
			System.out.println("");
		}
		
		public static double rNum(double rand) // random number between 1-20
		{
			rand = Math.random() * 20 + 1;
			System.out.println("Here is a number between 1 and 100: " + (int)rand); 
			return rand; 
		}
		
		public static void myMethod()		   // method that displays a string
		{
			
			System.out.println("Here is another method.");
		}
		
		public static void main(String[] args)
		{
			System.out.println("Testing empty space.");
			blank();
			myMethod();
			blank();
			rNum(0);
		}
	}
