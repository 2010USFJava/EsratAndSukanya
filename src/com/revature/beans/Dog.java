package com.revature.beans;

public class Dog {
	private String noise;
	private String name;
	
	public Dog() {}
	
	public Dog(String noise, String name) {
		this.noise=noise;
		this.name=name;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [noise=" + noise + ", name=" + name + "]";
	}
	
}
