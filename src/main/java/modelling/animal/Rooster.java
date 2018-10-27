package modelling.animal;

import modelling.animal.enums.Gender;

public class Rooster extends Chicken {
	public Rooster() {
		setGender(Gender.MALE);
	}
	
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}
