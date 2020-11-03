package com.csmithswim.generics;

//The Iterable Interface

import java.util.Iterator;

public class GenericList <T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    //The implementation of our ListIterator, this is the only code you need to change if you want to iterate
//    through a different type of data structure

    private class ListIterator implements  Iterator<T> {
        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list){
        this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}

//Implementing a restriction: extending this GenericList class to only accept primitive types of numbers
//Java has a popular interface called Comparable that compares classes based on some criteria.
//Cloneable is another popular interface that clones a class
//T parameter is now bounded and restricted.

//public class GenericList <T extends  Comparable & Cloneable>{
//    private T[] items = (T[]) new Object[10];
//    private int count;
//
//    public void add(T item) {
//        items[count++] = item;
//    }
//
//    public T get(int index) {
//        return items[index];
//    }
//}

//Use T for type or template, or E for element for a class that acts as a collection within <>
//It is a type parameter, it represents the types of objects we want to store in this class.
//T represents the type of object we want to store, i.e. User, Integer, String, etc.

//public class GenericList <T extends Number>{
//    private T[] items = (T[]) new Object[10];
//    private int count;
//
//    public void add(T item) {
//        items[count++] = item;
//    }
//
//    public T get(int index) {
//        return items[index];
//    }
//}
