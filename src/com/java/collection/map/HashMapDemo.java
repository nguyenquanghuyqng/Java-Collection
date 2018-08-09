package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hieu on 01/08/2018
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<JBT, Integer> m1 = new HashMap<JBT, Integer>();
        JBT t1 = new JBT(1, 2);
        JBT t2 = new JBT(1, 3);
        JBT t3 = new JBT(2, 1);
        m1.put(t1, 1);
        m1.put(t2, 2);
        m1.put(t3, 3);
        System.out.println(m1);

        for (Object key : m1.keySet()) {
            System.out.println("Key : " + key.toString() + " Value : "
                    + m1.get(key));
        }
    }
}
class JBT {
    JBT(int i, int j) {
        this.i = i;
        this.j = j;
    }
    int i, j;
    @Override
    public int hashCode() {
        System.out.println("Inside HashCode Method");
        int k = i + j;
        return k;
    }
    @Override
    public boolean equals(Object obj) {
        System.out.println("Inside Equals Method");
        if (i == ((JBT) obj).i && j == ((JBT) obj).j)
            return true;
        else
            return false;
    }
    @Override
    public String toString() {
        return String.valueOf(i).concat(String.valueOf(j));
    }
}
