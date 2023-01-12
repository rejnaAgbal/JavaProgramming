package day36_Inheritance.animalTask;

public class Zoo{

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setInfo("Max","Husky",'M',2,"Small","Brown");
dog.eat();
dog.drink();
dog.sleep();
dog.move();
dog.bark();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Boncuk","British",'F',1,"Small","White");
cat.eat();
cat.sleep();
cat.drink();
cat.move();
cat.meow();
cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher khan","Bengal",'M',4,"Large","Red");
tiger.eat();
tiger.drink();
tiger.sleep();
tiger.move();
tiger.move();
tiger.hunt();
tiger.roar();


        System.out.println(tiger);



    }
}
