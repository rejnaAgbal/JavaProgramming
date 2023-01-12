package day37_Inheritance2.scrumTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String jobTitle,int Id, double salary,String companyName) {
        super(name, age, gender, "Tester",Id, salary, companyName);


    }


    public void createTicket(){
        System.out.println(jobTitle+" "+name +" is creating ticket");
    }



}
