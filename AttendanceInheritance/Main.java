
public class Main {

	public static void main(String[] args) {
		
		  	//Create an instance of ToyotaVIOS
		  	ToyotaVIOS car = new ToyotaVIOS(120, "White", "₱ 1,005,000", "Radial");
	        System.out.println("Toyota VIOS Details:");
	        System.out.println("- Speed: " + car.getSpeed());
	        System.out.println("- Color: " + car.getColor());
	        System.out.println("- Price: " + car.getPrice());
	        System.out.println("- Tire Type: " + car.getTireType());
	        car.drive(); //Will call the drive method inherited from ToyotaVIOS
	        car.stop(); //Will call the stop method inherited from Vehicle

	        //Create an instance of U2SpyPlane
	        U2SpyPlane spyPlane = new U2SpyPlane(800, "Black", "$ 50,000,000", 116);
	        System.out.println("\nU-2 Spy Plane Details:");
	        System.out.println("- Speed: " + spyPlane.getSpeed());
	        System.out.println("- Color: " + spyPlane.getColor());
	        System.out.println("- Price: " + spyPlane.getPrice());
	        System.out.println("- Wingspan: " + spyPlane.getWingsSpan());
	        spyPlane.fly(); //Will call the fly method specific to U2SpyPlane
	        spyPlane.stop(); //Will call the stop method inherited from Vehicle
	        
	        //Create an instance of FandangoYacht
	        FandangoYacht fandangoYacht = new FandangoYacht(25, "White", "$ 545,000", "Blue");
	        System.out.println("\nFandango Yacht Details:");
	        System.out.println("- Speed: " + fandangoYacht.getSpeed());
	        System.out.println("- Color: " + fandangoYacht.getColor());
	        System.out.println("- Price: " + fandangoYacht.getPrice());
	        System.out.println("- Main Sail Color: " + fandangoYacht.getMainSailColor());
	        fandangoYacht.Float(); //will call the Float method specific to FandangoYacht
	        fandangoYacht.stop(); //will call the stop method inherited from Vehicle

	}

}
