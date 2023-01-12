package day18_NestedLoop;

import java.util.Scanner;

import java.util.Scanner;


public class LogIn {

    public static void main(String[] args) {

        // username:cydeo password: woodenspoon
        // attempts 3 . loggin print Logged in


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

       if(u.equals("Cydeo")&&
        p.equals("WoodenSpoon")){
           System.out.println("Logged in");
       }else{ int attempts = 3;
           for (int i = 1;i <= 3;i++) {
               System.out.println("Incorrect Username or Password");
               System.out.println("Enter your username :");
               u = scan.next();
               System.out.println("Enter your password:");
               p = scan.next();
               attempts--;

               if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                   System.out.println("Logged In");
                   break;

               }
           }

               if(!(u.equals("Cydeo")&& p.equals("WoodenSpoon"))){
                   System.err.println("Your account is locked. please contact support teeam.");


       }
       }

















       }
}
