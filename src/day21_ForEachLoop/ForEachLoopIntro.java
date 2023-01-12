package day21_ForEachLoop;

import jdk.swing.interop.SwingInterOpUtils;

public class ForEachLoopIntro {
   
   
    public static void main(String[] args) {
        
        int [ ] numbers = {10,20,30,40,50,60};

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers);
            
        }
    
    


        System.out.println("----------------------------------");

        for( int each:numbers){
            System.out.println(each);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
