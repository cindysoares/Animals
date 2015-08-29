package br.com.animals;

public final class Dog extends Animal {
	
	private final String breed;
	
	public Dog(String breed, int age) {
		super(age);
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	@Override
	public int getAge() {
		return super.getAge();
	}
	
}