package day15_ForLoop;

import java.util.MissingFormatArgumentException;

public class Palindrome {
    public static void main(String[] args) {


        /*
        "Java " ==> "avaJ " not palindrome
        "Anna" ==> " annA" is palindrome ( reverse are same)

         */

        String word = "Level";
        String reversed = "";

        for (int i = word.length()-1; i >= 0 ; i--){
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("is Palindroem = " + isPalindrome);




    }
}
