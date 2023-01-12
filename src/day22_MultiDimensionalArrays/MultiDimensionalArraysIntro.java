package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {
    public static void main(String[] args) {

        String [] group1= {"Jon","Joes","James"};
        String [] group2 = {"Jon","Joes","James"};
        String [] group3 = {"Jon","Joes","James"};

        String [] [] groups = new String [3][]; // index 0,1,2
        groups[0] = group1;
        groups [1]= group2;
        groups [2]= group3;


        System.out.println(Arrays.deepToString(groups));

        System.out.println("--------------------------------");


        // index of the elements :   0 1 2      0 1 2 3         0 1 2 3 4

        int [] [] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //index of arrays:  0         1           2


        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][3]);


















    }
}
