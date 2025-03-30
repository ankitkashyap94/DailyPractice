package PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] marks = {56, 78, 89, 90};

        boolean flag = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks array index: ");
        int idx = sc.nextInt();

        System.out.println("Enter the number you want to divide the value at index " + idx + " with: ");
        int num = 0;

        while(flag){
            try{
                try{
                    num = sc.nextInt();

                    flag = false;


                }catch(InputMismatchException e) {

                    System.out.println("Input Mismatch");
                    System.out.println(e);
                }

                System.out.println("The value of array idx is : " + marks[idx]);
                System.out.println("The value of array idx divided by num is : " + marks[idx]/num);


            }catch(ArithmeticException e){
                System.out.println("Arthemetic exception occurd");
                System.out.println(e);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound occurd");
                System.out.println(e);
            } catch(InputMismatchException e){

            } catch(Exception e){
                System.out.println("Some exception occurd");
                System.out.println(e);
            }
        }

    }
}
