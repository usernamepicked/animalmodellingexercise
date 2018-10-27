package modelling.animal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelling.animal.interfaces.SingCapable;
import modelling.animal.interfaces.WalkCapable;


public class FishTest {
	Fish unit;
	
	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	
	@BeforeEach
	public void beforeEach() {
		System.setOut(new PrintStream(byteArrayOutputStream));
		unit = new Fish();
	}
	
	@Test
	public void testFishCanSwim() {
		unit.swim();
		assertTrue(byteArrayOutputStream.toString().contains("Fish can swim"));
	}
	
	@Test
	public void testFishCantWalk() {
		assertFalse(unit instanceof WalkCapable);
	}
	
	@Test
	public void testFishCantSing() {
		assertFalse(unit instanceof SingCapable);
	}
}
