package day15_ForLoop;

public class UniqueCharaters { // unique = is occur only 1 in a string
    public static void main(String[] args) {

        // input=AABCCD OUTPUT=BD

        String str = " AABCCD";
        String result = "";


       /*  char ch = 'A'
       if (str.indexOf(ch)== str.lastIndexOf(ch)){ if the first and last index numbers
       of the character are same , the character is unique
            result += ch;
            this is a method  for how find one character is unique in a string
        */

        for (int i = 0; i <= str.length()-1 ; i++) { // i : index numbers of str
            char ch = str.charAt(i);
            if (str.indexOf(ch)== str.lastIndexOf(ch)){
                result += ch;
            }


        }

        System.out.println(result);







    }
}
