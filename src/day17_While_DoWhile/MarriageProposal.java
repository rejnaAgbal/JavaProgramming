package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {


        // askin will you marry me ?
        // if yes output congrats. if no goodbye . neither yes or no invalid answer

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me ? yes/no");

        String a = scan.next().toLowerCase();

        while(!(a.equals("yes"))&&(a.equals("no") )){
            System.out.println("Invalid answer. please try again.");
            a=scan.next().toLowerCase();
        }
        if(a.equals("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }





















    }
}
