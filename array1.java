package practice2;

import java.util.Scanner; 


public class practice2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myList = new int[2]; 
		for(int i = 0; i < myList.length; i++)
			myList[i] = input.nextInt();

		for(int i = 0; i < myList.length; i++)
			System.out.println(myList[i] + " ");
		
		int[] newList = {1,2};
		System.out.println(newList[]);
	}
}
