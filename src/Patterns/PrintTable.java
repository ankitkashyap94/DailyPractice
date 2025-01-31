package Patterns;

public class PrintTable {

    public static void main(String[] args) {
        int tableOf = 10;
        printTable(tableOf);
        reverseTable(tableOf);


    }

    public static void printTable(int tableOf){
        for(int i=1; i<=10; i++){
            System.out.print(tableOf + " x " + i + " = " + tableOf*i );
            System.out.println();
        }
    }

    public static void reverseTable(int n){
        for(int i = 10; i>=1; i--){
            System.out.print(n +" x "+ i+" = "+ n*i);
            System.out.println();
        }

    }
}
