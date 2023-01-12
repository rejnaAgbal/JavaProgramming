package day35_OOP_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;


    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

     static{
        schoolName = "Cydeo";
        programmingLanguage ="JAVA";
        secretCode ="WOODEN SPOON";

}


public static void printSchoolName(){
    System.out.println("School is "+ schoolName);
}

public static void printProgrammingLanguage(){
    System.out.println("Language is "+ programmingLanguage);

  // public static void printSecretCode(){
        System.out.println("Code is "+ secretCode);
    }


}



