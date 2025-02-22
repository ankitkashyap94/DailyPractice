package PracticeSet;

public class MethodOverloading {
    public static void main(String[] args) {
        int[] marks = {42, 15, 45, 62, 48, 69};
        String[] names = {"Ankit", "Naveel", "Anirudh", "Arjun"};

        // Changing integer
        int a = 58;
        change(a);
        System.out.println(a);

        //changing Array
        change(marks);
        System.out.println(marks[0]);

        change(names);
        System.out.println(names[0]);

    }

    static void change(String[] name) {
        name[0] = "akjdnaknasd";
        System.out.println(name[0]);
    }


    static void change(int a) {
        a = 98;
    }

    //Using varArgs
    static void change(int... arr) {
        arr[0] = 98;
    }
}


