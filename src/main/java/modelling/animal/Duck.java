package modelling.animal;

import modelling.animal.interfaces.SwimCapable;

public class Duck extends Bird implements SwimCapable {
	public void sing() {
		System.out.println("Quack, quack");
	}

	public void swim() {
		System.out.println("A duck can swim");		
	}

}
