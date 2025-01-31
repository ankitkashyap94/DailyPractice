public class Practice {
    public static void main(String[] args) {

        int a = 18;
        a += 10;
        System.out.println(a);
        System.out.println(64>5 || 64>98);

        float sum = 7/4.0f * 9/2.0f;
        System.out.println(sum);

        char grade = 'A';
        grade = (char)(grade +8);
        System.out.println(grade);

        grade = (char)(grade -8);
        System.out.println(grade);

        int v = 20;
        int u = 10;
        int as = 20;
        int s = 15;

        float res = (float)(v*v - u*u)/(2*as*s);
        System.out.println(res);

        String name = new String("Ankit");
        System.out.println(name +" !"+ " How are you doing ?");

        System.out.printf("My name is %s and the value of a = %d and the value of b = %f", name, v, res);
        System.out.println();
        char[] nameArr = name.toLowerCase().toCharArray();
        for(int i = nameArr.length-1; i>=0; i--){
            System.out.println(nameArr[i]);

        }

    }
}
