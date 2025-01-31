package PracticeSet;

import java.sql.SQLOutput;

public class CWH_14_StringMethods {

    public static void main(String[] args) {
        pracString();
    }

    static void pracString(){
        String name = "Ankit";

        String lower = name.toLowerCase();
        String upper = name.toUpperCase();

        System.out.println(lower + " " + upper);
        System.out.println(name.length());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,5));
        System.out.println(name.replace('A','s'));
        System.out.println(name.replace("nkit", "Shivani"));
        System.out.println(name.startsWith("A") || name.endsWith("P"));
        System.out.println(name.charAt(4));

        char[] naam = name.toCharArray();

        for(int i=0; i<naam.length; i++){
            System.out.println(name.charAt(i));
        }

        String newName = "Ankittt Ankittt";
        System.out.println(newName.indexOf("ittt", 5));
        System.out.println(name.equalsIgnoreCase("ankit"));

    }

}
