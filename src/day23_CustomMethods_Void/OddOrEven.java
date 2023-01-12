package day23_CustomMethods_Void;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {


oddOrEven(107);
age(1989);

    }


    // creat a function that can check if a number is odd number or even number


    public static void oddOrEven(int number){

        if(number%2 == 0){
            System.out.println(number + " is Even number.");
        }else{
            System.out.println(number + " is Odd number.");
        }


    }

// creat a function that can display the age of person


    public static void age(int Birthyear){

        int age = 2022 - Birthyear;

        System.out.println("Your age is : " + age);
    }


    










}
