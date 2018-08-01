package com.java.collection.map;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by phannguyencamhuong on 7/26/18.
 */
public class LinkedHashMapExample {

    public static void main(String args[]) {

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(null, null);
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(3, "C++");
        linkedHashMap.put(2, "PHP");
        linkedHashMap.put(4, "Python");
        linkedHashMap.put(null, "Kotlin");

        show(linkedHashMap);
    }
    public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
