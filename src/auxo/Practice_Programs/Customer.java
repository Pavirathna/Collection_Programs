package auxo.Practice_Programs;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

class Main {
    public static void main(String[] args) {
        Customer customer = new Customer ( "PAVI", 77.75 );
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance ( 12.8 );
        System.out.println ( "Balance for customer " + customer.getName () + " is " + customer.getBalance () );
        ArrayList<Integer> intList = new ArrayList<> ();
        intList.add ( 1 );
        intList.add ( 3 );
        intList.add ( 4 );
        for (int i = 0; i < intList.size (); i++) {
            System.out.println ( i + " : " + intList.get ( i ) );
        }
        intList.add ( 2, 22 );
        for (int i = 0; i < intList.size (); i++) {
            System.out.println ( i + " : " + intList.get ( i ) );
        }
    }
}
