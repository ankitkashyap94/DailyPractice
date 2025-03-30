package MultiThreading;

class MyThread1 extends Thread{
    @Override
    public void run(){

        int n = 0;
       while(n<=1000){
           System.out.println("My Thread 1 is Running");
           System.out.println("I'm Happy");
           n++;
       }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int n = 0;

       while(n<=2000){
           System.out.println("My Thread 2 is Running");
           System.out.println("I'm Sad");
           n++;
       }
    }
}

public class MultiThreadingUsage {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();


    }
}
