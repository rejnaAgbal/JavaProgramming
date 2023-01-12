package day20_Arrays;

import java.util.Arrays;

public class MaxNumberOfArrays {

    public static void main(String[] args) {



        int [] numbers = {10,5,4,20,1,0};

        int max = numbers[0];// 10

//numbers.fori shortcut         //numbers.forr shortcut for revese order

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]> max){
                max = numbers[i];
            }

        }

        System.out.println(max);





















    }
}
