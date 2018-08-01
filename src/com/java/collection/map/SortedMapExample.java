package com.java.collection.map;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;


public class SortedMapExample {
    public static void main(String[] args)
    {
        SortedMap<Integer, String> sm =
                new TreeMap<Integer, String>();

        sm.put(new Integer(2), "practice");
        sm.put(new Integer(3), "quiz");
        sm.put(new Integer(5), "code");
        sm.put(new Integer(4), "contribute");
        sm.put(new Integer(1), "geeksforgeeks");
//        sm.put(new Integer(null), "null");//  --->   ERROR
        sm.put(new Integer(-8), null);
        sm.put(new Integer(2), null);
        sm.put(9, null);

        show(sm);
    }
    public static void show(Map<Integer, String> map) {
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + map.get(key));
        }
    }
}


