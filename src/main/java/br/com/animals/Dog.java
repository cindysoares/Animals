package br.com.animals;

public final class Dog extends Animal {
	
	private final String breed;
	
	public Dog(String breed, int age) {
		super(age);
		this.breed = breed;
	}
	
	public final String getBreed() {
		return breed;
	}
	
	@Override
	public final int getAge() {
		return super.getAge();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Dog))
			return false;
		Dog other = (Dog) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		return true;
	}

	
}