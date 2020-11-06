package com.csmithswim.collections;

import java.util.*;

public class SetDemo {
    public static void show(){
        Set<String> set1 =
          new HashSet<>(Arrays.asList("a","b","c"));

        Set<String> set2 =
          new HashSet<>(Arrays.asList("a","b","c","d"));

        // Union operation, the combination of two sets.
        set1.addAll(set2);

        //Intersection operation, which gives us the items that are common in both sets
        set1.retainAll(set2);

        //Difference, the operation that shows the items that are not shared
        set1.removeAll(set2);
    }
}

//Short way of filtering out duplicates using set interface
//public class SetDemo {
//    public static void show(){
//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a","b","c","c");
//        Set<String> set = new HashSet<>(collection);
//        System.out.println(set);
//    }
//}

    //A long version using the Set interface
//    public static void show(){
//        //One implementation of the set interface that is very popular
//        Set<String> set = new HashSet<>();
//        //Adding blue two times to illustrate how duplicates are filtered out.
//        //Set interface DOES NOT GUARANTEE the order of items, just the uniqueness.
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");
//        System.out.println(set);
//    }
//}
