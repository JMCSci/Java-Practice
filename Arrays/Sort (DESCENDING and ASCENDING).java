/* Program sorts array in DESCENDING and ASCENDING order (numbers are randomly generated) */

package practice2;

import java.util.Random;

public class practice2 {
	public static void main(String[] args) {
		int array1[] = new int [10];
		generateRand(array1);
		System.out.println("Unsorted Array");
		printArray(array1);
		sortArrayD(array1);
		System.out.println("\nSorted Array - DESCENDING ORDER");
		printArray(array1);
		sortArrayA(array1);
		System.out.println("\nSorted Array - ASCENDING ORDER");
		printArray(array1);
	}
	// method fills array with random numbers
	public static void generateRand(int array1[]) {
		Random num = new Random();
		for(int i = 0; i < array1.length; i++) {
			array1[i] = num.nextInt(100);
		}
	}
	// print array
	public static void printArray(int array1[])  {
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}
	// sort array in DESCENDING order
	public static void sortArrayD(int array1[]) {
		int temp;
		for(int i = array1.length - 1; i > 0; i--) {
			for(int j = array1.length - 1; j > 0; j--) {
				if(array1[j - 1] < array1[j]) {
					temp = array1[j];
					array1[j] = array1[j - 1];
					array1[j - 1] = temp;
				}
			}	
		}
				
	}
	// sort array in ASCENDING ORDER
	public static void sortArrayA(int array1[]) {
		int temp;
		for(int i = 0; i < array1.length - 1; i++) {
			for(int j = 0; j < array1.length - 1; j++) {
				if(array1[j] > array1[j + 1]) {
					temp = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = temp;
				}
			}
		}
	}			
}
