package day24_CustomMethod_Return;

public class ReturnStatement {

    public static void nameOfDay(int number) {


        if(number< 1 || number >7){
            System.out.println("Invalid number.");
            return;
        }



            String result= (number == 1) ? "Monday" : (number == 2) ? "Teusday"
                    : (number == 3) ? "Wednsday" : (number == 4) ? "Thursday" :
                    (number == 5) ? "Friday" : (number== 6) ? "Sunday" : "Saturday";

        System.out.println("The name of Day is : "+ result);












    }


    public static void main(String[] args) {

        nameOfDay(8);
    }



}
