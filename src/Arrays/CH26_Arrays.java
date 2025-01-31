package Arrays;

public class CH26_Arrays {
    public static void main(String[] args) {

        int[] arr = {8,5,4,6,2,1,7};

        for(int i = 0; i<=arr.length-1; i++){

            //System.out.println(arr[1]);

            for(int j=arr.length-1; j>=i; j--){

               // System.out.println(arr[j]);

                if(arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }

            }

        }

        printArr(arr);

    }

    public static void printArr(int[] arr){

        for(int i=0; i<=arr.length-1;i++){

            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }
}
