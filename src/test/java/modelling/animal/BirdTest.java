package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BirdTest {
	Bird unit;
	
	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	
	@BeforeEach
	public void beforeEach() {
		System.setOut(new PrintStream(byteArrayOutputStream));
		unit = new Bird();
	}
	
	@Test
	public void testBirdCanSing() {
		unit.sing();
		assertTrue(byteArrayOutputStream.toString().contains("Bird can sing"));
	}
	
	@Test
	public void testBirdCanFly() {
		unit.fly();
		assertTrue(byteArrayOutputStream.toString().contains("I am flying"));
	}
	
	@Test
	public void testBirdCanWalk() {
		unit.walk();
		assertTrue(byteArrayOutputStream.toString().contains("I am walking"));
	}
}
