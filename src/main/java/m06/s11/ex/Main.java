package m06.s11.ex;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		// nell'array vehicles metto reference ad oggetti
		// della classe Vehicle
		Vehicle[] vehicles = { new Bus(), new Car(), new MotorBike() };
		System.out.println(Arrays.toString(vehicles));

		for (Vehicle vehicle : vehicles) {
			vehicle.steer(false);
		}

		Conditioning[] elements = { new Flat(15), new Flat(23), new Bus(), new Car() };
		// creo una variabile che è un array di tipo conditioning con uno spazio per
		// una reference che mi rimanda a nuovo oggetto flat di interfaccia/tipo
		// conditioning
		System.out.println(Arrays.toString(elements));

		for (Conditioning element : elements) {
			element.setTemperature(20);
			// element/current = elemento corrente
		}
		for (int i = 0; i < elements.length; i++) {
			elements[i].setTemperature(18);
		}
	}
}
