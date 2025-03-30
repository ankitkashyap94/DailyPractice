package PracticeSet;

import java.util.Scanner;

import static PracticeSet.calculateFunctions.*;

class calculateFunctions {

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double substract(double a, double b) {
        return a - b;
    }

    public static double division(double a, double b) throws ArithmeticException {
        if (b < 1) {
            throw new ArithmeticException("/ by zero not allowed");
        } else {
            return a / b;
        }
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }


}

public class CH86_Calculator {
    public static void main(String[] args) {
        /*
         * Ex 06 : Create a custom calculator with following operations
         * - Addition
         * - Substraction
         * - Multiplication
         * - Division
         * - which thows the following exception
         * -- Invalid input exception
         * -- Arithmetic Exception /zero not allowed
         * -- Max input exception if any of the inputs is greater than 100000
         * -- Max Multiplier reached exception - dont allow any multiplication input to be greater than 7000
         */

        double result = 0;

        calculateFunctions cf = new calculateFunctions();

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter 1st value");
        double a = sc.nextDouble();

        System.out.println("Select operation -->  (/, *, -, +): ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter 2nd value");
        double b = sc.nextDouble();

        switch (operator) {
            case '+':
                System.out.println(addition(a, b));;
                break;

            case '-':
                System.out.println(substract(a,b));;
                break;

            case '*':
                System.out.println(multiplication(a,b));;
                break;

            case '/':
                try{
                    System.out.println(division(a,b));
                }catch (Exception e){
                    System.out.println(e);
                }
                break;

            default:
                System.out.println("Invalid Operator Entered");
                break;
        }


    }
}
