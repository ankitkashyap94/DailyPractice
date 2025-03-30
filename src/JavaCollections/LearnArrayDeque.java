package JavaCollections;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(25);
        adq.offerFirst(85);
        adq.offerFirst(45);
        adq.offerLast(89);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println("First ELement in queue >> " + adq.peekFirst());
        System.out.println("Last ELement in queue >> " + adq.peekLast());

        System.out.println("Removing Last Element in queue >> " + adq.pollLast());
        System.out.println(adq.peekFirst() + " " + adq.peekLast());
        System.out.println("Removing First Element in queue >> " + adq.pollFirst());
        System.out.println(adq.peekFirst() + " " + adq.peekLast());
        System.out.println(adq);






    }
}
