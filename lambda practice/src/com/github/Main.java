package com.github;

public class Main {


    //make a method that accepts an object of type interface
    public void greet(Greetable g){
        g.foo();
    }
    public static void main(String[] args) {
        Greetable lamda = ()->{
            System.out.println("custom function");
        };

        //make an anonoymous class and try running the same code:
        Greetable anotherVar = new Greetable() {
            @Override
            public void foo() {
                System.out.println("hey hey boyus");
            }
        };



        Main myVar = new Main();
        myVar.greet(lamda);
        myVar.greet(anotherVar);
    }
}
