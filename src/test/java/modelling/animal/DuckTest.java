package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DuckTest {
	Duck unit;
	
	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	
	@BeforeEach
	public void beforeEach() {
		System.setOut(new PrintStream(byteArrayOutputStream));
		unit = new Duck();
	}
	
	@Test
	public void testDuckCanSing() {
		unit.sing();
		assertTrue(byteArrayOutputStream.toString().contains("Quack, quack"));
	}
	
	@Test
	public void testDuckCanSwim() {
		unit.swim();
		assertTrue(byteArrayOutputStream.toString().contains("A duck can swim"));
	}
}
