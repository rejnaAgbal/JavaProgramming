package day26_CustomMethodsPractice;

public class reverseArray {

// reverse the array ,returns a new array(int)
    public static int[] reverse(int []array) {
        int[] result = new int[array.length];
        int j = 0;

        for (int i = array.length-1; i>=0 ; i--) {

            result[j++]=array[i];

        }



   return result;


    }



    }
