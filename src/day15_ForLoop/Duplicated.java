package day15_ForLoop;

public class Duplicated {
    public static void main(String[] args) {


    /*
    input AABBCCBC output = ABC
     */


        String str = "AABBCCBC";
        String result = ""; // abc

//  i <= 7 ==> i<8
        for (int i = 0; i <= str.length()-1; i++) { // i represents the all index number of str

            String ch = ""+str.charAt(i); // ch : each character of st


            if (!result.contains(ch)) { // if the ch is not contained in the result
                result += ch ;
            }
        }
        System.out.println(result);

    }




}
