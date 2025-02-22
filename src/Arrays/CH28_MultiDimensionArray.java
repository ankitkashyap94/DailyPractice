package Arrays;

public class CH28_MultiDimensionArray {
    public static void main(String[] args) {

//        printing2DArr();

        int[][] arr1 = {{1, 4, 7},
                        {8, 2, 5},
                        {6, 9, 3}};
        int[][] arr2 = {{1, 4, 7},
                        {8, 2, 5},
                        {6, 9, 3}};

        sumOfArr(arr1, arr2);

        int[] result = new int[3];


//        shuffleArr(arr1);

    }


    static void printing2DArr(int[][] arr) {

        //int[][] arr = {{15,16,17},{18,19,20},{21,22,23}};
//        int[][] arr = new int[3][3];


        for (int i = 0; i <= arr.length - 1; i++) {
            {
                for (int j = 0; j <= arr[i].length - 1; j++) {
                    System.out.print((arr[i][j]) + " ");
                }
                System.out.println();
            }
        }

    }

    public static void shuffleArr(int[][] arr){

        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }


    }

    public static void sumOfArr(int[][] arr1, int[][] arr2) {

        int[][] result = new int[3][3];

        for (int i = 0; i < arr1.length && i < arr2.length; i++) { //No. of Rows

            for (int j = 0; j < arr1[i].length && j < arr2[i].length; j++) { //No. of Cols

                result[i][j] = arr1[i][j] + arr2[i][j];

            }

        }
        printing2DArr(result);
    }

}
