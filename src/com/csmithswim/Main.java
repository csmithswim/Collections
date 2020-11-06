package com.csmithswim;

import com.csmithswim.collections.Customer;
import com.csmithswim.collections.EmailComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//This is an example of Comparator interface
public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));
        //Sorting with the EmailComparator interface
        Collections.sort(customers, new EmailComparator());
        //Make sure to override the toString method in the class to convert object to string.
        System.out.println(customers);
    }
}

//This is an example of the Comparable Interface
//public class Main {
//        public static void main(String[] args) {
//        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer("b"));
//        customers.add(new Customer("a"));
//        customers.add(new Customer("c"));
//        Collections.sort(customers);
//        //Make sure to override the toString method in the class to convert object to string.
//        System.out.println(customers);
//    }
//}

