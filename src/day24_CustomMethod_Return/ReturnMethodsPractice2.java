package day24_CustomMethod_Return;

public class ReturnMethodsPractice2 {

    public static void main(String[] args) {

        // create a function that can calculate the grade
String str1 = grade(89);



        /*

        check the grade:
        'A' : Excellent
        b: great
        c: good
        d:
         */

 if(str1.equals("A")){
     System.out.println("Excellent");
 }else if(str1.equals("B")){
     System.out.println("Great");
 }else if(str1.equals("C")){
     System.out.println("Good");
 }else if(str1.equals("D")){
     System.out.println("Passed");
 }else{
     System.out.println("Failde.");
 }





    }

    public static String grade(int score){

        String result = "";

        if(score<0 || score > 100){

            result= "Invalid Score.";
        }else {
            result = (score >= 90)?"A":(score >= 80)?"B":(score >=70)?"C":(score >= 60)
                    ?"D":"F";
        }

        return result;

    }

}
