public class SwapNumbers {
    public static void main(String[] args) {
        swapWithoutUsingThirdVariable(5, 7);
        swapUsingThirdVariable(8, 11);

    }

    public static void swapWithoutUsingThirdVariable(int a, int b) {
        System.out.println("Values Before Swap --> " + a + " || " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after Swap --> " + a + " || " + b);
    }

    public static void swapUsingThirdVariable(int a, int b) {
        System.out.println("Values Before Swap --> " + a + " || " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Values after Swap --> " + a + " || " + b);
    }
}
