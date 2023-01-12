package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {


        // create a vairable that is capable enough to contain 5 names


    String[] myGroup = new String[5];
    myGroup[0]= "Gunay";
    myGroup[1]= "neira";
    myGroup[2] = "suat";
    myGroup[3]= "mikael";
    myGroup[4]= "Muhtar";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-----------------------------");



       String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Sunday","Saturday"};
        // INDEX           0        1         2          3          4       5        6
        System.out.println(Arrays.toString(days));


        int number = 5;

        if(number<1 || number>7){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println("Today day is: " + days[number-1]);





















    }
}
