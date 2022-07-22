package ExceptionHandling;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello exception handling|");

        //make an arr and a key and a process method and pass it to the method we created below
        int[] arr = {1,2,3,4,5};
        int key = 2;
        BiConsumer<Integer, Integer> callback  = (keyPassed, arrElement)->{
            System.out.println(arrElement+keyPassed);
        };

        doAnActionOnTheElementsOfTheArray(arr, key, callback);
    }


   public static void doAnActionOnTheElementsOfTheArray(int[] arr, int key, BiConsumer<Integer, Integer> bc){
        //for each element in the array, call the callback
       for (int i : arr) {
           bc.accept(key, i);
       }
   }
}
