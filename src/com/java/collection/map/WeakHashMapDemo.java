package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * CREATED BY Hieu on 10:11 SA, 26/07/2018
 */
public class WeakHashMapDemo {
    public static void main(String[] args) {
        Map hashMap= new HashMap();
        Map weakHashMap = new WeakHashMap();

        String keyHashMap = new String("keyHashMap");
        String keyWeakHashMap = new String("keyWeakHashMap");

        hashMap.put(keyHashMap, "helloHash");
        weakHashMap.put(keyWeakHashMap, "helloWeakHash");

        System.out.println("HashMap before: "+hashMap);
        System.out.println("WeakHashMap before: "+weakHashMap);
        keyHashMap = null;
        keyWeakHashMap = null;

        System.gc();
        System.out.println("\nHashMap After: "+hashMap);
        System.out.println("WeakHashMap After: "+weakHashMap);

    }
}
