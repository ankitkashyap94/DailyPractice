package Arrays;

    //{ Driver Code Starts
import java.io.*;
import java.util.*;

    class Find_Duplicate_Value_InArray {

        public static void main(String[] args) {
            int[] arr = {10, 25, 3, 50, 12, 25, 48, 3, 0, 19, 50, 42, 8, 3, 20, 25, 14, 47, 10, 6};

            //[] arr = {2,3,1,2,3};
            findDuplicates(arr);

        }
        public static void findDuplicates(int[] arr){

            List<Integer> duplicate = new ArrayList<>();

            Set<Integer> hs = new HashSet<>();

            for(int i = 0; i<=arr.length-1; i++){
                if(!hs.contains(arr[i])){
                    hs.add(i);
                }else{
                    duplicate.add(i);
                }
            }

            System.out.println(duplicate);


        }


    }


