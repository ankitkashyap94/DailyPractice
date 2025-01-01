

class MythrOne extends Thread{
        public MythrOne(String name){
            super(name);
        }

        public void run(){
           while(true){
               System.out.println("Im Thread One" + this.getName());
           }
        }
}

//class MythrTwo extends Thread{
//    public MythrTwo(String name){
//        super(name);
//    }
//
//    public void run(){
//        System.out.println("Im Thread Twoooooooooooooooo");
//    }
//}

public class ThreadingOne {
    public static void main(String[] args) {

        MythrOne t1 = new MythrOne("Ankit 1");
        MythrOne t2 = new MythrOne("Ankit 2");
        MythrOne t3 = new MythrOne("Ankit 3");
        MythrOne t4 = new MythrOne("Ankit 4");
        MythrOne t5 = new MythrOne("Ankit 5 This is most important");


        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
