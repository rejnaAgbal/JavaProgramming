package day37_Inheritance2.scrumTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, String jobTitle, int Id, double salary, String companyName) {
        super(name, age, gender,"Product Owner", Id, salary, companyName);
    }
}
