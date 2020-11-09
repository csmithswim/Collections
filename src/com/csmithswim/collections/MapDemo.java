package com.csmithswim.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Using map to get an entry in a list
public class MapDemo {
    public static void show(){
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        //The Map interface has many interfaces but generally uses the HashMap class
        Map<String, Customer> map = new HashMap<>();
        //Storing the customers in our HashMap
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        //replace method, replaces an entry.
        map.replace("e1", new Customer("a++", "e1"));


        //containsKey method, returns a boolean value if the list does not have the key
        var exists = map.containsKey("e10");
        System.out.println(exists);


        var unknown = new Customer("Unknown", "");
        //If map cannot find a customer with this key it will return the unknown customer object
        var customer = map.getOrDefault("e10", unknown);

        //One way to find an object in the hashmap, returns null if key does not exist
        var customer = map.get("e1");
        System.out.println(customer);

        //To iterate over a map and return the keys, use keySet
        for (var key : map.keySet())
            System.out.println(key);

        //To iterate with entrySet it returns the key/value, can also use entry.getValue() to get value or entry.getKey() to get key
        for (var entry : map.entrySet())
            System.out.println(entry);

        //To loop through an object in a map, the order is not the same as it was to be added
        for (var customer : map.values())
            System.out.println(customer);
    }
}

//One approach to get an entry is using a loop to iterate over a list
//public class MapDemo {
//    public static void show(){
//        List<Customer> customers = new ArrayList<>();
//        // In comps science we use the big O notation that is the cost of the algorithm
//        //O(n) - O(10)
//        for (var customer : customers)
//            if (customer.getEmail() == "e1")
//                System.out.println("Found!");
//    }
//}
