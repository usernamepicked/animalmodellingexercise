package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelling.animal.interfaces.FlightCapable;
import modelling.animal.interfaces.Silent;

public class ButterflyTest {
	Butterfly unit;
	Caterpillar caterpillar;
	
	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	
	@BeforeEach
	public void beforeEach() {
		System.setOut(new PrintStream(byteArrayOutputStream));
		caterpillar = new Caterpillar();
		unit = new Butterfly(caterpillar);
	}
	
	@Test
	public void testButterflyCanFly() {
		assertTrue(unit instanceof FlightCapable);
	}
	
	@Test
	public void testButterflyDoesNotMakeSound() {
		assertTrue(unit instanceof Silent);
	}
}
