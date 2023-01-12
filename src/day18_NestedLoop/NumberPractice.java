package day18_NestedLoop;

import java.util.Scanner;

public class NumberPractice {
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);


        while(true) {

            System.out.println("Enter a number: ");
            int n = scan.nextInt();

            if (n % 2 == 0) {
                System.out.println(n + "is Even number");
            } else {
                System.out.println(n + "is Odd number.");
            }

            System.out.println("Would you like to enter another number ?");
            String a = scan.next().toLowerCase();

            while(!(a.equals("yes")||a.equals("no"))) {
                System.out.println("Please re enter, would you like to enter another number?");
                 a = scan.next().toLowerCase();
            }


                if (a.equals("no")) {
                    break;
                }



        }















    }
}
