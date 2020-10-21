package com.revature.beans;

public class Driver {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("woof", "peter");
		Animal animal = new Animal("dog", "pink", 8, 20, dog1);
		System.out.println(animal.toString());
		System.out.println(dog1.toString());
		System.out.println("from Esrat's branch");


	}

}
