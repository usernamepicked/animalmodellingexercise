package modelling.animal;

import modelling.animal.enums.AnimalColor;
import modelling.animal.enums.AnimalSize;
import modelling.animal.interfaces.PredatoryFish;

public class Shark extends Fish implements PredatoryFish {
	
	public Shark() {
		setSize(AnimalSize.LARGE);
		setColor(AnimalColor.GREY);
	}

	public void eatOtherFish() {
		System.out.println("Shark eat other fish");
	}

}
