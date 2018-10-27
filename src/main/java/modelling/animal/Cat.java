package modelling.animal;

import modelling.animal.interfaces.SingCapable;

public class Cat extends WalkingAnimal implements SingCapable {
	public void sing() {
		System.out.println("Meow, meow");
	}
}
