package PracticeSet;

import java.sql.SQLOutput;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = {57, 22, 45, 13, 12, 24, 14, 11};
        int temp;
        ConvertOddsToZero(arr);

        System.out.println();
//        for (int i = 0; i <= arr.length - 1; i++) {
//            if (arr[i] % 2 == 0) {
//                ++i;
//            } else {
//                temp = arr[i];
//                for (int j = arr.length - 1; j >= 0; j--) {
//
//                    if (arr[j] % 2 == 0) {
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//
//                        --j;
//
//                        break;
//                    }
//                }
//            }
//        }
//
//
//        printArr(arr);


    }

    public static void ConvertOddsToZero(int[] numArr) {

            int temp;
            int pointer = 0;
        int pointerLastIndex = numArr.length;

            for(int i=0; i<=numArr.length-1; i++){
            if(numArr[i] % 2 != 0){
                numArr[i] = 0;
                numArr[pointerLastIndex] = numArr[i] ;

                i--;
            }else{
                i++;
            }
        }

        printArr(numArr);

    }

    public static void printArr(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
