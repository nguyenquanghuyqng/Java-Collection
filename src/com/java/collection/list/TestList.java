package com.java.collection.list;

import java.lang.reflect.Field;
import java.util.*;

public class TestList {

    public static void main(String[] args) throws Exception {

        // ArrayList
        ArrayList<String> al = new ArrayList<>();//creating arraylist
        al.add("Sonoo");//adding object in arraylist
        al.add("Michael");
        al.add("James");
        al.add("Andy");
        al.add("");
        al.add(null);
        al.add("Andy");
        //traversing elements using Iterator
        System.out.println("ArrayList :"+al);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.format("\nList example -----------Capacity: %d%n", getCapacityArrayList(al));
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
        Vector<String> v = new Vector<String>(2);//creating vector
        v.add("umesh");//method of Collection
        v.addElement("irfan");//method of Vector
        v.addElement("kumar");
        v.addElement("");
        v.addElement(null);
        v.addElement("kumar");
        System.out.format("\nVector -----------Capacity: %d%n", getCapacityVector(v));
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

    public static int getCapacityArrayList(ArrayList<?> list) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(list)).length;
    }
    public static int getCapacityVector(Vector<?> list) throws Exception {
        Field dataField = Vector.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(list)).length;
    }
}
