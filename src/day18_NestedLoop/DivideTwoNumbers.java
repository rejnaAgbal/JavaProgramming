package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {


        // write a program can divide 2 positive numbers without using / * operators

         int a = 30;
         int b= 7;
         int count = 0;


        while(a>=b) {
            a-= b;
            count++;

        }
        System.out.println(count + " with a remainder of "+a);













    }
}
