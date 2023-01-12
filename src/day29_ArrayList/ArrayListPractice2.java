package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {


        ArrayList<String> employees = new ArrayList<>();

        // kepp ahmet and david only

        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron"
        ,"Ahmed","David"));

        employees.retainAll(Arrays.asList("Ahmed","David"));

        System.out.println(employees);


















    }
}
