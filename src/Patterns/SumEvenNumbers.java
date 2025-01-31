package Patterns;

public class SumEvenNumbers {
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        for(int i=0; i<n; i++){
            System.out.println(2*i);

            sum = sum + (2*i);

        }

        System.out.println("--> "+sum);
    }
}
