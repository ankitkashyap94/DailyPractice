import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       try{
           int result = divide(a,b);
           System.out.println(result);

       }catch(Exception e){
           System.out.println(e);
       }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }
}



