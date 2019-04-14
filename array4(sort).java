package practice2;

import java.util.Scanner;
import java.io.File;

public class practice2 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("/Users/jasonmoreau/Desktop/test.txt"));
		int temp, x = 0;
		x = num(x);
		int [] array = new int [x];
		// input data from file
		for(int i = 0; i < array.length - 1; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("\nUnsorted array");
		// print unsorted array
		for(int i = 0; i < array.length - 1; i++) {
			System.out.println(array[i]);
		}
		blank();
		System.out.println("Sorted array");
		// create bubble sort
		for(int i = 0; i < array.length - 1; i++)
			for(int j = 0; j < array.length - 1; j++)
				if(array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
		// print sorted array
		for(int i = 0; i < array.length - 1; i++)
			System.out.println(array[i]);
	}
		// ask user for array size -- returns value
		public static int num (int x) {
			Scanner input = new Scanner(System.in);
			int y = 0;
			System.out.print("Please enter number for array size: ");
			y = input.nextInt();
			return y;
		}
		public static void blank() {
		System.out.println();
	}
}
