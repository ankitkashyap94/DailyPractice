package PracticeSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharsFromString {

    public static void main(String[] args) {

        String text = "Programming";
        countDuplicateChars(text.toLowerCase());

    }

    public static void countDuplicateChars(String str){

//        Arrays.sort(str.toCharArray());

        Map<Character, Integer> countMap = new HashMap<>();

        for(char ch : str.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch,0)+1);
        }


        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
