// Custom Exception message for out of bounds array

package exceptionsprac;

public class ExceptionsPrac {
	public static void main(String[] args) {
		int [] test = new int [5];
		
		try {
			for(int i = 0; i < 6; i++) {
				test[i] = 1;
			}
		} 
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of bounds");
		}
			
		System.out.println("Program continues");
		try {
		System.out.println(test[5]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Element 5 does not exist");
		}
	}

}
