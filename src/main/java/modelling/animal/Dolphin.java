package modelling.animal;

import modelling.animal.interfaces.EfficientSwimmer;

public class Dolphin extends Fish implements EfficientSwimmer {

	public void swim() {
		System.out.println("Dolphin swim efficiently");
	}
}
