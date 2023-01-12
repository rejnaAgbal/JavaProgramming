package day17_While_DoWhile;

import java.util.Locale;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {


        String sentence = "Cat Cat Cat Cat dog dog Cat Cat dog";
        sentence= sentence.toLowerCase();
        int countCat = 0;

        while(sentence.contains("Cat")){
            sentence = sentence.replaceFirst("Cat", "");
            countCat++;
        }


        System.out.println(countCat);
        System.out.println("---------------------");


        String s = "java java java python python python";

        int countJava = 0;
        int countPython = 0;

        while (s.contains("java") || s.contains("python")){
            if (s.contains("java")){
                s = s.replaceFirst("java","");
                countJava++;
            }

            if(s.contains("python")){
                s=s.replaceFirst("python","");
                countPython++;
            }
        }

        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);

        System.out.println("-------------------------------------------------");












    }
}
