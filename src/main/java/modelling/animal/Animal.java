package modelling.animal;

import modelling.animal.enums.AnimalColor;
import modelling.animal.enums.AnimalSize;
import modelling.animal.enums.Gender;

public class Animal {
	Gender gender;
	AnimalSize size;
	AnimalColor color;

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public AnimalSize getSize() {
		return size;
	}

	public void setSize(AnimalSize size) {
		this.size = size;
	}

	public AnimalColor getColor() {
		return color;
	}

	public void setColor(AnimalColor color) {
		this.color = color;
	}
	
	
}