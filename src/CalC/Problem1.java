package CalC;

import static java.lang.Math.sin;

public class Problem1 {

    public static void main(String[] args) {

    }
}


class calculator{
    public int sum(int a, int b){
        return a+b;
    }
}

class ScCalc{
    public double sum(int a, int b){
        return sin(a+b);
    }
}

class HyCalc{
    public void sum(int a, int b){
        System.out.println(a+b);
        System.out.println(sin(a+b));
    }
}