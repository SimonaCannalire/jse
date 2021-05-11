package m06.s11.ex;

import java.util.logging.Logger;

// TODO: is-a Vehicle and Conditioning
//estendo vehicle e implemento conditioning
public class Bus extends Vehicle implements Conditioning {
    private static final Logger log = Logger.getGlobal();

    public Bus() {
        log.info("Bus created");
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
		
		System.out.println(String.format("Temperature now is set to " + target));
	}

	@Override
	public String toString() {
		return "Bus []";
	}
}
