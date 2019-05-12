/* Create 2D array
 * Fill with data from matrix.txt 
 * 
 * Create second array (single dimension)
 * Sort data in DESCENDING order
 * 
 * Find the average of the array2 and return it back to the main program 
 * 
 * If average equals number in array2 print "true" and how many times
 * 
 * Print array to file
 * 
 */

package practice2;

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.util.Random;

public class practice2 {
	public static void main(String[] args) throws Exception {
		PrintStream output = new PrintStream("/Users/jasonmoreau/Desktop/output.txt");
		int [][] array1 = new int [3][2];
		int [] array2 = new int [25];
		int boolCount = 0;
		double average;
		Boolean avgNum = true; 
		String times = " time.";
		fillMatrix(array1);
		fillRand(array2);
		sortArray2(array2);
		average = findAverage(array2);
		output.println("Sorted Array (DESCENDING ORDER)");
		for(int i = 0; i < array2.length; i++) {
			output.println(array2[i]);
		}
		output.printf("The array average is: %.1f \n", average);
		for(int i = 0; i < array2.length; i++) {
			if(average == array2[i]) {
				boolCount++;
			}
		}
		if(boolCount > 0) {
			output.println("Is there a number in the array that equals the average? " + avgNum);
			if(boolCount == 1) {
			output.println("The number shows up " + boolCount + times.substring(0,6));
			} else 
				output.println("The number shows up " + boolCount + " times.");
		} else {
			output.println("Is there a number in the array that equals the average? " + !avgNum); 
		}
	  }	
	// fill array1 with data from matrix.txt
	public static void fillMatrix(int array1[][]) throws Exception {
		Scanner input = new Scanner(new File("/Users/jasonmoreau/Desktop/matrix.txt"));
		for(int i = 0; i < array1.length - 1; i++) {
			for(int j = 0; j < array1.length - 1; j++) {
				array1[i][j] = input.nextInt();
			}
		}
	}
	// fill array2 with random numbers (1-100)
	public static void fillRand(int array2[]) {
		Random rand = new Random();
		for(int i = 0; i < array2.length; i++) {
			array2[i] = rand.nextInt(100);
		}
	}
	// sort array2
	public static void sortArray2(int array2[]) {
		int temp;
		for(int i = 0; i < array2.length - 1; i++) {
			for(int j = 0; j < array2.length - 1; j++) {
				if(array2[j] < array2[j + 1]) {
				temp = array2[j];
				array2[j] = array2[j + 1];
				array2[j + 1] = temp;
				}
			}
			
		}	
	}
	// find array average
	public static double findAverage(int array2[]) {
		int sum = 0;
		double average;
		for(int i = 0; i < array2.length; i++) {
			sum = array2[i] + sum; 
		}
		average = sum/array2.length;
		return average;
	}
	
}
