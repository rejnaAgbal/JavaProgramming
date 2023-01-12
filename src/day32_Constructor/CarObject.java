package day32_Constructor;

public class CarObject {
    public static void main(String[] args) {



        Car car1 = new Car("Range Rover");

        Car car2 = new Car("Range Rover","Velar");

        Car car3 = new Car("Range rover","Velar",2020);

        Car car4 = new Car("Range rover","Velar",2020,120000);

        Car car5 = new Car("Range rover","Velar",2020,120000,"Metalic gray");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);














    }
}
