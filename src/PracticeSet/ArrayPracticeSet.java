package PracticeSet;

public class ArrayPracticeSet {
    public static void main(String[] args) {

//        prob1();
//
//        prob2(18.6f);
//
//        avgSum();

//        sum2DMat();

        ArrayPracticeSet pract = new ArrayPracticeSet();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        revArr(arr);
        findMax(arr);
        findMin(arr);
        pract.numericsSum(5,4,69,4,5,8,6,4,5,9,11,45,15,23,64,25,15,41);
    }

//    public static void prob1(){
//        //Problem 1
//        float[] marks = {15.4f, 16.2f, 18.6f, 67.8f, 99.3f, 100};
//        float sum = 0;
//        for(int i=0; i<= marks.length-1; i++){
//            sum += marks[i];
//        }
//        System.out.println("Total marks = " + sum);
//    }

//    public static void prob2(float givenNum){
//        //Problem 2
//        float[] marks = {15.4f, 16.2f, 18.6f, 67.8f, 99.3f, 100};
//        boolean isInArray = false;
//
//        for(float ele : marks){
//            if(ele == givenNum){
//                isInArray = true;
//                break;
//            }
//        }
//
//        if(isInArray){
//            System.out.println("Value present in array");
//        }else{
//            System.out.println("Value not present in array");
//        }
//    }

//    public static void avgSum(){
//        int[] marks = {18,15,66,25,88,89,45,62};
//        int sum = 0;
//        for(int ele : marks){
//            sum += ele;
//        }
//
//        System.out.println("the avg of marks = " + sum / marks.length);
//
//    }

//    public static void sum2DMat(){
//        int[][] mat1= {{15,56,84},
//                        {45,66,85}};
//        int[][] mat2= {{78,87,95},
//                        {63,56,42}};
//
//        int[][] sum = new int[2][3];
//
//        for(int i=0; i<= mat1.length-1; i++ ){
//            for(int j=0; j<= mat1[i].length-1; j++){
//                sum[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(sum[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }


    public static void revArr(int[] arr) {

        int temp = 0;
        int n = Math.floorDiv(arr.length, 2);

        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        printArr(arr);
    }

    public static void findMax(int[] arr) {

        int max = 0;

        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }

        System.out.println(max);
    }

    public void numericsSum(int... varArgs){

        int[] newArr = varArgs;

        int sum = 0;

        for(int ele : newArr){

            sum += ele;

        }
        System.out.println(sum);
        printArr(newArr);

    }

    public static void findMin(int[] arr) {

        int min = Integer.MAX_VALUE;



        for (int ele : arr) {

            if (ele < min) {

                min = ele;

            }

        }
        System.out.println(min);
    }

    public static void printArr(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

}
