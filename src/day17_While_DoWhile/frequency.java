package day17_While_DoWhile;

public class frequency {
    public static void main(String[] args) {
        // write a code can return the frequency of the word . output is 3

        String str = "JavaJavaJava";
//                    0123
        int frequency = 0;



        for (int i = 0; i < str.length()-3; i++) {
            String eachSub = str.substring(i, i + 4); // java 4 karakter


            if (eachSub.equals("Java")) {
                frequency++;

            }

        }


        System.out.println(frequency);









    }

}

