package day31_Constructors.scrumTask;

public class Tester {

    // name , employeeID,JobTitle,salary

    public String name;
    public int employeeID;
    public String jobTitle;
    public int salary;

    public Tester(String name,int employeeID,String jobTitle,int salary) {
        this.name= name;
        this.employeeID = employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }


    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


    public void smokeTesting(){
        System.out.println(name + "is smoke testing.");
    }

    public void creatingTicket(){
        System.out.println(name + "is creating ticket.");
    }








}

