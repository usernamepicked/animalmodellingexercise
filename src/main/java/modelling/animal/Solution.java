package modelling.animal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import modelling.animal.interfaces.FlightCapable;
import modelling.animal.interfaces.SingCapable;
import modelling.animal.interfaces.SwimCapable;
import modelling.animal.interfaces.WalkCapable;


public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new Butterfly(new Caterpillar()),
				new Cat()
				};
		
		
		List<Animal> flightCapableAnimals = Arrays.asList(animals).stream()
			.filter(a -> (a instanceof FlightCapable))
			.collect(Collectors.toList());
		System.out.println("animals capable of flight : " + flightCapableAnimals);
		System.out.println("animals capable of flight size() : " + flightCapableAnimals.size());
		
		List<Animal> walkCapableAnimals = Arrays.asList(animals).stream()
				.filter(a -> (a instanceof WalkCapable))
				.collect(Collectors.toList());
		System.out.println("animals capable of walk : " + walkCapableAnimals);
		System.out.println("animals capable of walk size() : " + walkCapableAnimals.size());
		
		List<Animal> singingCapableAnimals = Arrays.asList(animals).stream()
				.filter(a -> (a instanceof SingCapable))
				.collect(Collectors.toList());
		System.out.println("animals capable of singing : " + singingCapableAnimals);
		System.out.println("animals capable of singing size() : " + singingCapableAnimals.size());
		
		List<Animal> swimCapableAnimals = Arrays.asList(animals).stream()
				.filter(a -> (a instanceof SwimCapable))
				.collect(Collectors.toList());
		System.out.println("animals capable of swimming : " + swimCapableAnimals);
		System.out.println("animals capable of swimming size() : " + swimCapableAnimals.size());
	}
}
