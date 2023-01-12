package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class UniqueElements {

    public static int[] uniqueElements(int [] array){
        int [] result = {};// temporary

        for (int each : array) {

            if(ArraysUtility.freuquencyOfElement(array,each)==1){ // frequency is 1, the element is unique

               result=  ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }
}
