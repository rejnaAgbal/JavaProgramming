package day20_Arrays;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {

        // Z-A

     char [] alphabets = new char [26];

    /* alphabets[0]= 'Z';
     alphabets[1] = 'Y';


     */



     char ch = 'Z';

        for (int i = 0; i < alphabets.length; i++,ch--) {
            alphabets[i]=ch;

        }

        System.out.println(Arrays.toString(alphabets));


        System.out.println("------------------------");



        for (char  i = 0, j = 'Z'; i<alphabets.length;i++,j--){
            alphabets[i]=j;
        }

        System.out.println(Arrays.toString(alphabets));



















    }
}
