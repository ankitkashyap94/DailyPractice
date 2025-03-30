package JavaCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(15);
        set.add(25);
        set.add(34);
        set.add(44);
        set.add(36);
        set.add(28);
        set.add(28);
        set.add(28);
        set.add(28);

        System.out.println(set);
        System.out.println(set.remove(28));
        System.out.println(set);
        System.out.println(set.contains(25));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
