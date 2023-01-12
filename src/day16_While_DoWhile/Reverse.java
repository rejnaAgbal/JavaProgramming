package day16_While_DoWhile;

public class Reverse {
    public static void main(String[] args) {


        String str = "Wooden Spoon";

        String result = "";

        /*result += str.charAt(11); bu reverse yönteminin uzun yolu
        result += str.charAt(10);
        System.out.println(result);*/


        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);// adding each character to result

        }


        System.out.println(result);












    }
}
