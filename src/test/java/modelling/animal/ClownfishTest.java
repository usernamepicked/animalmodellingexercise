package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelling.animal.enums.AnimalColor;
import modelling.animal.enums.AnimalSize;

public class ClownfishTest {
	Clownfish unit;
	
	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	
	@BeforeEach
	public void beforeEach() {
		System.setOut(new PrintStream(byteArrayOutputStream));
		unit = new Clownfish();
	}
	
	@Test
	public void testClownFishIsSmallAndOrange() {
		assertEquals(AnimalColor.ORANGE, unit.getColor());
		assertEquals(AnimalSize.SMALL, unit.getSize());
	}
	
	@Test
	public void testClownfishMakeJoke() {
		unit.makeJoke();
		assertTrue(byteArrayOutputStream.toString().contains("Clownfish make joke"));
	}
}
