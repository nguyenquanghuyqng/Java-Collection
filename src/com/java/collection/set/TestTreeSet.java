package com.java.collection.set;

import java.util.*;
import java.util.stream.Collectors;

public class TestTreeSet {

	public static void main(String args[]) {
		// VD 1
		List<Dog> list = new ArrayList<>();
		list.add(new Dog("Huy"));
		list.add(new Dog("Hieu"));
		list.add(new Dog("ahaha"));
		list.add(new Dog("zahoo"));
		list.add(new Dog("Huy"));

		Set<Dog> tset = new TreeSet<Dog>(list);

		Iterator iterator = tset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

//		// VD 2
//		List<Integer> listInteger = new ArrayList<>();
//		Set<Integer> setInteger = new TreeSet<>();
//
//		listInteger.add(0);
//		listInteger.add(3);
//		listInteger.add(1);
//		listInteger.add(4);
//		listInteger.add(2);
//		listInteger.add(5);
//		listInteger.add(2);
//		listInteger.add(4);
//
//		// lọc các phần tử là số chẵn trong listInteger và thêm vào trong setInteger
//		setInteger = listInteger.stream().filter(number -> number % 2 == 0).collect(Collectors.toSet());
//
//		System.out.println("Các phần tử trong listInteger: ");
//		System.out.println(listInteger);
//		System.out.println("Các phần tử trong setInteger: ");
//		System.out.println(setInteger);
	}
}
