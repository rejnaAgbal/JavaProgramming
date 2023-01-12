package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {



        boolean a = false;

        for(int i =0;a;){ // false never executed
            System.out.println("Wooden Spoon");
        }


        System.out.println("----------------");
        while(a){
            System.out.println("Wooden Spoon"); // if false never executed
        }

        System.out.println("-------------------------");

        do{// at leat one time executed even the boolean is false
            System.out.println("wooden spoon");
        }while (a);
















    }
}
