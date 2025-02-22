package Leaderboard;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class PracticeOne {

    public static void main(String[] args) throws IOException {


        String name = "Ankit";
        String filePath = "C:\\Users\\howar\\Downloads\\fileInput.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        HashSet<Integer> number = new HashSet<>();

        String line;

        while((line = br.readLine()) != null){

           String[] tokens = line.split(" ");

           for(String token : tokens){
               number.add(Integer.parseInt(token));
           }

        }



        reverseString(name);




    }

    public static String reverseString(String str){

        char[] nameArr = str.toCharArray();

        for (int i = 0; i <= Math.floorDiv(nameArr.length, 2); i++) {
            char temp = nameArr[i];
            nameArr[i] = nameArr[nameArr.length - 1 - i];
            nameArr[nameArr.length - 1 - i] = temp;
        }

        String reverse = String.valueOf(nameArr);

        return reverse;

    }


        public static int funct(int[] arr) {
            int res = -1;
            HashSet<Integer> set = new HashSet<>();
            for(int i=0; i< arr.length; i++) {
                set.add(arr[i]);
            }

            for(int i=1; i<= arr.length + 1; i++) {
                if(!set.contains(i)) {
                    res = i;
                }
            }
            return res;
        }

}
