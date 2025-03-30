package Leaderboard;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {

    public String name;
    int roll_no;

    public Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll_no == student.roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll_no);
    }


    @Override
    public int compareTo(Student that) {
        return this.roll_no - that.roll_no;
    }
}
