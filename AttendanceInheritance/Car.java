
public class Car extends Vehicle{ //Car Class extends Vehicle Class
	
	public Car(int speed, String color, String price, String tireType ) {
		super(speed, color, price); //Call the constructor of the Base Class (Vehicle)
	}
	
	//Override the stop method from the Vehicle Class
	@Override
    public void stop() {
        System.out.println("The car has stopped");
	}
	
}
