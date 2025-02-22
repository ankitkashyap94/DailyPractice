package Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] arrNum = {7, 4, 8, 5, 1, 2, 5, 6, 9, 12, 14, 15, 3};
        sortArr(arrNum);

    }

    public static void printMissingArr(int[] arr) {

        for (int i = 1; i <= arr[arr.length - 1]; i++) {

            for(int j = 0; j<=arr.length-1; j++){

                if(arr[j] != i){

                    System.out.println("Missing number" + i);
                    i++;


                }

            }

        }
    }

    public static void sortArr(int[] arr) {

        for (int i = 0; i <= arr.length - 1; i++) {

            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArr(arr);

        printMissingArr(arr);

    }

    public static void printArr(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
