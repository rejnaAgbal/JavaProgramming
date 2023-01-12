package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {



        String str= "123"; // can convert to integer

       int num =  Integer.parseInt(str);  // int

        System.out.println(num + 1); //124
        System.out.println(str + 1);//1231 concaiting

        String str2 = "110.5";

        double num2 = Double.parseDouble(str2);

        System.out.println(num2 + 1);


        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min= "+ min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = "+ max2);
        System.out.println("Min 2= "+ min2);

        System.out.println("--------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        System.out.println(x);

        System.out.println("-----------------------------------");


        char ch1 = '0';

       boolean r2 = Character.isDigit(ch1);
        System.out.println(r2);


        boolean r3 = Character.isLetter(ch1);
        System.out.println(r3);

        char ch2 = '!'; // special character
        boolean r4 = !Character.isLetterOrDigit(ch2);
        System.out.println(r4);

        // uppercase
        char ch3 = 'A';
        boolean r5 = Character.isUpperCase(ch3);
        boolean r6 = Character.isLowerCase(ch3);

        System.out.println(r5);
        System.out.println(r6);


        System.out.println("------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }

        }


        System.out.println("sum = " + sum);




    }
}
