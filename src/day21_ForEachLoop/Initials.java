package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {


        String [] names = {"Ernie hans","Elminur Ablimit","hukya kilic"," Sinem kaya","Begench Begenjov" };


        for(String each : names){
            String initial =each.charAt(0)+ "."+ each.charAt( each.indexOf(" ")+1);

            System.out.println(initial);
        }

        /*

        for(String each : names){ // each representing every single name
        String reversed = "";

        for(int i = each.lenght-1; i >= 0; i--){
        reversed += each.charAt(i)}

        System.out.println(reversed);
         */














    }
}
