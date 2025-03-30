package JavaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {

        //Use for Ordering

        Set<Integer> set = new LinkedHashSet<>();
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
