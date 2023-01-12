package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {



int[] nums = {1,2,3,4,5};

        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);

        System.out.println("-------------------------------------");


        int [] scores = {95,100,55,65,85,78};

        Arrays.sort(scores); //
        System.out.println(Arrays.toString(scores));

        System.out.println("Max Scores:"+ scores[scores.length-1]);


            System.out.println("------------------------------------");

            int []  arr1 = {1,2,3};
            int [] arr2 = {1,2,3};

            boolean r1 = Arrays.equals(arr1,arr2);

            System.out.println(r1);

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean r2 = Arrays.equals(arr1,arr2);

            System.out.println(r2);

















    }


}
