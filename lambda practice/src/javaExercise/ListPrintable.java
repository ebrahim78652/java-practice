package javaExercise;

import java.util.List;

@FunctionalInterface
public interface ListPrintable {
    public  void printList(List<? extends Person> list );
}
