package m06.s11.ex;

import java.util.logging.Logger;

/**
 * represents a flat with air conditioning
 * 
 * @author simoc
 *
 */
public class Flat implements Conditioning {
	private static final Logger log = Logger.getGlobal();
	private int temperature;

	public Flat(int temperature) {
		this.temperature = temperature;

		log.info("Flat created with temperature " + temperature);
	}

	@Override
	public void setTemperature(int target) {
		if (target < MIN_TEMP) {
			log.warning("User tried to set a temperature too low: " + target);
			target = MIN_TEMP;
		} else if (target > MAX_TEMP) {
			log.warning("User tried to set a temperature too high: " + target);
			target = MAX_TEMP;
		}
		
		System.out.println(String.format("Temperature was %d, now is set to %d ", temperature, target));
		temperature = target;
	}
	@Override
	public String toString() {
		return "Flat [temperature=" + temperature + "]";
	}

	public void openDoor() {
	}
}
