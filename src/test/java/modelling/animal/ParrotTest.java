package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParrotTest {
	Parrot unit;
	
	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	
	@BeforeEach
	public void beforeEach() {
		System.setOut(new PrintStream(byteArrayOutputStream));
		unit = new Parrot();
	}
	
	@Test
	public void testParrotWillCopyDogSound() {
		unit.setAnimalNearby(new Dog());
		
		unit.sing();
		assertTrue(byteArrayOutputStream.toString().contains("Woof, woof"));
	}
	
	@Test
	public void testParrotWillCopyCatSound() {
		unit.setAnimalNearby(new Cat());
		
		unit.sing();
		assertTrue(byteArrayOutputStream.toString().contains("Meow, meow"));
	}
	
	@Test
	public void testParrotWillCopyRoosterSound() {
		unit.setAnimalNearby(new Rooster());
		
		unit.sing();
		assertTrue(byteArrayOutputStream.toString().contains("Cock-a-doodle-doo"));
	}
}
