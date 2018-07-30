package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * CREATED BY Hieu on 9:36 SA, 26/07/2018
 */
public class HashmapDemo {
    public static void main(String[] args) {

        //Hashmap
        Map<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("Windows", "2000");
        hashmap.put("Windows", "XP");
        hashmap.put("Language2", "Java");
        hashmap.put("Language1", ".Net");
        System.out.println("\nCác phần tử của Map");
        System.out.print(hashmap);
        System.out.println("\n");
    }
}
