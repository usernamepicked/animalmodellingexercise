package modelling.animal;

import modelling.animal.interfaces.WalkCapable;

public class WalkingAnimal extends Animal implements WalkCapable {
	public void walk() {
		System.out.println("I am walking");
	}
}
