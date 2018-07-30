package com.java.collection.map;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * CREATED BY Hieu on 11:08 SA, 26/07/2018
 */
public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put(".com", "International");
        sortedMap.put(".us", "United States");
        sortedMap.put(".uk", "United Kingdom");
        sortedMap.put(".jp", "Japan");
        sortedMap.put(".au", "Australia");
        sortedMap.put(".vn", "Việt Nam");
        System.out.println("\nCác phần tử của Map");
        System.out.print(sortedMap);
/*        System.out.println("Các entry có trong sortedMapDomain là: ");
        sortedMap.forEach((keyChar, valueInt) -> System.out.println(
                "Key = " + keyChar + ", value = " + valueInt));*/
    }
}
