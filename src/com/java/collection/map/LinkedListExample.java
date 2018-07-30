package com.java.collection.map;

import java.util.LinkedList;

/**
 * CREATED BY Hieu on 2:40 CH, 26/07/2018
 */
public class LinkedListExample {
    public static void main(String[] args) {
        // Create linkedList
        LinkedList<String> linkedList = new LinkedList<String>();
        // Add objects to linkedList
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("PHP");
        linkedList.add("Java");
        System.out.print(linkedList);
        /*// Show list through Iterator
        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // add first
        linkedList.addFirst("Python");
        // Show list through for-each
        System.out.println();
        for (String obj : linkedList) {
            System.out.print(obj + ", ");
        }
        // add last
        linkedList.addLast("Ruby");
        // Show list through index
        System.out.println();
        int size = linkedList.size();
        for (int i = 0; i < size; i++) {
            System.out.print(linkedList.get(i) + ", ");
        }*/
    }

}
