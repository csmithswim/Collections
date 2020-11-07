Repo containing work about Collections.

Collections framework comes with the standard Java library, these are helpful when working with a collection of
objects.

Of the collection framework there are iterable, collection, list, queue, and set interfaces.

Collection classes include ArrayList, PriorityQueue, HashSet and LinkedList.  

Iterable interface - represents an object that can be used in a foreach statement. Part of the Java language. 

Collection interface - extends iterable interface and adds other functionality, acts as a container of objects. 
It removes objects, searches for objects, etc.

List interface - works with an ordered collection and access objects with its index.

Queue interface - similar to a printer at an office. Extends the collection interface, every queue is a collection.
We use queues when we want to process jobs based on the order we receive them in.

ArrayList class - uses an array to store objects.

LinkedList - covered in data structure and algorithm course.

ArrayList does not support accessing its index with square brackets, and it does not have a length field.

Iterator - an object we use to iterate over an iterable. 

<E> is common convention for declaring a common syntax for declaring classes with a collection semantic because the collection can have multiple elements. 

List interface represents an order collection also called a sequence. So with lists we can access objects by their index.

In collections, we do not care about their index, just adding/removing them from the collection.

List interface extends the collection interface.

ArrayDeque and PriorityQueue are the most popular implementations. Deque is a double-ended queue, special type of queue where values can be entered from two
ends.  PriorityQueue is a special type of queue where each item gets a priority, i.e. a queue that manages the processes in your CPU.

Set interface - Represents a collection that contains no duplicates, great for containing unique values.

Hash table- 




