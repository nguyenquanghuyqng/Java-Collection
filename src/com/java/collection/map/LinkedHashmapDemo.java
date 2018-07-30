package com.java.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * CREATED BY Hieu on 11:05 SA, 26/07/2018
 */
public class LinkedHashmapDemo {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashmap = new LinkedHashMap<Integer, String>();
        linkedHashmap.put(4, "Multi-Thread");
        linkedHashmap.put(1, "Basic java");
        linkedHashmap.put(3, "Collection");
        linkedHashmap.put(2, "OOP");


        for (Integer key : linkedHashmap.keySet()) {
            String value = linkedHashmap.get(key);
            System.out.println(key + " = " + value);
        }

    }
}
