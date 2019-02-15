// How time works on a computer using UNIX epoch

public class practice 
	{
		public static void main(String[] args)
		{
			long time = System.currentTimeMillis();
			long tSec = time / 1000;
			long tMin = tSec / 60; 
			long tHour = tMin / 60; 
			
			System.out.print(tSec);
			
			for(long i = tSec; tSec <= 1570272764; i++)
			{
				System.out.println(i); 
			}
		}
	}	
