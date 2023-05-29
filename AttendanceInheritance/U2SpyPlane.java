
public class U2SpyPlane extends Plane{ //Subclass (U2SpyPlane) extends superclass (Plane)

	double wingsSpan;
	
	//Constructor to initialize the U2SpyPlane object with speed, color, price, and wingsSpan
	public U2SpyPlane(int speed, String color, String price, double wingsSpan) {
		super(speed, color, price); //Call the superclass (Plane) constructor to initialize inherited properties
		this.wingsSpan = wingsSpan;
	}
	
	public double getWingsSpan() {
		return wingsSpan;
	}

	public void setWingsSpan(double wingsSpan) {
		this.wingsSpan = wingsSpan;
	}
	
	//Method to simulate flying the U-2 Spy Plane
	public void fly() {
        System.out.println("The U-2 Spy Plane is flying");
	}
	
}
