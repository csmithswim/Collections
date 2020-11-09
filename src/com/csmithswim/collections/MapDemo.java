package com.csmithswim.collections;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {
    public static void show(){
        List<Customer> customers = new ArrayList<>();
        // In comps science we use the big O notation that is the cost of the algorithm
        //O(n) - O(10)
        for (var customer : customers)
            if (customer.getEmail() == "e1")
                System.out.println("Found!");
    }
}
