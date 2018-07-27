package com.java.collection.set;

import java.util.*;

public class TestSet {

    public static void main(String args[]) {

        // HashSet
        HashSet dset = new HashSet();
        dset.add(2);
        dset.add(1);
        dset.add(3);
        dset.add(5);
        dset.add(4);
        Iterator iterator = dset.iterator();
        System.out.print("\nHashSet : ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\nSet example .....");
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("1");
        set.add("2");
        set.add("5");

        for (String temp : set){
            System.out.print(temp + " ");
        }

        // Linked HashSet
        LinkedHashSet<String> al=new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        System.out.print("\nLinked HashSet : ");
        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }
    }
}
