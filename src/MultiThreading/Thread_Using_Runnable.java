package MultiThreading;


class NewThread implements Runnable{
private String name;
private Runnable rbl;
    public NewThread(String name, Runnable rbl) {
    this.name = name;
    this.rbl = rbl;
    }

    @Override
    public void run() {
        int n = 0;
         while(n<4000){
             System.out.println("This is runnable in NewThread > " + name + rbl);
             n++;
         }

    }
}


public class Thread_Using_Runnable {

    public static void main(String[] args) {

       Runnable r1 = new Runnable() {
           @Override
           public void run(){
           }
       };

    }

}
