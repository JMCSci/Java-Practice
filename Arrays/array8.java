/* Formated column names and data values in 5X5 array 
 */
package practice2;

public class practice2 {
	public static void main(String[] args) {
	int temp, i = 0, j = 0;
	double [][] array1 = new double [5][5];
	String [][] colname = new String [5][5];
	
	// create column names
	for(i = 0; i < array1.length; i++) {
		for(j = 0; j < array1.length; j++) {
			colname[0][j] = "NAME";
		}
	}
	// values looped into array
	for(i = 0; i < array1.length; i++) {
		for(j = 0; j < array1.length; j++) {
			array1[i][j] = 7.25;
		}
	}
	// print column name to console
	for(i = 0; i < array1.length; i++) {
		System.out.print(colname[0][i]+ " ");
	}
	System.out.println();
	// print array contents to console
	for(i = 0; i < array1.length; i++) {
		for(j = 0; j < array1.length; j++) {
		System.out.print(array1[i][j] + " ");
		}
		System.out.println();
	}
  }
}
