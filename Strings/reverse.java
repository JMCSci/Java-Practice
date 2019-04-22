/* Prints string backwards
 */
package practice2;

public class practice2 {
	public static void main(String[] args) {
		String x = "ABC";
		reverse(x);
	}
	public static void reverse (String x) {
		String y = "";
		char temp;
		for (int i = x.length() - 1; i >= 0; i--) {
			temp = x.charAt(i);
			System.out.print(Character.toString(temp));
		}
	}
}
