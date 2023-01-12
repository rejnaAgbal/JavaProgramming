package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {


        // username : " cydeo" , password : "cydeo123"


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your Name:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();


        if(u.equals("Cydeo")|| p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempt = 3;

            while(!(u.equals("Cydeo")&& p.equals("Cydeo123"))&& attempt >0){
                if(attempt == 1){
                    System.out.println("This is your last chance.");
                }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempt--;
            }
            if (u.equals("Cydeo")&& p.equals("Cydeo123")){
                System.out.println("Logged In");
            }else {
                System.out.println("your account is locked.");
            }




        }





scan.close();











    }
}
