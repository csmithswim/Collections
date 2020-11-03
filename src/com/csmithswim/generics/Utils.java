//package com.csmithswim.generics;
//
//public class Utils {
//    //Common convention is to make it static
//    //We can declare a generic method inside a non-generic class
//    //In order to compare the two objects we have to tell the Java compiler that T is an object that implements
//    //The comparable interface and apply the constraint.
//    public static <T extends Comparable<T>> T max(T first, T second){
//        return (first.compareTo(second) <0) ? second : first;
//    }
//
//    //Just one user object
//    public static void printUser(User user){
//        System.out.println(user);
//    }
//
//    //Making a new generic list of users
//    //? is a wildcard, which represents an unknown type.
//    //class CAP#1 extends User {}, we use 1 because there could be multiple wildcards
//    //class Instructor extends User {}
//    //You can only read from this list when we use the extends keyword
//    //To add to the list we would use the super keyword
//    public static void printUsers
//            (GenericList<? super User> users){
//        GenericList<Object> temp = new GenericList<>();
//        Object x = users.get(new Instructor(1));
//    }
//
//
//
//    //Sometimes we want to use several types of type parameters
//    //Common convention for multiple types is K and V
//
////    public static <K, V> void print(K key, V value) {
////        System.out.println(key + "=" + value);
////    }
//}
