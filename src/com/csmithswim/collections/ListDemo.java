package com.csmithswim.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        //How to add an list object with other elements
        Collections.addAll(list, "a","b","c","a");
        //Getting the first object by the get method
        System.out.println(list.get(0));
        //Replacing an object at a specific index
        list.set(0, "a+");
        //Removing a specific object by its index
        list.remove(0);
        //indexOf method, it will return -1 if the object does not exist in the list
        System.out.println(list.indexOf("a"));
        //lastIndexOf method, returns the index of last occurrence of an object
        System.out.println(list.lastIndexOf("a"));
        //subList method two indexes, from/to, from is inclusive and to is exclusive, similar to slice. It does not mutate
        //the original list
        System.out.println(list.subList(0,2));
    }
}

//public class ListDemo {
//    public static void show() {
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        //Also an overload of the add that takes an integer as a parameter for the index to insert an element
//        list.add(0, "!");
//    }
//}
