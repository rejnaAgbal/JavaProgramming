package day24_CustomMethod_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {



        String str = "java";



    }



    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);

        }

        return reverse;
    }
}
