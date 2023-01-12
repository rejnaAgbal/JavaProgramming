package day17_While_DoWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {


        //

        String str ="AABBCC";
        String result =""; // ABC


        for (int i = 0; i < str.length()-1; i++) {
            String ch = "" + str.charAt(i);
            if(result.contains(ch)){// if the result already contains character
                continue;// skip
            }
            result += ch;
        }

        System.out.println(result);

        System.out.println("------------------------------");


















    }
}
