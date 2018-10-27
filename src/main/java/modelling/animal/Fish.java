package modelling.animal;

import modelling.animal.interfaces.SwimCapable;

public class Fish extends Animal implements SwimCapable {

	public void swim() {
		System.out.println("Fish can swim");
	}

}
