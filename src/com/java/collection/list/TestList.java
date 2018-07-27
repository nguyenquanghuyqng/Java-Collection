package com.java.collection.list;

import java.util.*;

public class TestList {

    public static void main(String[] args) {

        // ArrayList
        List<String> al = new ArrayList<String>();//creating arraylist
        al.add("Sonoo");//adding object in arraylist
        al.add("Michael");
        al.add("James");
        al.add("Andy");
        //traversing elements using Iterator
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("List example .....");
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("1");

        for (String temp : list){
            System.out.print(temp + " ");
        }

        // Vector
        System.out.println("\nVector ---------- ");
        Vector<String> v = new Vector<String>();//creating vector
        v.add("umesh");//method of Collection
        v.addElement("irfan");//method of Vector
        v.addElement("kumar");
        v.addElement("");
        v.addElement("kumar");

        System.out.print("Vector : " + v+"\n");
        //traversing elements using Enumeration
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement()+ " ");
        }


                // LinkedList
        System.out.println("\nLinkedList -------- ");
        List<String> al2=new LinkedList<String>();//creating linkedlist
        al2.add("James");//adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");
        al2.add("");
        al2.add("Junaid");
        System.out.println("linkedlist: "+al2);
    }
}
