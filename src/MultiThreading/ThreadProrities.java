package MultiThreading;


class Priorities extends Thread {

    private String name;

    public Priorities(String name){
       this.name = name;
    }

    public void run(){
        int n = 0;
      while(n<40000){
          System.out.println("This is the Thread =>" + name);
          n++;
      }
    }
}

public class ThreadProrities {

    public static void main(String[] args) {

        Priorities p1 = new Priorities("Arun");
        Priorities p2 = new Priorities("ABhi");
        Priorities p3 = new Priorities("Ankit");
        Priorities p4 = new Priorities("Anshu");
        Priorities p5 = new Priorities("Aarav");



        p1.setPriority(Thread.MAX_PRIORITY);


        p1.start();
        try{
            p1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        p2.start();



    }
}
