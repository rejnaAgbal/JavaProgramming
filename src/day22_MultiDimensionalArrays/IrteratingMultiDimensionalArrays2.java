package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class IrteratingMultiDimensionalArrays2 {

    public static void main(String[] args) {


        /*
         task 9 10 11 12 13
         4 5 6 7 8
         1 2 3
         */

        int arr2D [][] = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for(int i = arr2D.length-1;i >= 0; i--){ // i: index number of 1D arrays


            for(int j= 0;j<arr2D[i].length;j++){ // j: index number of elements starting from 0
                System.out.print(arr2D[i][j]+ " ");


            }
            System.out.println();
        }

        System.out.println("-------------------------------------");

        /*
        3 2 1
        8 7 6 5 4
        13 12 11 10 9
         */


        for (int i = 0; i < arr2D.length; i++) {


            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.print( arr2D[i][j]+ " ");

            }

            System.out.println();
        }



















    }
}
