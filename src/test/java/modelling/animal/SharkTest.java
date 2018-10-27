package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelling.animal.enums.AnimalColor;
import modelling.animal.enums.AnimalSize;

public class SharkTest {
	Shark unit;
	
	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	
	@BeforeEach
	public void beforeEach() {
		System.setOut(new PrintStream(byteArrayOutputStream));
		unit = new Shark();
	}
	
	@Test
	public void testSharkIsLargeAndGrey() {
		assertEquals(AnimalColor.GREY, unit.getColor());
		assertEquals(AnimalSize.LARGE, unit.getSize());
	}
	
	@Test
	public void testSharkEatOtherFish() {
		unit.eatOtherFish();
		assertTrue(byteArrayOutputStream.toString().contains("Shark eat other fish"));
	}
}
