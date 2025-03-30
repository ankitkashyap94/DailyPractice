package JavaCollections;

import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ankit");
        names.add("Ankit2");
        names.add("Ankit3");
        names.add(2, "New York");

//        System.out.println(names);
//
//        System.out.println(names.get(2));
//        names.set(2,"New Valie");


//        names.remove(3);
//        names.remove(String.valueOf("Ankit"));

//        System.out.println(names);
//        System.out.println(names.contains("Ankit55"));

//        for(String name : names){
//            System.out.println(name);
//        }
//
//        for(int i=0; i<=names.size()-1; i++){
//            System.out.println("This is for loop >> " + names.get(i));
//        }
//
//        Iterator<String> it = names.iterator();
//
//        while(it.hasNext()){
//            System.out.println("Using Iterator >> " + it.next());
//        }


        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("horse");
        animals.push("cat");
        animals.push("dog");

        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());


        Queue<Integer> qu = new LinkedList<>();

        qu.offer(15);








    }
}
