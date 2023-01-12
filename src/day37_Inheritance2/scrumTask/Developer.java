package day37_Inheritance2.scrumTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String jobTitle, int Id, double salary, String companyName) {
        super(name, age, gender, "Developer", Id, salary, companyName);
    }

public void fixBugs(){
    System.out.println(jobTitle+""+name +" is crying");
}
}
