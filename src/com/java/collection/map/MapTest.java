package com.java.collection.map;
import java.util.*;
public class MapTest
{
    public static void main(String args[]){

        // HashMap
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        hm.put(102,"");
        hm.put(103,"Rahul");
        hm.remove(104);
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        // LinkedHashMap
        System.out.println("\nLinkedHashMap : ");
        LinkedHashMap<Integer,String> hm1=new LinkedHashMap<Integer,String>();

        hm1.put(100,"Amit");
        hm1.put(101,"Vijay");
        hm1.put(102,"Rahul");
        hm1.put(102,"");
        hm1.put(103,"Rahul");
        for(Map.Entry m:hm1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

