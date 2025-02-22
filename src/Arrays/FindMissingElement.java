package Arrays;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

import static Arrays.Solution1.findMissingElement;

public class FindMissingElement extends Solution1 {
    public static void main(String[] args) throws IOException {

        FindMissingElement fme = new FindMissingElement();
        fme.findMissingElement();
    }
}


class Solution1 {

    public static void findMissingElement() throws IOException {

        String[] tokens;

        List<Integer> numbers = new ArrayList<>();

        String filePath = "C:\\Users\\howar\\Downloads\\fileInput.txt";

        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line;

        while((line = br.readLine()) != null){

           tokens = line.split(" ");

            for(String token : tokens){
             numbers.add(Integer.parseInt(token));
            }


        }

        int maxValue = Collections.max(numbers);
        //System.out.println(maxValue);
        int minValue = Collections.min(numbers);

        List<Integer> missings = new ArrayList<>();

        for(int i=minValue; i<=maxValue; i++){

            if(!numbers.contains(i)){
                System.out.println(i);
            }else{
                int miss = maxValue + 1;
            }

        }





    }

}