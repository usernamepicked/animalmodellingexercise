package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelling.animal.interfaces.FlightCapable;


public class CaterpillarTest {
	Caterpillar unit;
	
	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	
	@BeforeEach
	public void beforeEach() {
		System.setOut(new PrintStream(byteArrayOutputStream));
		unit = new Caterpillar();
	}
	
	@Test
	public void testCaterpillarIsCrawling() {
		unit.walk();
		assertTrue(byteArrayOutputStream.toString().contains("caterpillar crawling"));
	}
	
	@Test
	public void testCaterpillarCannotFly() {
		assertFalse(unit instanceof FlightCapable);
	}
}
