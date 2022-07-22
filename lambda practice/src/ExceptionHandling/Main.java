package ExceptionHandling;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        //make an arr and a key and a process method and pass it to the method we created below
        int[] arr = {1,2,3,4,5};
        int key = 0;
        BiConsumer<Integer, Integer> callback  = (keyPassed, arrElement)->{
            System.out.println(arrElement/keyPassed);
        };

        doAnActionOnTheElementsOfTheArray(arr, key, wrapperErrorHandler(callback));
    }

    public static void doAnActionOnTheElementsOfTheArray(int[] arr, int key, BiConsumer<Integer, Integer> bc){
        //for each element in the array, call the callback
        for (int i : arr) {
            bc.accept(key, i);
        }
    }

    public static <T> BiConsumer<T, T> wrapperErrorHandler(BiConsumer<T, T> bc) {
     return (v, k)-> {
         try {
             bc.accept(v, k);
         }
         catch(Exception e) {
             System.out.println("ooppps an error occured");
         }
     };


    }



}




   //for Exception handling , pass the callback that we give to the "doAnActionOnTheElementsOfTheArray" to another function, this function does the same thing as
    //what is happening in the for loop, but adds the try catch around the code.
