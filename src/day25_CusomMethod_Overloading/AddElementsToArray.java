package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

      arr = addInteger(arr,5);

        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------");

        double [] arr2 = {1.5,2.5,3.5,4.5};
        arr2 = addDouble(arr2,5.5);
        System.out.println(Arrays.toString(arr2));


        System.out.println("---------------------------------");


        String [] names = {"ali ","rana","alp","muro"};

        names = addString(names,"Regina");

        System.out.println(Arrays.toString(names));


        System.out.println("----------------------------------------");


        char [] chars = {'A','B','C','D'};

        chars=addChar(chars,'E');

        System.out.println(Arrays.toString(chars));


        System.out.println("-------------------------");











    }

    // a return method called addInteger that can  add an integer after the last index of an integer array
    // {1,2,3,4}, 5 =======>   new array {1,2,3,4,5}


    public static  int[] addInteger(int [] array, int element){
        int [] result = new int [array.length + 1];

        int i = 0; // i : index of the new array

        for (int each : array) {

            result [i++] = each;

        }

        result[i]= element;

        return result;

    }


    public static double[] addDouble(double [] array, double element){
        double [] result = new double [array.length + 1];

        int i = 0; // i : index of the new array

        for (double each : array) {

            result [i++] = each;

        }

        result[i]= element;

        return result;

    }





// add string

    public static  String[] addString(String [] array, String element){
        String [] result = new String [array.length + 1];

        int i = 0; // i : index of the new array

        for (String each : array) {

            result [i++] = each;

        }

        result[i]= element;

        return result;

    }
    
    
    // add char  // kisa yol command + r

    public static  char[] addChar(char [] array, char element){
        char [] result = new char [array.length + 1];

        int i = 0; // i : index of the new array

        for (char each : array) {

            result [i++] = each;

        }

        result[i]= element;

        return result;

    }





}
