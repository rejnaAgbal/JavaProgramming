package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterviewQ {
    public static void main(String[] args) {


        // write a program that can return thr nth largest number from an arrayList


/*
arrayList = {1,2,3,4,5,6,7,7,8,8}
n= 5
 ouput: 4
 */

        ArrayList<Integer> list = new ArrayList<> ();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n = 5;

        for (int i = 1; i <n ; i++) {
            list.removeIf(p -> Collections.max(list)== p);
        }

        int max = Collections.max(list);


        System.out.println(max);














    }
}
