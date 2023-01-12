package day37_Inheritance2.scrumTask;

public class Employee extends Person{



    public String jobTitle;
public int Id;
public double salary;
public String companyName;
    public int id;

    public Employee(String name, int age, char gender, String jobTitle,int Id,double salary,String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.Id=Id;
        this.salary=salary;
        this.companyName=companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }



    @Override
    public String toString() {
        return " Employee{" +
                " jobTitle='" + jobTitle + '\'' +
                ", Id=" + Id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                "} " + super.toString();
    }
    //all 7 methods must be toString
}
