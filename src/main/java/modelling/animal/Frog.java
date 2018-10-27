package modelling.animal;

import modelling.animal.interfaces.SingCapable;
import modelling.animal.interfaces.SwimCapable;

public class Frog extends WalkingAnimal  implements SwimCapable, SingCapable {

	public void sing() {
		System.out.println("Frog croaking");
	}

	public void swim() {
		System.out.println("Frog swimming");
	}

}
