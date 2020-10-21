package com.revature.beans;

public class Animal {
	private String name;
	private String color;
	private int age;
	private int weight;
	Dog dog;
	
	public Animal() {}
	
	public Animal(String name, String color, int age, int weight, Dog dog) {
		this.name=name;
		this.color=color;
		this.age=age;
		this.weight=weight;
		this.dog=dog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", age=" + age + ", weight=" + weight + ", dog=" + dog
				+ "]";
	}

}
