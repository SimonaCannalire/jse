package mex.s02;

public class Exercise4 {
	/**
	 * Celsius to Fahrenheit converter
	 * 
	 * @param celsius a temperature
	 * @return temperature converted to Fahrenheit
	 */
	public static double toFahrenhein(double celsius) {
		double a = 1.8;
		double b = 32;

		return (a * celsius) + b;
	}
}
