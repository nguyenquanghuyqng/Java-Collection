package com.java.collection.map;

import java.util.ArrayList;
import java.util.Vector;

/**
 * CREATED BY Hieu on 3:00 CH, 26/07/2018
 */
public class VectorDemo {
    public static void main(String args[]) {
        /*// create default vector
        Vector v = new Vector();


        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");
        v.add(3);

        System.out.println("Vector is " + v);*/
        // create default vector
       /* Vector v = new Vector();


        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "geeks");
        v.add(3, "forGeeks");
        v.add(4, 3);

        System.out.println("Vector is " + v);*/

        ArrayList arr = new ArrayList();
        arr.add(3);
        arr.add("geeks");
        arr.add("forgeeks");
        arr.add(4);


        // createn default vector
        Vector v = new Vector();

        v.add(2);
        // copying all element of array list int0 vector
        v.addAll(1, arr);

        // checking vector v
        System.out.println("vector v:" + v);
    }
}
