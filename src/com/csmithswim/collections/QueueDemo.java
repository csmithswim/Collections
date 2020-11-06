package com.csmithswim.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        //The generic type on ArrayDeque does not need to be specified because the java
        //compiler knows it is a generic type String from the Queue interface
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        //offer adds an item to the end of the queue, the offer throws false if the queue is full while add throws an exception when the queue
        //is of a limited size
        queue.offer("d");
        //d -> b -> a -> c

        //To get the item at the front of the queue
        var front = queue.peek();
        System.out.println(front);

        //Similar to peek is element
        //Peek returns null if the queue is empy while element throws an exception
        var front = queue.element();

        //To remove item at the front of the queue
        var front = queue.remove();
        System.out.println(front);

        //Poll is similar to remove, it returns null if queue is empy while remove throws an exception.
        var front = queue.poll();
        System.out.println(front);
    }
}
