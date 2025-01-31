package PracticeSet;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CH6_RockPaperScissor {
    public static void main(String[] args) {

        String[] select = {"Rock", "Paper", "Scissor"};

        String userSelect = user(select);
        String compSelect = comp(select);

    }

    public static void result(String userSelect, String compSelect){






    }

    public static String user(String[] select) {
        String userOption = "";
        int user;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to Select Option");
        int count = select.length;
        for (int i = 0; i < select.length; i++) {
            System.out.println(i + " --> " + select[i]);
        }
        System.out.println("------------------------------");

        do {
            user = sc.nextInt();

            if (user <= 2) {
                userOption = select[user];
            } else {
                System.out.println("Your selection is invalid. Re-enter your selection!!");
            }
        } while (user > 2);

        sc.close();

        userOption = select[user];
        return userOption;


    }

    public static String comp(String[] select){

        Random ran = new Random();
        int compTurn  = ran.nextInt(0,3);
        String compOption = select[compTurn];
        return compOption;

    }

}
