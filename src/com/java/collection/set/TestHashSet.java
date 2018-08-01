package com.java.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestHashSet {
	public static void main(String args[]) {
		// VD 1
		List<Dog> list = new ArrayList<>();
		list.add(new Dog("Huy"));
		list.add(new Dog("Hieu"));
		list.add(new Dog("ahaha"));
		list.add(new Dog("zahoo"));
		list.add(new Dog("Huy"));

		Set<Dog> tset = new HashSet<Dog>(list);

		Iterator iterator = tset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
