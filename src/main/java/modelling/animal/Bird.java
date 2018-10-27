package modelling.animal;

import modelling.animal.interfaces.FlightCapable;
import modelling.animal.interfaces.SingCapable;

public class Bird extends WalkingAnimal implements FlightCapable, SingCapable {

	public void fly() {
		System.out.println("I am flying");
	}

	public void sing() {
		System.out.println("Bird can sing");
	}
}
