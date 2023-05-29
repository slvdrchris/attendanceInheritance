
public class FandangoYacht extends Boat{ //Subclass (FandangoYacht) extends superclass (Boat)

	String mainSailColor;
	
	public FandangoYacht(int speed, String color, String price, String mainSailColor) {
		super(speed, color, price); //Call the superclass (Boat) constructor to initialize inherited properties
		this.mainSailColor = mainSailColor;
	}
	public String getMainSailColor() {
		return mainSailColor;
	}

	public void setMainSailColor(String mainSailColor) {
		this.mainSailColor = mainSailColor;
	}

	// Method to simulate the FandangoYacht floating
	public void Float() {
        System.out.println("The FandangoYacht is floating");
	}
	
}
