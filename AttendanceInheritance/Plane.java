
public class Plane extends Vehicle{ //Plane Class extends Vehicle Class
	
	public Plane(int speed, String color, String price) {
		super(speed, color, price); //Call the constructor of the Base Class (Vehicle)
	}

	//Override the stop method from the Vehicle Class
	@Override
    public void stop() {
        System.out.println("The plane has stopped");
	}
	
}
