package com.java.collection.map;

import java.util.Hashtable;

/**
 * CREATED BY Hieu on 11:06 SA, 26/07/2018
 */
public class HashTableDemo {
    public static void main(String[] args) {
        //hashtable
        Hashtable<Integer , String> hashtable = new Hashtable<Integer, String>();
        hashtable.put(9, "C++");
        hashtable.put(10, "Python");
        hashtable.put(14, "Java");
        hashtable.put(23, "PHP");
        hashtable.put(7, "Kotlin");
        hashtable.put(6, "C#");

        System.out.println(hashtable);

        /*Set<Integer> keySet = hashtable.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + hashtable.get(key));
        }

        hashtable.remove(2);

        Set<Integer> keySet2 = hashtable.keySet();
        for (Integer key : keySet2) {
            System.out.println(key + " " + hashtable.get(key));
        }*/
    }
}
