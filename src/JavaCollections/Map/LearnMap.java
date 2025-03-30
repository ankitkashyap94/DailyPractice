package JavaCollections.Map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        //Use for Key,Value pair

        Map<Integer, String> data = new HashMap<>();

        data.put(101, "One");
        data.put(102, "Two");
        data.put(103, "Three");
        data.put(104, "Four");

//        System.out.println(data);

//        if(!data.containsKey(104)){
//            data.put(104, "New Four");
//        }
        System.out.println(data.putIfAbsent(104, "New Four"));

//        System.out.println(data);


//        for(Map.Entry<Integer,String> e: data.entrySet()){
//            System.out.println(e);
//            System.out.println(e.getKey() + " >> " + e.getValue());
//        }

        for(int num : data.keySet()){
            System.out.println(num);
        }

        for(String name :data.values()){
            System.out.println(name);
        }

        System.out.println(data.isEmpty());


    }
}
