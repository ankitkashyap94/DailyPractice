package PracticeSet;

import java.util.Scanner;

public class CH4_TaxCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter income");

        float income = sc.nextFloat();
        int tax = 0;

        if (income > 0 && income <= 2.5f) {

            tax = tax + 0;

        } else if (income > 2.5 && income < 5.0) {
            tax = (int) (tax + 0.05f * (income - 2.5));
        } else if (income > 5.0f && income < 10.0f) {
            tax = (int) (tax + 0.05f * (5.0f - 2.5f));
            tax = (int) (tax + 10.0f * (income - 5.0f));
        } else if(income > 10.0f){
            tax = (int) (tax + 0.05f * (5.0f - 2.5f));
            tax = (int) (tax + 20.0f * (10.0f - 5.0f));
            tax = (int) (tax + 30.0f * (income - 10.0f));

        }

        System.out.println(tax);


    }
}
