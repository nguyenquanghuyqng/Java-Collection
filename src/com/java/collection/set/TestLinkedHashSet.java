package com.java.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestLinkedHashSet {
	public static void main(String args[]) {
		// VD 1
		List<Dog> list = new ArrayList<>();
		list.add(new Dog("Huy",20));
		list.add(new Dog("Hieu",10));
		list.add(new Dog("ahaha",1));
		list.add(new Dog("zahoo",9));
		list.add(new Dog("Huy",70));

		Set<Dog> tset = new LinkedHashSet<Dog>(list);

		Iterator iterator = tset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
