package day17_While_DoWhile;

public class FreuquencyOfCharacter {
    public static void main(String[] args) {


        String str = "AAABBBC";

        char ch = 'A';

        int frequency = 0;//+1,+1,+1==>3

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            // 'A'=='A'
            if (ch == eachChar) {//if given char is matching with the eachChar,then ch is appeared in the string}
                frequency++;
            }
        }

        System.out.println(frequency);

















    }
}
