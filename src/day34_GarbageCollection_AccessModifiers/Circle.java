package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name= "Circle";

    public Circle(double radius){
        this.radius = radius;
        pi=3.14;
    }

    public static ArrayList<Integer> numbers ;


    static{
        pi = 3.14;
        name="Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }

}
