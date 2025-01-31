package PracticeSet;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CH3_SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();

        switch (age) {
            case (17) -> System.out.println("You are not an adult");
            case (18) -> System.out.println("You are adult now");
            case (22) -> System.out.println("you need to be graduate");
            case (25) -> System.out.println("you need to find a job");
            default -> System.out.println("Become Saint");
        }

        System.out.println("Have a good life !!");

    }
}
