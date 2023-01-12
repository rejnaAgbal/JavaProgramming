package day35_OOP_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;


    public Employee(String name, char gender, int age, double salary){
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender=gender;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;

    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }
}
