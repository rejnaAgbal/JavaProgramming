package day37_Inheritance2.phoneTask;

public class phone {


    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery = true;


    public phone(String brand,String model,String size, double price,String color) {
        this.brand = brand;
        this.model=model;
        this.size=size;
        this.price=price;
        this.color=color;
    }
public void call(long phoneNumber){
    System.out.println(brand + " " + model + " is calling" +phoneNumber);
}

public void text(long phoneNumber){
    System.out.println(brand + " "+ model+" is texting"+phoneNumber);
}
    @Override
    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';
    }
}


