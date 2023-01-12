package day37_Inheritance2.scrumTask;

public class Person {

    public String name;
    public int age;
    public char gender;

    public Person(String name, int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void eat(String food){
        System.out.println(name + " is eating"+food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking"+drink);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
