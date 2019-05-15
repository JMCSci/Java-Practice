/* Create two arrays -- strings and numbers
 * Read in data from file -- data3.txt
 * Output to screen
 * Sort array in ascending and descending order
 * Increase the value of the numbers array by 150
 */

package practice2;

import java.util.Scanner;
import java.io.File;
//import java.io.PrintStream; -- not used
//import java.util.Random;	-- not used

public class practice2 {
	public static void main(String[] args) throws Exception {
		int [] arrayNum = new int [13]; 
		String [] arrayNames = new String [13];
		readData(arrayNum, arrayNames);
		sortDescend(arrayNum, arrayNames);
		System.out.println("\nSorted Array (DESCENDING)");
		for(int i = 0; i < arrayNum.length; i++)
			System.out.println(arrayNum[i] + "\t" + arrayNames[i]);
		System.out.println("\nSorted Array (ASCENDING)");
		sortAscend(arrayNum, arrayNames);
		for(int i = 0; i < arrayNum.length; i++)
			System.out.println(arrayNum[i] + "\t" + arrayNames[i]);
		increaseVal(arrayNum);
		System.out.println("\nArray value increased by 150");
		for(int i = 0; i < arrayNum.length; i++)
			System.out.println(arrayNum[i] + "\t" + arrayNames[i]);
	}
	// method will read in data
	public static void readData(int arrayNum[], String arrayNames[]) throws Exception {
		Scanner input = new Scanner(new File("/Users/jasonmoreau/Desktop/data3.txt"));
		for(int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = input.nextInt();
			arrayNames[i] = input.next();
		}
		//output data
		System.out.println("Unsorted Array");
		for(int i = 0; i <  arrayNum.length; i++) {
			System.out.println(arrayNum[i] + "\t" + arrayNames[i]);
		}
		input.close();
	}
	// sort array -- bubble sort (ASCENDING ORDER)
	public static void sortDescend(int arrayNum[], String arrayNames[]) {
		int tempNum;
		String tempNames;
		for(int i = 0; i < arrayNum.length - 1; i++) {
			for(int j = 0; j < arrayNum.length - 1; j++) {
				if(arrayNum[j] > arrayNum[j + 1]) {
					tempNum = arrayNum[j];
					tempNames = arrayNames[j];
					arrayNum[j] = arrayNum[j + 1];
					arrayNames[j] = arrayNames[j + 1];
					arrayNum[j + 1] = tempNum;
					arrayNames[j + 1] = tempNames;
				}
					
			}
		}
	}
	// sort array -- bubble sort (DESCENDING ORDER)
	public static void sortAscend(int arrayNum[], String arrayNames[]) {
		int tempNum;
		String tempNames;
		for(int i = 0; i < arrayNum.length - 1; i++) {
			for(int j = 0; j < arrayNum.length - 1; j++) {
				if(arrayNum[j] < arrayNum[j + 1]) {
					tempNum = arrayNum[j];
					tempNames = arrayNames[j];
					arrayNum[j] = arrayNum[j + 1];
					arrayNames[j] = arrayNames[j + 1];
					arrayNum[j + 1] = tempNum;
					arrayNames[j + 1] = tempNames;
				}
			}
		}
	}
	public static void increaseVal(int arrayNum[]) {
		for(int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = arrayNum[i] + 150; 
		}
	}
	
}
