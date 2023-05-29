
public class Boat extends Vehicle{ //Boat Class extends Vehicle Class
	
	public Boat(int speed, String color, String price) {
		super(speed, color, price); //Call the constructor of the Base Class (Vehicle)
	}

	//Override the stop method from the Vehicle Class
	@Override
    public void stop() {
        System.out.println("The boat has stopped");
	}
	
	
}
