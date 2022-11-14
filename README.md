# Doubly linked list

The purpose of this exercise is to train you to create and use a custom doubly linked list.  

Duration _60 minutes_.

## Restrictions

`DoublyLinkedListImpl` class must have only two fields `head` and `tail` (in particularly it must have no `size` field). Also it must contain a default constructor which can be called with no arguments to create an empty list.

> _Note_:
> You are not allowed to use any types from `java.util` package (and its subpackages) except of the `java.util.Optional` 

## Description 
Please, proceed to `DoublyLinkedListImpl` class and implement the following methods (all of them are given in `DoublyLinkedList` interface):  

* `boolean addFirst(Object element)` inserts an element to the head of list, returns true if an element successfully added, false otherwise;  

* `boolean addLast(Object element)` appends an element to the end of list, returns true if an element successfully added, false otherwise;  

* `void delete(int index)` deletes an element by index, throws *IndexOutOfBoundsException* if the index is out of range;  

* `Optional<Object> remove(Object element)` returns the first occurrence of the specified element in this list and removes it, you have to use the `equals` method to find the occurance;  

* `boolean set(int index, Object element)` replaces the element at the specified position in list with the specified element, throws *IndexOutOfBoundsException* if the index is out of range;  

* `int size()` returns the number of elements in list;  

* `Object[] toArray()` returns an array containing all the elements in order from the first to the last, in other words from the head to the tail of list;  

* `String toString()` returns a string representation of this list; the string representation consists of all the elements separated with a space. For a example if a list contains three elements *o1*, *o2*, *o3* then `toString` method returns *"s1 s2 s3"* where *s1=o1.toString()*; *s2=o2.toStribng()*; *s3=o3.toString()*.

> You have to implement two types: the top level class `DoublyLinkedListImpl` and the nested class `Node`. The top level interface `DoublyLinkedList` is given, don't change any content of it.  

# Details

* You have to implement `Node` class. Every instance of `Node` contains an object and the references to a previous node and a next node. Every doubly linked list consists of such nodes.

* Doubly linked list cannot contain the null reference.
