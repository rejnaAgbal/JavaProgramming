package day25_CusomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {



int sum = sumOf2Numbers(3,7);
        System.out.println(sum);


        System.out.println("--------------------------");

        int sum2 = sumOf3Numbers(10,89,90);
        System.out.println(sum2);

        System.out.println("------------------------------");


int sum3 = sumOf4Numbers(45,67,23,89);
        System.out.println(sum3);

    }

    // creat a method that can find the sum of 2 numbers

    public static int sumOf2Numbers(int num1,int num2){
        return num1 + num2;

    }

// sum of 3 number

    public static int sumOf3Numbers(int num1,int num2,int num3){
        return num1 + num2 + num3;
    }

// sum of 4 numbers


    public static int sumOf4Numbers(int num1,int num2, int num3, int num4){
        return  num1 + num2 + num3 + num4;
    }

}
