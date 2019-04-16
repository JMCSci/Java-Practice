/* Import unsorted array from file, 
* Display array 
* Sort array, 
* Display array 
* Output array to a file
*/

package practice2;

import java.util.Scanner;
import java.io.File; 
import java.io.PrintStream;

public class practice2 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("/Users/jasonmoreau/Desktop/test.txt"));
		PrintStream output = new PrintStream("/Users/jasonmoreau/Desktop/test2.txt");
		int [] array = new int [9];
		int temp;
		// enter numbers into array
		for(int i = 0; i < array.length ; i++) {
			array[i] = input.nextInt(); 
		}
		System.out.println("Unsorted array");
		// display unsorted array
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		blank(); 
		// sort array -- bubble sort
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1; j++)
				if(array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}		
		}
		blank(); 
		System.out.println("Sorted array");
		// print sorted array
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i]+ " ");
		// print to a file
		for(int i = 0; i < array.length; i++) {
			output.println(array[i]);
		}
		output.close();
		input.close();
	}
	
	public static void blank() {
		System.out.println();
	}

}
