package Optionals;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //here make a consumer of the client, who will try to get a cat.
        //and we will have to make a null check before we can use it, else we will get a null pointer exception.
        Cat cat = new Cat();

        //the below will not give us a null pointer exception.
        cat.getName().ifPresentOrElse(System.out::println, () -> {
            System.out.println("no value provided");
        });

        //to solve the problem, we will make the getter return an Optional.
    }
}

