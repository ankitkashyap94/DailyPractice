package JavaCollections;

import Leaderboard.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(88);
        list.add(44);
        list.add(56);
        list.add(45);
        list.add(56);
        list.add(63);
        list.add(33);
        list.add(25);
        list.add(11);

//        System.out.println(list);
//        System.out.println("Getting frequency of 56 in list >> " + Collections.frequency(list, 56));
//        System.out.println(Collections.min(list));
//        System.out.println(Collections.max(list));
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);

        List<Student> stu = new ArrayList<>();
        stu.add(new Student(101, "Ankit"));
        stu.add(new Student(152, "Vaibhav"));
        stu.add(new Student(426, "Sakshi"));
        stu.add(new Student(201, "Esha"));
        stu.add(new Student(321, "Prerna"));
        stu.add(new Student(621, "Harry"));

        Student s1 = new Student(106, "Navyug");
        Student s2 = new Student(105, "Kalyug");

//        System.out.println(s1.compareTo(s2));
//        Collections.sort(stu);
        Collections.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(stu);



    }
}
