package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {



        // store elements : 10,20,50,70


        int[] number = {10,20,50,70};
        System.out.println(Arrays.toString(number));

        System.out.println("-----------------------------");

        // contain 5 scores


        int[] scores = new int[5];
        scores[0] =80 ;
        scores[1]= 85;
        scores[2]=88;
        scores [3]=90;
        scores[scores.length-1]=95;


        System.out.println("--------------------------");



        String[] months = {"January","February","March","April","May","June",
                "July","August","October","November","December"};

        for (int i = 0; i < months.length ; i++) {
            System.out.println(months[i]);
        }


        System.out.println("-------------------------");


        for(int i = months.length-1;i>= 0;i--){
            // i represent index numbers of array starting from last index

            System.out.println(months[i]);
        }












    }
}
