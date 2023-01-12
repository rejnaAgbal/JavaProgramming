package day37_Inheritance2.scrumTask;

public class ScrumMaster extends Employee{


    public ScrumMaster(String name, int age, char gender, String jobTitle, int Id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", Id, salary, companyName);
    }
}
