package modelling.animal;

import modelling.animal.interfaces.FlightCapable;
import modelling.animal.interfaces.Silent;

public class Butterfly extends Animal implements FlightCapable, Silent {
	private Caterpillar beforeMetamorph;
	
	private Butterfly() {};
	
	public Butterfly(Caterpillar c) {
		this();
		beforeMetamorph = c;
	}

	public void fly() {
		System.out.println("Butterfly flying");
	}

	public Caterpillar getBeforeMetamorph() {
		return beforeMetamorph;
	}

	public void setBeforeMetamorph(Caterpillar beforeMetamorph) {
		this.beforeMetamorph = beforeMetamorph;
	}
	
}
