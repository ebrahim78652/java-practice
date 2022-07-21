package javaExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        List<Person> personList= Arrays.asList(new Person("Charles" ,"Dickens"), new Person("Lewis", "Carrol"), new Person("Thomas", "Carlyl")
        , new Person("Charlotte" ,"Bronte"), new Person("Matthew", "Arnold"));
        ListPrintable method1 = (s)->{
            for(Person p : s){
                System.out.println(p.getFirstName() + p.getLastName());
            }

            };


        ListPrintable method2 = (s) ->{ for (Person p: s){
            if(p.getLastName().charAt(0)=='C'){
                System.out.println(p);
            }
        }};

        SortAndPrint(personList, method2);

    }

    public static void SortAndPrint(List<Person> lp, ListPrintable listPrintable ){
         Collections.sort(lp);
         listPrintable.printList(lp);
    }


}
