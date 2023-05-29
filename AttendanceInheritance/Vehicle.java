
public class Vehicle {

	//Declare the properties of the Vehicle class
	int speed;
	String color;
	String price;
	
	//Constructor to initialize the Vehicle object with speed, color, and price
	public Vehicle(int speed, String color, String price) {
		this.speed = speed;
		this.color = color;
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	//Method to stop the vehicle
	public void stop() {
		 System.out.println("The vehicle has stopped");
	}
	
	
	
}
