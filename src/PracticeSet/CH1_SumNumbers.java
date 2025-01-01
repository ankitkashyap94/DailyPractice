package PracticeSet;

import java.util.Scanner;

public class CH1_SumNumbers {
    public static void main(String[] args) {
        System.out.println(printSum(45,14,16));
        System.out.println(printCgpa(87.2f, 65, 67));
        System.out.println("Hello "+ printMsg("Ankit") +" Have a good day. ");
        System.out.println(checkInt());
    }

    //Quest1
    public static int printSum(int a, int b, int c){

        int sum = a+b+c;
        return sum;

    }

    //Quest2
    public static float printCgpa(float a, float b, float c){

        float sum = a+b+c;
        return sum;

    }

    public static String printMsg(String name){

        return name;


    }

    public static boolean checkInt(){

        Scanner sc = new Scanner(System.in);
        int num = sc. nextInt();
        System.out.println(sc.hasNextInt());

        return false;
    }



}
