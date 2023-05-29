
public class ToyotaVIOS extends Car{ //Subclass (ToyotaVIOS) extends superclass (Car)
	
	String tireType;
		
		//Constructor to initialize the ToyotaVIOS object with speed, color, price, and tireType
	   public ToyotaVIOS(int speed, String color, String price, String tireType) {
		super(speed, color, price, tireType); //Call the superclass (Car) constructor to initialize inherited properties
		this.tireType = tireType;
	}
	   
	   public void setTireType(String tireType) {
			this.tireType = tireType;
	}

	   public String getTireType() {
		        return tireType;
	}

	   //Method to simulate driving the Toyota VIOS
	   public void drive() {
	        System.out.println("The Toyota VIOS is being driven.");
	}
	
	   

}
