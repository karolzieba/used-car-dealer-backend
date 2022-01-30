package pl.usedcardealer.usedcardealer.Document.Contract.SaleAndPurchaseContract;

import pl.usedcardealer.usedcardealer.Account.Client.Client;
import pl.usedcardealer.usedcardealer.Account.Employee.Employee;
import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Contract.Contract;

import javax.persistence.Entity;

@Entity
public class SaleAndPurchaseContract extends Contract {
    private double amount;

    public SaleAndPurchaseContract() { }

    public SaleAndPurchaseContract(int id, Employee employee, Client client, Car car, double amount) {
        super(id, employee, client, car);
        this.amount = amount;
    }

    @Override
    public void displayDocument() {
        System.out.println("Umowa kupna - sprzedaży " + super.getId() + " o wartości " + amount + " złotych.");
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}