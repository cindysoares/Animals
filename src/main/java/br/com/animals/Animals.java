package br.com.animals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Animals {
	
	private static final Set<Animal> animals = new TreeSet<Animal>(new Comparator<Animal>() {
		public int compare(Animal o1, Animal o2) {
			return Integer.compare(o1.getAge(),o2.getAge());
		};
	});
	
	static {
		animals.addAll(Arrays.asList(
				new Animal(20),
				new Dog("Border Collie", 10),
				new Dog("Labrador", 2),
				new Dog("Golden Retriever", 7),
				new Animal(1),
				new Animal(7)
			));
	}
	
	public static Set<Animal> findAll() {
		return animals;
	}
	
	public static void add(Animal value) {
		animals.add(value);
	}

}
