public class FabonacciSeries {
    public static void main(String[] args) {
        //fab(10);
        int count = 10;
        for (int i = 0; i < count; i++) {
            System.out.print(fabUsingRecurssion(i) + " ");
        }
    }

    public static void fab(int count) {

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b);

        for (int i = 2; i < count; i++) {

            int c = a + b;
            System.out.print(" " + c);

            int temp = a;
            a = b;
            b = c;
        }
    }

    public static int fabUsingRecurssion(int n) {

        if (n <= 1) {
            return n;
        }

        int fib = fabUsingRecurssion(n - 1) + fabUsingRecurssion(n - 2);

        return fib;
    }
}
