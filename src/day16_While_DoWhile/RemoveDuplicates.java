package day16_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {


        String str = "aabbaacc";

        String result = "";

        for (int i = 0; i <= str.length()-1 ; i++) {// i: represent index number of str
           // char ch = str.charAt(i); represented each character of str

            String ch =""+str.charAt(i);// "" ch convert to string

            if(!result.contains(ch)){

                result += ch;
            }

        }

        System.out.println(result);












    }
}
