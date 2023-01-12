package day16_While_DoWhile;

import java.util.Scanner;

public class Test_Palindrome {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Give a word please!");
        String word =scan.next();
        String reversed ="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);


            boolean isPalindrome = word.equalsIgnoreCase(reversed);


                System.out.println("The word is palindrome");








        }








    }
}
