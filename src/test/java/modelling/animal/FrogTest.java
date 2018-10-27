package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelling.animal.interfaces.SingCapable;
import modelling.animal.interfaces.SwimCapable;

public class FrogTest {
	Frog unit;
	
	@BeforeEach
	public void beforeEach() {
		unit = new Frog();
	}
	
	@Test
	public void testFrogCanSing() {
		assertTrue(unit instanceof SingCapable);
	}
	
	@Test
	public void testFrogCanSwim() {
		assertTrue(unit instanceof SwimCapable);
	}
}
