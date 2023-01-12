package day30_CustomClass;



import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {


     Car car1 = new Car();

car1.setInfo("Range Rover","Velar","Metalic gray",2020,120000);
System.out.println(car1);


        Car car2 = new Car();
car2.setInfo("Ford","Mondeo","Black",2002,5000);
        System.out.println(car2);


        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2));


for(Car each :carsList){
    System.out.println(each.brand+ " : "+ each.price);
}


        System.out.println("---------------------------------------------");

/*
Range : 2005-2008 ara eligable to recall
ford : 1995-1997
 */


        carsList.removeIf(p->p.brand.equals("Range rover")&& p.year>= 2005 && p.year<= 2008);


        carsList.removeIf(p->p.brand.equals("Ford")&& p.year>= 1995 && p.year<= 1997);




    }



}
