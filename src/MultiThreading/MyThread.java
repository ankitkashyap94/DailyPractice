package MultiThreading;

class MyThreadRunnable extends Thread{
    public MyThreadRunnable(String name){
        super(name);
    }

    public void run(){
        MyThreadRunnable t1 = new MyThreadRunnable("");
       while(true){
           System.out.println("My thread is running => " + t1.getId());
       }
    }
}


public class MyThread {
    public static void main(String[] args) {
        MyThreadRunnable t1 = new MyThreadRunnable("Ankit");
        t1.start();
    }

}
