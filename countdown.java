package practice2;

// practice functions

public class practice2 {
	public static int countdown(int x) {
		
	for(x = 10; x > 0; x--) {
			System.out.println(x);
		}
	return x; 
	}
	
	public static void emptyLine() {
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		System.out.println("COUNTDOWN");
		emptyLine();
		countdown(0);
	}
	
}
