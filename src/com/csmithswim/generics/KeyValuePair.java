package com.csmithswim.generics;

//We can use multiple type paramters with classes too
public class KeyValuePair <K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value){
        this.key = key;
        this.value = value;
    }
}
