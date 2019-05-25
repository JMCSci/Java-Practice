// the blueprint
public class Time {
	public int hours;
	public int minutes;
	public int seconds;
// the constructor
	Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}
// the method
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public static void main(String[] args) {
// the object		
		Time time = new Time(11, 59, 59);
// prints address of object		
		System.out.println(time); 
// prints values in object		
		System.out.println(time.hours + ":" + time.minutes + ":" + time.seconds);  
// method that also prints values in object		
		printTime(time);
		
	}
	public static void printTime(Time x) {
		System.out.print(x.hours + ":" + x.minutes + ":" + x.seconds);
	}
}
   
