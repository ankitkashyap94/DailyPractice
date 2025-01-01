import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {

        int[] arr = {12, 15, 9, 88, 16};

       Arrays.sort(arr);

       String arrStr = Arrays.toString(arr);
        System.out.println(arrStr);
       display(arr);

        //sortArray(arr);


    }

    public static void sortArray(int[] arr) {

        int arrLen = arr.length;
        System.out.print("Array before sorted --> ");
        display(arr);

        for (int i = 0; i < arrLen; i++) {

            for (int j = i + 1; j < arrLen; j++) {

                if(arr[i] > arr[j]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }

        System.out.print("Array after sorted --> ");
        display(arr);

    }

    public static void display(int[] arr){

        for(int ary : arr){
            System.out.print(ary + " ");
        }
        System.out.println();
    }


}
