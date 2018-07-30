package com.java.collection.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by phannguyencamhuong on 7/26/18.
 */

public class TreeMapExample {

    public static void main(String args[]) {
        // init treeMap
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        // add elements to treeMap
        treeMap.put(1, "Java");
        treeMap.put(7, "C");
        treeMap.put(3, "PHP");
        treeMap.put(4, "Python");
//         treeMap.put(null, null);  --> ERROR
        treeMap.put(5, null);
        treeMap.put(-2, null);
        treeMap.put(7, "C#");
        // show treeMap
        show(treeMap);
    }

    public static void show(Map<Integer, String> map) {
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + map.get(key));
        }
    }

}

