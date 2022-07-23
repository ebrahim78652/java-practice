package com.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableImplementation implements Iterable<String> {

    List<String> list = new ArrayList<>();

    public void add(String stringToAdd){
        list.add(stringToAdd);
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }
}
