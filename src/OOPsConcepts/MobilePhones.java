package OOPsConcepts;

interface Vechele{
    int accelerate(int speed);
    int Break(int speed);
    void Stering();
}

interface bike extends Vechele{

    final int a = 102;

    void handle();
    void backseat();

}

class ducati implements bike{

    @Override
    public void handle() {
        System.out.println("Turn left and right");
    }

    @Override
    public void backseat() {
        System.out.println("Back Person");
    }

    @Override
    public int accelerate(int speed) {
        System.out.println("Speed increasing = " + speed++);
        return speed;
    }

    @Override
    public int Break(int speed) {
        System.out.println("Speed decreasing = " + speed--);
        return speed;

    }

    @Override
    public void Stering() {
        System.out.println("Car turning");
    }
}

class BMW extends ducati{
    public void handle(){

    }
}




public class MobilePhones extends xiaomi{
    public static void main(String[] args) {
//        xiaomi mi = new MobilePhones();
//        MobilePhones mobile = new MobilePhones();
//        mi.call();
//        mobile.video();
//        mobile.call();


        BMW b1 = new BMW();
        System.out.println( b1.Break(45));

        System.out.println(b1.a);

        int[] a = new int[8];

        for(int i = 0; i<=a.length-1; i++){
            System.out.println(i);
        }

        
    }

    static{
        System.out.println("this is static block");
    }

    public static void video(){
        System.out.println("Playing video");
    }
}
