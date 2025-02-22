public class Palindrome {
    public static void main(String[] args) {

        int num = 11211;

        int len = String.valueOf(num).length();
        int temp = num;
        int rev = 0;


        while (num != 0) {

            int digit = num % 10; //extract last digit from number;
            rev = rev * 10 + digit; //append digit to reverse.
            num = num / 10; //remove last digit from number;


        }

        System.out.println(rev);

        if (rev == temp) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("number is not a palindrome");
        }


    }
}
