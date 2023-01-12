package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Age:");
        int age = scan.nextInt(); // valid age 1-120


     while(!(age >=1 && age <= 120 ) ){
            System.err.println("Invalid entry, please re-enter");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes/on");
     String answer = scan.next().toLowerCase();

     while (!(answer.equals("yes")||(answer.equals("no")))){
         System.out.println("invalid Entry, please try-again.");
     }

     if(age >=18 && answer.equals("yes")){
         System.out.println("you are eligible to vote");
     }else {
         System.out.println("your are not eligible to vote");
     }
























    }
}
