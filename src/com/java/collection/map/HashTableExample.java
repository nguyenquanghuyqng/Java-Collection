package com.java.collection.map;


import java.util.Hashtable;
import java.util.Set;

/**
 * Created by phannguyencamhuong on 7/26/18.
 */
public class HashTableExample {

    public static void main(String args[]) {

        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

        hashtable.put(1, "Javascript");
        hashtable.put(2, "C++");
        hashtable.put(-3, "Java");
        hashtable.put(4, "PHP");
        hashtable.put(10, "Python");
        hashtable.put(6, "C#");
        hashtable.put(6, "KKK");
//        hashtable.put(null, null);    --->  ERROR
//        hashtable.put(null, "C#");    --->  ERROR
//        hashtable.put(7, null);        --->  ERROR

        show(hashtable);
    }

    public static void show(Hashtable<Integer, String> hashtable) {
        Set<Integer> keySet = hashtable.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + hashtable.get(key));
        }
    }
}
