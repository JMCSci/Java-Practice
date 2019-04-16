// Array matrix with random numbers

package practice2;

public class practice2 {
	public static void main(String[] args) {
		int [][] a = new int [3][3];
		
		for(int i = 0; i < 3; i++)
			a[0][i] = (int)(Math.random() * 100);
		for(int i = 0; i < 3; i++)
			a[1][i] = (int)(Math.random() * 100);
		for(int i = 0; i < 3; i++)
			a[2][i] = (int)(Math.random() * 100);
		
		for(int i = 0; i < a.length; i++) {
		System.out.print(a[0][i] + " ");
		System.out.print(a[1][i] + " ");
		System.out.println(a[2][i] + " ");
		}
	}	
	
}
	
