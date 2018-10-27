package modelling.animal;

import modelling.animal.enums.AnimalColor;
import modelling.animal.enums.AnimalSize;
import modelling.animal.interfaces.Comedian;

public class Clownfish extends Fish implements Comedian {
	public Clownfish() {
		setSize(AnimalSize.SMALL);
		setColor(AnimalColor.ORANGE);
	}
	
	public void makeJoke() {
		System.out.println("Clownfish make joke");
	}

}
