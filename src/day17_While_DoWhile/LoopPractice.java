package day17_While_DoWhile;

public class LoopPractice {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }

        System.out.println("--------------------------");

         int j= 1;
         while (j<=10){
             System.out.println(j);
             j++;
         }

        System.out.println("---------------------------");


         int k = 1; // boolean dogru oldugu icin sonsuza kadar 1 print eder
         do{
             System.out.println(k);
         }while(k <= 10);





    }
}
