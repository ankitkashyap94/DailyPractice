package PracticeSet;

import org.w3c.dom.ls.LSOutput;

public class Encapsulate {

    public static void main(String[] args) {
        EncapsulateSet object = new EncapsulateSet("Ankit", 30);
        System.out.println(object.getName()+" "+object.getAge());

        object.setName("Meera");
        object.setAge(25);

        System.out.println(object.getName()+" "+ object.getAge());
    }


}

class EncapsulateSet{
    private String name;
    private int age;


    public EncapsulateSet(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }
}
