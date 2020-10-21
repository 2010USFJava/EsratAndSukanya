package com.revature.beans;

public class Driver {

	public static void main(String[] args) {
		Dog dog1 = new Dog("woof", "Tom");
		Animal animal = new Animal("Cat", "Black", 5, 30, dog1);
		System.out.println(animal.toString());
		//System.out.println(dog1.toString());
		System.out.println("from Sukanya's branch");
	}

}
