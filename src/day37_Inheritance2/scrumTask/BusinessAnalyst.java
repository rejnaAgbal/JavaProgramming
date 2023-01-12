package day37_Inheritance2.scrumTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, String jobTitle, int Id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", Id, salary, companyName);
    }

    public void analyz(){
        System.out.println(jobTitle+" "+name +" is analyzing");
    }
}
