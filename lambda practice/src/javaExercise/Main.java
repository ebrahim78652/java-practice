package javaExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList= Arrays.asList(new Person("Charles" ,"Dickens"), new Person("Lewis", "Carrol"), new Person("Thomas", "Carlyl")
        , new Person("Charlotte" ,"Bronte"), new Person("Matthew", "Arnold"));
        SortAndPrint(personList);

    }

    public static void SortAndPrint(List<Person> lp){
         Collections.sort(lp);
            System.out.println(lp);
    }
}
