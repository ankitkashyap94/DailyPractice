package PracticeSet;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {
    public static void main(String[] args) {

        String regex = "A-Z.*";

     Scanner sc = new Scanner(System.in);
     //String text = sc.nextLine();
      Pattern pat = Pattern.compile(regex);
      Matcher mat  = pat.matcher("aaaazzzAAAAHHHHzzzzzZZ@#$%^&*3456");

        System.out.println(mat.find());


    }
}
