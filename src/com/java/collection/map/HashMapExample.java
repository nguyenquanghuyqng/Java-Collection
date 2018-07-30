package com.java.collection.map;

import java.lang.Integer;import java.lang.String;import java.lang.System;import java.util.HashMap;
import java.util.Set;

/**
 * Created by phannguyencamhuong on 7/26/18.
 */

public class HashMapExample {

    public static void main(String args[]) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(4, "Python");
        hashMap.put(null, null);
        hashMap.put(1, "Java");
        hashMap.put(3, "C++");
        hashMap.put(2, "PHP");
        hashMap.put(-2, null);
        hashMap.put(-9, null);
        hashMap.put(-9, "Javascipt");
        hashMap.put(null, "C");

        show(hashMap);
    }

    public static void show(HashMap<Integer, String> hashMap) {
        Set<Integer> keySet = hashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + hashMap.get(key));
        }
    }
}
