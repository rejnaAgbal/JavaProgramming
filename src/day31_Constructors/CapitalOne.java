package day31_Constructors;

public class CapitalOne{

    public static void main(String[] args) {


BankAccount account1= new BankAccount();

account1.setInfo("Ahmet Ozkok",1234567854);

        System.out.println(account1);


account1.deposit(1000);

account1.checkBalance();

account1.withdraw(900);

account1.checkBalance();















    }
}
