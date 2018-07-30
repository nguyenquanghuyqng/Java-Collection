package com.java.collection.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * CREATED BY Hieu on 11:04 SA, 26/07/2018
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        System.out.println("\nTreeMap");

        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1, "Java");
        treeMap.put(3, "C++");
        treeMap.put(2, "PHP");
        treeMap.put(4, "Python");
        Set<Integer> keySet3 = treeMap.keySet();
        for (Integer key : keySet3) {
            System.out.println(key + " " + treeMap.get(key));
        }
        treeMap.remove(4);
        System.out.println("After remove:");
        for (Integer key : keySet3) {
            System.out.println(key + " " + treeMap.get(key));
        }
    }
}
