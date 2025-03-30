package MultiThreading;


import java.sql.SQLOutput;

class MyRunnable1 implements Runnable {
    public void run(){
        int n = 0;
        while(n<=20000){
            System.out.println("This method 1 is runnable 1");
            n++;
        }
    }
}

class MyRunnable2 implements Runnable {
    public void run(){
       int n = 0;
        while(n<=10000){
           System.out.println("This method 2 is runnable 2");
            n++;
        }
    }
}


public class multi_threading_using_runnable {
    public static void main(String[] args) {

        MyRunnable1 b1 = new MyRunnable1();
        Thread gun1 = new Thread(b1);

        MyRunnable2 b2 = new MyRunnable2();
        Thread gun2 = new Thread(b2);

        gun1.start();
        gun2.start();

    }
}
