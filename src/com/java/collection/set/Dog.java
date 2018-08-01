package com.java.collection.set;

public class Dog implements Comparable<Dog>{
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Dog: " + name + ", ";
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
