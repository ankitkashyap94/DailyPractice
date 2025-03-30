package JavaCollections;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {

        Queue<Integer> qu = new LinkedList<>();

        qu.offer(12);
        qu.offer(15);
        qu.offer(21);
        qu.offer(32);
        qu.offer(455);
        qu.offer(451);
        qu.offer(652);
        qu.offer(851);

        System.out.println(qu);
        System.out.println(qu.peek());
        System.out.println("Removing from Queue >> "+ qu.poll());
        System.out.println(qu.peek());


    }
}
