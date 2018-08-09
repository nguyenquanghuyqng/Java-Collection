package com.java.collection.set;

public class Dog implements Comparable<Dog>{
	private String name;
	private Integer weight;

	public Dog(String name, Integer weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog: " + name + ", weight: " + weight + " | ";
	}

	@Override
	public int compareTo(Dog o) {

		return name.compareTo(o.name);
	}

//	@Override
//	public int hashCode() {
//		return name.hashCode();
//		
//	}

}
