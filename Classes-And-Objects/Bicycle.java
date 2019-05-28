/* Bicycle class and objects practice using Java tutorial  */

package bicycle;
// blueprint
public class Bicycle {
	public int speed;
	public int gear;
	public int cadence;	// pedaling rate
	
// constructor
	Bicycle() {
		speed = 0;
		gear = 0;
		cadence = 0;
	}
	
	void changeGear(int newValue) {
		gear = newValue;
	}
	void changeSpeed(int newValue) {
		speed = newValue;
	}
	void changeCadence(int newValue) {
		cadence = newValue;
	}
	void speedUp(int increment) {
		speed = speed + increment;
	}
	void slowDown(int brake) {
		speed = speed - brake;
	}	
	
// blueprint
public static class MountainBike extends Bicycle {
	public int handlebars;  
		
// constructor
	 MountainBike() {
		handlebars = 2;
	}
	
	void numHandle(int newValue) {
		handlebars = newValue;
	}
}

public static void main(String[] args) {
	Bicycle bike1 = new Bicycle();
	Bicycle bike2 = new Bicycle();
	Bicycle.MountainBike bike3 = new Bicycle.MountainBike();
	// initial value
	bike1.printState();
	// use methods to change values
	bike1.changeSpeed(1);
	bike1.changeGear(2);
	bike1.changeCadence(3);
	bike1.printState();
	bike2.speedUp(1);
	bike2.slowDown(1);
	bike2.printState();
	bike3.printState();
	bike3.speedUp(5);
	bike3.printState();
	bike3.mBike(bike3.handlebars);
	
	
	
}
// method that prints state of Bicycle
	public void printState() {
		System.out.println("Speed: " + speed + " Gear: " + gear + " Cadence: " + cadence);	
		
	}
// method to display new attributes
	 public void mBike(int handlebars) {
		 System.out.println("Handle bars: " + handlebars);
	 }
	 

}
