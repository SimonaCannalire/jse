package m06.s11.ex;

import java.util.logging.Logger;

public class Vehicle {
	private static final Logger log = Logger.getGlobal();

	public Vehicle() {
		log.info("Vehicle created");
	}
	
	public void steer(boolean left) {
		if (left) {
			System.out.println("Steering left");
		} else {
			System.out.println("Steering right");
		}
    	
    }

	public void brake() {
    	System.out.println("Braking!");
    }

	@Override
	public String toString() {
		return "Vehicle []";
	}	
}
