package modelling.animal;

import modelling.animal.interfaces.SingCapable;

public class Chicken extends WalkingAnimal implements SingCapable {

	public void sing() {
		System.out.println("Cluck, cluck");
	}

}
