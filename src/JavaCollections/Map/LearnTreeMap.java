package JavaCollections.Map;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {

        //keys in sorted order

        Map<Integer, String> data = new TreeMap<>();

        data.put(105, "One");
        data.put(101, "Two");
        data.put(104, "Three");
        data.put(106, "Four");

        System.out.println(data);

        System.out.println(data.remove(104));
        System.out.println(data);



    }
}
