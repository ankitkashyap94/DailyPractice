package PracticeSet;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I'm to String";
    }

    @Override
    public String getMessage() {
        return  "I'm get message";
    }
}


public class CustomException {
    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        if(a<99){

           try{
               throw new MyException();
           }catch(Exception e){
               System.out.println(e.toString());
               System.out.println(e.getMessage());
               System.out.println(e);
               e.printStackTrace();
           }

        }

    }
}
