package JavaCollections;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<Integer> stk = new Stack<>();
        stk.add(15);
        stk.add(16);
        stk.add(17);
        stk.add(18);
        stk.add(19);
        stk.add(20);
        stk.add(21);

        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println("Removing >> " + stk.pop());
        System.out.println(stk.peek());



    }
}
