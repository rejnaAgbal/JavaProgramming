package day24_CustomMethod_Return;

public class ReturnMethodPracctice4 {

    public static void main(String[] args) {


  String str = "cccccsssssseeeeeeerrrrrrrr";

  str = removeDuplicates(str);


        System.out.println(str);









    }

// can remove duplicated characters from a string and return the new value


    public static String removeDuplicates(String str){

String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);


            if(!result.contains(""+each)){

                result += each;
            }

        }

        return result;
    }



}
