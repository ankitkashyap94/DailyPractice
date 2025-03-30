package JavaCollections;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] numbers = {25,14,23,66,51,42,58,95,66,85,95,66};

        Arrays.sort(numbers);

       for(int i : numbers){
           System.out.print(i + " ");
       }
    }
}
