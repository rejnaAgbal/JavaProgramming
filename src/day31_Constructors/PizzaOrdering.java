package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {

    public static void main(String[] args) {

       // create 100 pizza objects; sie-s,cheese topping 2,pepperoni topping 3
        // create 100 pizza objects.size -m , ch.to 3 , pe.to 4
        // create 100 pizza objects. sie -l , ch.to 4,pe.to 5


        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            Pizza smallPizza = new Pizza('S',2,3);
            Pizza mediumPizza = new Pizza('M',3,4);
            Pizza largePizza = new Pizza('L',4,5);

            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }


        System.out.println("Total number of pizzas = " + pizzas.size());
        
        double totalPrice = 0;

        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);













    }
}
