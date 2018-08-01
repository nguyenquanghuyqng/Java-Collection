package com.java.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class TestPerformance {
	public static void main(String[] args) {
		Random r = new Random();
		HashSet hashSet = new HashSet();
		TreeSet treeSet = new TreeSet();
		LinkedHashSet linkedHashSet = new LinkedHashSet();

		//add to hashSet
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			hashSet.add(new Dog(String.valueOf(x)));
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("HashSet: " + duration);

		//add to treeSet
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			treeSet.add(new Dog(String.valueOf(x)));
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet: " + duration);

		//add to linkedHashSet
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			linkedHashSet.add(new Dog(String.valueOf(x)));
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedHashSet: " + duration);
	}
}
