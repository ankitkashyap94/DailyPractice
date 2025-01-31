package PracticeSet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GetMarksAvg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter nos of subjects you have");
        int subCount = sc.nextInt();

        int[] subsMarks = new int[subCount];
        int i = 0;
        do{
            System.out.println("Enter subject marks");
            subsMarks[i] = sc.nextInt();
           i++;


        }while(i <= subsMarks.length-1);



            for(int marks : subsMarks){
                total = total + marks;
            }

            float average = total / subCount;

        System.out.println(average);



    }
}
