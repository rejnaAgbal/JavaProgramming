package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {

    public static void main(String[] args) {


        Student student1 = new Student();

        student1.setInfo("Alparslan",'M',3,6237,'A');


        Student student2 = new Student();

        student2.setInfo("Aygun",'F',39,2210,'B');

        Student student3 = new Student();

        student3.setInfo("Mert",'M',24,2356,'C');


Student[] students = {student1,student2,student3};

for(Student student: students){
    System.out.println(student);
}

        System.out.println("------------------------------");

        ArrayList<Student> earlyBirds= new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for(Student student:students){

            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);










    }

}
