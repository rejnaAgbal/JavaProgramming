package day15_ForLoop;

public class DigitsLettersSpercialChar {
    public static void main(String[] args) {

        String str = "Cydeo12345School!#@$%WoodenSpoon";

        // 12345 digits
        // CydeoSchoolWoodenSpoon
        //!#L%$

        String digits = "";
        String letters = "";
        String specialCharacters = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') { // ch : means character in this string
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else { // if (ch != ' '){
                specialCharacters += ch;
            }

        }


        System.out.println("specialCharacters = " + specialCharacters);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);


    }
}

    

    