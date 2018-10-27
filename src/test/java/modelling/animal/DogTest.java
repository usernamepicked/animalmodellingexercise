package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DogTest {
	Dog unit;
	
	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	
	@BeforeEach
	public void beforeEach() {
		System.setOut(new PrintStream(byteArrayOutputStream));
		unit = new Dog();
	}
	
	@Test
	public void testDowCanWoofWoof() {
		unit.sing();
		assertTrue(byteArrayOutputStream.toString().contains("Woof, woof"));
	}
}
