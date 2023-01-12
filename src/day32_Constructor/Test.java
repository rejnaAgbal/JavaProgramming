package day32_Constructor;

public class Test {


    public Test(){ // output: A
        System.out.println("A");
    }


    public Test(int a){//output:A B
        this();
        System.out.println("B");
    }


    public Test(double a){//output: A B C
        this(10);
        System.out.println("C");
    }

    public Test(String str){ // output: A B C D
        this(2.5);
        System.out.println("D");
    }


    public static void main(String[] args) {

        Test test1 = new Test();
        System.out.println("-------------------");
        Test test2 = new Test(5);
        System.out.println("-------------------");
        Test test3 = new Test(4.6);
        System.out.println("---------------------");
        Test test4 = new Test("Java");
        System.out.println("----------------------");


    }







}
