package day26_CustomMethodsPractice;

public class FrequencyOfElement {










    // return the freuquency of thr givrn rlrmrnt from the given array
    public static int freuquencyOfElement(int [] array, int element){
        int count = 0;
        for (int each : array) {

            if(each== element){
                count++;
            }

        }
        return count;
    }


    public static int freuquencyOfElement(double [] array, double element){
        double count = 0;
        for (double each : array) {

            if(each== element){
                count++;
            }

        }

        return (int) count;
    }


    public static int freuquencyOfElement(char [] array, char element){
        char count = 0;
        for (char each : array) {

            if(each== element){
                count++;
            }

        }
        return count;
    }


    public static int freuquencyOfElement(String [] array, String element){
        int count = 0;
        for (String each : array) {

            if(each.equals( element)){
                count++;
            }

        }
        return count;
    }





}
