package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelling.animal.interfaces.FlightCapable;

public class ChickenTest {
	Chicken unit;
	
	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	
	@BeforeEach
	public void beforeEach() {
		System.setOut(new PrintStream(byteArrayOutputStream));
		unit = new Chicken();
	}
	
	@Test
	public void testChickenCanSing() {
		unit.sing();
		assertTrue(byteArrayOutputStream.toString().contains("Cluck, cluck"));
	}
	
	@Test
	public void testChickenCantFly() {
		assertFalse(unit instanceof FlightCapable);
	}
}
