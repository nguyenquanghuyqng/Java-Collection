package com.java.collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

/**
 * CREATED BY Hieu on 9:27 SA, 30/07/2018
 */
public class IdentityHashMapDemo {
    public static void main(String args[]) {

        IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<String, String>();

        identityHashMap.put("a", "Apple");
        identityHashMap.put(new String("a"), "Aeroplane");
        identityHashMap.put("b", "Ball");
        identityHashMap.put(new String("b"), "Bat");
        identityHashMap.put("c", "Cat");

        for (String str : identityHashMap.keySet()) {
            System.out.println("Key : " + str + " and Value : " + identityHashMap.get(str));
        }
        System.out.println("Size of identityHashMap is : " + identityHashMap.size());

        HashMap<String,String>hashMap=new HashMap<>(identityHashMap);

        for (String str2 : hashMap.keySet()) {
            System.out.println("Key : " + str2 + " and Value : " + hashMap.get(str2));
        }
        System.out.println("Size of hashMap is : " + hashMap.size());

        /*String a = new String("x");
        String b = new String("x");
        String c ="x";

        System.out.println("a==b ? "+ (a==b));// kết quả: a==b?false

        System.out.println("a.equals(b)?" + a.equals(b));// kết quả e.quals(b)?true

        System.out.println("a==c ? "+ (a==c));// kết quả: a==b?false

        System.out.println("a.equals(c)?" + a.equals(c));// kết quả e.quals(b)?true*/

    }
}
