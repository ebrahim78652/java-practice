package com.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) {
        // every collection inherits from the Iterable interface. use this to make a list, and use the 3 common ways
        //to iterate over an iterable to iterate over a List, which also inherits from the Iterable interface.

        List<String> list = new ArrayList();
        //add some elemennts to it;
        list.add("one");
        list.add("two");
        list.add("three");

        //now use the for-in looop to iterate through the list
        for(String element: list){
            System.out.println(element);
        }

        //now use the iterator that a iterable provides to loop through the list;
        Iterator<String> listIterator = list.iterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //now use the forEach loop to iterate
        list.forEach((String s)->{
            System.out.println(s);
        });

        //now you can try iterating over an object of your Iterable Implementation
        //make an instance of our new iterable;
        IterableImplementation ip = new IterableImplementation();
        ip.add("seven");
        ip.add("eight");
        ip.add("nine");

        //now iterate through our object
        Iterator<String> ourIterator = ip.iterator();
        while(ourIterator.hasNext()){
            System.out.println(ourIterator.next());
        }


    }

    //understanding of the structure and realtion between Iterator and Iterable:
    //Iterable provides all the utilities for a client to allow to iterate over what you are providing
    //the iterator is one of the utilities that the Iterable interface provides.
    
    // the client has to make an inner class extending Iterator maybe, implement the methods, and then use an instance of
    //this class as a helper utility to iterate through the client.

}
