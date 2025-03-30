package Leaderboard;

import java.util.HashSet;
import java.util.Set;

public class StudentRecords {

    public static void main(String[] args) {

        Set<Student> student = new HashSet<>();

        student.add(new Student(101,"Ankit"));
        student.add(new Student(102,"Shivam"));
        student.add(new Student(103,"Anubhav"));
        student.add(new Student(104,"Sakshi"));

        Student s1 = new Student(106, "NewStudent");
        Student s2 = new Student(108, "NewStudent");

        System.out.println(s1.equals(s2));



        System.out.println(student);






    }
}
