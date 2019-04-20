/* User inputs names which will be be used in 2D array that displays the following categories: ID, Name, Number
 * Numbers imported from file
 * Data exported to file
 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

class practice {
		public static void main(String[] args) throws Exception {
			Scanner input = new Scanner(System.in);
			Scanner inputFile = new Scanner(new File("H:data(input).txt"));
			PrintStream output = new PrintStream("H:data(output).txt");
			int i, j, IDcounter = 1;
			// create arrays -- 2D array and 1D array
			int [][] myArray = new int [10][2];
			String [] nameArray = new String [10];
			//  ID numbers generated
				for(i = 0; i < myArray.length; i++) 
					myArray[i][0] = IDcounter++;
			// input numbers from file
				for(i = 0; i < myArray.length; i++) 
						myArray[i][1] = inputFile.nextInt();
			// user inputs names
			System.out.println("Enter names: ");
				for(i = 0; i < nameArray.length; i++)
					nameArray[i] = input.next();
			// print array, output to file
				output.println("ID   | NAME | NUMBER");
				for(i = 0; i < myArray.length; i++) 
					for(j = 0; j < myArray.length; j++) 
						if(j == 0)
							output.printf("%s" + "%10s", myArray[i][j], nameArray[i]);
						else if(j == 1)
							output.printf("%5s\n",myArray[i][j] );
				input.close();
				inputFile.close();
				output.close();
	}
}
