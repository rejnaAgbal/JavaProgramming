package day16_While_DoWhile;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {


        String str = "Cydeo12345School!@WoodenSpoon";
        String digits ="";
        String letters = "";
        String specialCharacters="";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);// each character that we have in str

            if (ch>= '0'&& ch<= '9') {
                digits += ch;
            }else if(ch>='a' && ch<= 'z'){
                letters += ch;
            }else if(ch>='A' && ch<= 'Z'){
                letters += ch;
            }else{
                if(ch != ' '){
                specialCharacters += ch;}
            }


        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCharacters = " + specialCharacters);
















    }
}
