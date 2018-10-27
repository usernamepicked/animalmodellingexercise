package modelling.animal;

import modelling.animal.interfaces.SingCapable;

public class Parrot extends Bird {
	private Animal animalNearby;
	
	Parrot() {
		
	}
	
	Parrot(Animal nearby) {
		animalNearby = nearby;
	}
	
	public Animal getAnimalNearby() {
		return animalNearby;
	}

	public void setAnimalNearby(Animal animalNearby) {
		this.animalNearby = animalNearby;
	}
	
	public void sing() {
		if (null != animalNearby && animalNearby instanceof SingCapable) {
			((SingCapable) animalNearby).sing();
		}
	}
}
