package utilities;

import java.util.Arrays;

public class ArraysUtility {
    public static Object addElement;

    // prints each integer of an integer array in separate lines

    public static void printEach(int[] array) {
        for (int each : array) {

            System.out.println(each);

        }
    }

// prints each double of double array in sperates line

    public static void printEach(double[] array) {
        for (double each : array) {

            System.out.println(each);

        }
    }


//prints each char of char array in separate line


    public static void printEach(char[] array) {
        for (char each : array) {

            System.out.println(each);

        }
    }


    //prints each String of String array in separate lines
    public static void printEach(String[] array) {
        for (String each : array) {

            System.out.println(each);

        }
    }


    // returns the maximum number for integer array

    public static int max(int[] numbers) {

        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    public static double max(double[] numbers) {

        Arrays.sort(numbers);

        return numbers[numbers.length - 1];

    }


    // return the minimum number from integer array

    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

// return the minimum number from double array

    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


// check if the given integer is contained in the given array. returns boolean.contains

    public static boolean contains(int[] array, int element) {

        boolean result = false;

        for (int each : array) {
            if (each == element) {
                result = true;


            }
        }
        return result;
    }

    //check if the given double is contained in the given array. returns boolean.contains
    public static boolean contains(double[] array, double element) {

        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;


            }
        }
        return result;
    }


//check if the given String is contained in the given array. returns boolean.contains

    public static boolean contains(String[] array, String element) {

        boolean result = false;

        for (String each : array) {
            if (each == element) {
                result = true;


            }
        }
        return result;
    }


//check if the given char is contained in the given array. returns boolean.contains

    public static boolean contains(char[] array, char element) {

        boolean result = false;

        for (char each : array) {
            if (each == element) { // if any arrays element is matching with given element , it means the given elements is
                result = true;


            }
        }
        return result;
    }


    // return the freuquency of thr givrn rlrmrnt from the given array
    public static int freuquencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {

            if (each == (element)) {
                count++;
            }

        }
        return count;
    }


    public static int freuquencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {

            if (each == element) {
                count++;
            }

        }

        return (int) count;
    }


    public static int freuquencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {

            if (each == element) {
                count++;
            }

        }
        return count;
    }

    public static int freuquencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {

            if (each.equals(element)) {
                count++;
            }

        }
        return count;
    }


    //add element int
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0; // i : index of the new array

        for (int each : array) {

            result[i++] = each;

        }

        result[i] = element;

        return result;

    }

    // add element double
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0; // i : index of the new array

        // add element double
        for (double each : array) {

            result[i++] = each;

        }

        result[i] = element;

        return result;

    }


    // add char  // kisa yol command + r

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0; // i : index of the new array

        for (char each : array) {

            result[i++] = each;

        }

        result[i] = element;

        return result;

    }


// add string

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0; // i : index of the new array

        for (String each : array) {

            result[i++] = each;

        }

        result[i] = element;

        return result;

    }


    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};// temporary

        for (int each : array) {

            if (ArraysUtility.freuquencyOfElement(array, each) == 1) { // frequency is 1, the element is unique

                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }


    //double
    public static double[] uniqueElements(double[] array) {
        double[] result = {};// temporary

        for (double each : array) {

            if (ArraysUtility.freuquencyOfElement(array, each) == 1) { // frequency is 1, the element is unique

                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //  unique element char
    public static char[] uniqueElements(char[] array) {
        char[] result = {};// temporary

        for (char each : array) {

            if (ArraysUtility.freuquencyOfElement(array, each) == 1) { // frequency is 1, the element is unique

                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //unique element string
    public static String[] uniqueElements(String[] array) {
        String[] result = {};// temporary

        for (String each : array) {
            if (ArraysUtility.freuquencyOfElement(array, each) == 1) { // frequency is 1, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    // removes the index from the array,return new array (Double)
    public static double[] removeElement(double[] array, double index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }


            result[j++] = array[i];
        }

        return result;
    }

    // removes the index from the array,return new array (char)
    public static char[] removeElement(char[] array, char index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }


            result[j++] = array[i];
        }

        return result;
    }

    // removes the index from the array,return new array(String)
    public static String[] removeElement(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index) { // ifnthe index of array is matching with given index
                continue;// skip
            }


            result[j++] = array[i];
        }

        return result;
    }


    // merge the given 2 array and return the new array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};


        for (int each : arr1) {
            result = addElement(result, each);
        }
        for (int each : arr2) {
            result = addElement(result, each);
        }
        return result;
    }

    // merge the given 2 array and return the new array(double)
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};


        for (double each : arr1) {
            result = addElement(result, each);
        }
        for (double each : arr2) {
            result = addElement(result, each);
        }
        return result;
    }

    // merge the given 2 array and return the new array(char)
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};


        for (char each : arr1) {
            result = addElement(result, each);
        }
        for (char each : arr2) {
            result = addElement(result, each);
        }
        return result;
    }

    // merge the given 2 array and return the new array(String)
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};


        for (String each : arr1) {
            result = addElement(result, each);
        }
        for (String each : arr2) {
            result = addElement(result, each);
        }
        return result;
    }


    // reverse the array ,returns a new array(int)
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            result[j++] = array[i];

        }
        return result;
    }

    // reverse the array ,returns a new array(double)
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            result[j++] = array[i];

        }
        return result;
    }

    // reverse the array ,returns a new array(char)
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            result[j++] = array[i];

        }
        return result;
    }

    // reverse the array ,returns a new array(String)
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            result[j++] = array[i];

        }


        return result;


    }



// replce the element of the array at given index with the new element(int)
    public static int[] replace(int[]array,int index,int newElement){

        if(index<0||index>array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

//replce the element of the array at given index with the new element(doubel)
    public static double[] replace(double[]array,int index,double newElement){

        if(index<0||index>array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

// replce the element of the array at given index with the new element(char)
    public static char[] replace(char[]array,int index,char newElement){

        if(index<0||index>array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

// replce the element of the array at given index with the new element(String)
    public static String[] replace(String[]array,int index,String newElement){

        if(index<0||index>array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }


// replaces all the matching old values of the array with the new value

    public static int[] replaceAll(int[]array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[]array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[]array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[]array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }

    // removes the duplicates from the given array,return the new array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};


        for (int each : array) {

            if(!ArraysUtility.contains(result,each)){
                result =ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    // removes the duplicates from the given array,return the new array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};


        for (double each : array) {

            if(!ArraysUtility.contains(result,each)){
                result =ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    // removes the duplicates from the given array,return the new array
    public static char[] removeDuplicates(char[] array){
        char[] result = {};


        for (char each : array) {

            if(!ArraysUtility.contains(result,each)){
                result =ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }


    // removes the duplicates from the given array,return the new array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};


        for (String each : array) {

            if(!ArraysUtility.contains(result,each)){
                result =ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

}