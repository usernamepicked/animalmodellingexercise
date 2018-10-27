package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelling.animal.interfaces.EfficientSwimmer;


public class DolphinTest {
	Dolphin unit;
	
	
	@BeforeEach
	public void beforeEach() {
		unit = new Dolphin();
	}
	
	@Test
	public void testDolphinSwimEfficiently() {
		assertTrue(unit instanceof EfficientSwimmer);
	}
}
