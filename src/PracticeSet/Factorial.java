package PracticeSet;

public class Factorial {

    public static void main(String[] args) {
        System.out.println( printFact(5));
        System.out.println( usingIterative(1));


    }

    static int printFact(int n){

        if(n == 0 || n == 1){
            return 1;
        } else {
            return n * printFact(n-1);
        }
    }

    static int usingIterative(int n){


        int product = 1;
        if(n == 0 || n == 1){
            return 1;
        } else {

            for(int i = 1; i<=n; i++){
                product *= i;

            }
            return product;
        }

    }
}
