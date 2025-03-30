package PracticeSet;



public class ThrowAndThrows {
    public static void main(String[] args) {

        int c;
        try{
            c = divide(6,0);
            System.out.println(c);

            double areaa = area(-5);
            System.out.println(areaa);

        }catch(Exception e){
            System.out.println(e + " --> Divide by zero is not allowed");
        }finally {
            System.out.println("This is the end of the program");
        }



    }


    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static double area(double r) throws NegativeRediusException{
        if(r < 0){
            throw new NegativeRediusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

}

class NegativeRediusException extends Exception{

    @Override
    public String toString() {
        return "redius cannot be in negative";
    }

    @Override
    public String getMessage() {
        return "redius cannot be in negative";
    }
}
