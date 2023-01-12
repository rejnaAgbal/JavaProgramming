package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {


        char[] letters = new char[26];
       // letters[0]='A';
        //letters[1]='B';
// 2 variable : the first represented char(i) and the other index number(j)

        for (char i = 'A',j = 0;  i<= 'Z'&& j< letters.length; i++,j++) {
            letters[j]= i;


        }


            System.out.println(Arrays.toString(letters));


        System.out.println("----------------------------------------");


        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]= ch++;
        }

        System.out.println(Arrays.toString(letters));














    }
}
