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
		list.add(new Dog("Huy", 20));
		list.add(new Dog("Hieu", 30));
		list.add(new Dog("ahaha", 10));
		list.add(new Dog("zahoo", 0));
		list.add(new Dog("Huy", 2));

		Set<Dog> tset = new HashSet<Dog>(list);

		Iterator iterator = tset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
