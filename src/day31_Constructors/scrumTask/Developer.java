package day31_Constructors.scrumTask;

public class Developer {


    public String name;
    public int employeeID;
    public String jobTitle;
    public int salary;

    public Developer(String name,int employeeID,String jobTitle,int salary) {
        this.name= name;
        this.employeeID = employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }


    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


    public void coding(){
        System.out.println(name + " is coding.");
    }


    public void unitTesting(){
        System.out.println(name+ " is unit testing.");
    }

    public void fixingBug(){
        System.out.println(name + "is fixing bug.");
    }







}
