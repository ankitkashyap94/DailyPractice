package Patterns;

public class printFactorial {
    public static void main(String[] args) {

        int n = 6;
        int i = 1;
        int fact = 1;
        while (i<=n){
            System.out.println(i);
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
