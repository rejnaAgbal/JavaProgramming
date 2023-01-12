package day15_ForLoop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {



        int total = 0;
        Scanner scan = new Scanner (System.in);
        for (int i = 0; i< 5; i++ ){
            System.out.println("Enter a number: ");
             total += scan.nextInt();
        }

        scan.close();

        System.out.println("-------------------------");


      String str = "Wooden Spoon";

      String result = "";

      // index:    01234567891011



        for (int i = str.length()-1; i >= 0; i--){
            // i is index numbers of str(starting last index 0 )

            result += str.charAt(i);



        };

        System.out.println(result);















    }
}
