package modelling.animal;

import modelling.animal.interfaces.SingCapable;

public class Dog extends WalkingAnimal implements SingCapable {

	public void sing() {
		System.out.println("Woof, woof");
	}

}
