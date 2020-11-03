package com.csmithswim.collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b","c");

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        //how to test equality of two different collections
        System.out.println(collection.equals(other));
    }
}

//How to add multiple elements at the same time using the Collections class
//public class CollectionsDemo {
//    public static void show() {
//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a", "b","c");
//
//        for (var item : collection)
//            System.out.println(item);
//
//        //remove method
//        collection.remove("a");
//
//        //Removes all items
//        collection.clear();
//
//        //size method of collection, similar to length
//        System.out.println(collection.size());
//
//        //isEmpty() method to verify if a collection is empty
//        System.out.println(collection.isEmpty());
//
//        //converting a regular collection to an array
//        Object[] objectArray = collection.toArray(); //To return an array of objects
//        String[] stringArray = collection.toArray(new String[0]); //Passing a 0 will create enough capacity to store all the items
//    }
//}

//How to add items to our collection and also iterate through them for our console.

//public class CollectionsDemo {
//    public static void show() {
//        Collection<String> collection = new ArrayList<>();
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//        for (var item : collection)
//            System.out.println(item);
//        }
//    }
//
