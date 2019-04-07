/* Find average and the largest integer which is less than the average */

package practice2;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int [11]; 
		int sum = 0, i, max = 0;
		double avg;
		System.out.println("Enter 11 integers: ");
		// input 11 values
		for(i = 0; i < 11; i++) {
			a[i] = input.nextInt(); 
		}
		// sum values in array
		for(int j = 0; j < 11; j++) {
			sum = a[j] + sum;
		}
		// calculate average
		avg = sum/11;
		// sets first element in array as max ONLY if it's less than the average
		if(a[0] < avg)
			max = a[0]; 
		// scans entire array -- number < than average && greater than the max is the new max number
		for(i = 0; i < 11; i++) { 
			if(a[i] < avg && a[i] > max)
				max = a[i];
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The average: " + avg); 
		System.out.println("Largest integer less than the avg is " + max);
		input.close();
	}
}
