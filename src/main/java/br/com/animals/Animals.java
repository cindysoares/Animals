package br.com.animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Animals {
	
	private static final Set<Animal> animals = new HashSet<Animal>();
	
	static {
		animals.addAll(Arrays.asList(
				new Dog("Border Collie", 10),
				new Dog("Labrador", 2),
				new Dog("Golden Retriever", 7),
				new Animal(20),
				new Animal(1),
				new Animal(7),
				new Animal(3)
			));
	}
	
	public static Collection<Animal> findAll() {
		List<Animal> sortedAnimalsByAge = new ArrayList<Animal>(animals);
		Collections.sort(sortedAnimalsByAge , new Comparator<Animal>() {
			public int compare(Animal o1, Animal o2) {
				return Integer.compare(o1.getAge(),o2.getAge());
			};
		});
		return sortedAnimalsByAge;
	}
	
	public static boolean add(Animal value) {
		return animals.add(value);
	}

}
