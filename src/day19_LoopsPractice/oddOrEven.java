package day19_LoopsPractice;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

       while(true) {
           System.out.println("Enter a number:");
           int num = scan.nextInt();

           if (num % 2 == 0) {
               System.out.println("Even Number.");
           } else {
               System.out.println("Odd Number.");
           }


           System.out.println("Would you like to enter another number?");
           String a = scan.next();

           if(!(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("no"))){
               System.exit(0);
           }

           if (a.equalsIgnoreCase("no")){
               System.out.println("Thank you for u using us!");
               break;
           }


       }















    }
}
