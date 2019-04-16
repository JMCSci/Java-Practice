/* Full sorting program
 * Utilizes bubble sort
 */

package practice2;

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

public class practice2 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(new File("/Users/jasonmoreau/Desktop/test.txt"));
		PrintStream output = new PrintStream("/Users/jasonmoreau/Desktop/test2.txt");
		int i, j, temp;
		int array1 [] = new int [16];
		// store values in array
		for(i = 0; i < array1.length; i++)
			array1[i] = input.nextInt();
		// print array to screen
		for(i = 0; i < array1.length; i++) {
			if(i % 8 == 0) {
			System.out.printf("\n%d" + "\t", array1[i]);
			} else 
				System.out.printf("%d" + "\t", array1[i]);
		}
		// save unsorted array to file
		output.println("Unsorted array");
		for(i = 0; i < array1.length; i++) {
			if(i % 8 == 0) {
			output.printf("\n%d" + "\t", array1[i]);
			} else 
				output.printf("%d" + "\t", array1[i]);	
		}
		// sort array -- bubble sort
		for(i = 0; i < array1.length - 1; i++) {
			for(j = 0; j < array1.length - 1; j++) {
				if(array1[j] > array1[j + 1]) {
					temp = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = temp;
				}
			}
		}
		// print sorted array to screen
		System.out.println("\n\nSorted array");
		for(i = 0; i < array1.length; i++) {
			if(i % 8 == 0) {
			System.out.printf("\n%d" + "\t", array1[i]);
			} else 
				System.out.printf("%d" + "\t", array1[i]);
		}
		// save sorted array to file
		output.println("\n\nSorted array");
		for(i = 0; i < array1.length; i++) {
			if(i % 8 == 0) {
				output.printf("\n%d" + "\t", array1[i]);
			} else 
					output.printf("%d" + "\t", array1[i]);
		}
		input.close();
		output.close();
	}
}
