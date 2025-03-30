package JavaCollections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {


        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());


        pq.offer(16);
        pq.offer(118);
        pq.offer(1545);
        pq.offer(1155);
        pq.offer(165);
        pq.offer(15);
        pq.offer(1789);
        pq.offer(1532);
        pq.offer(145);
        pq.offer(1154);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println("Removing >> " + pq.poll());
        System.out.println(pq.peek());

    }
}
