package pl.usedcardealer.usedcardealer.Document.Contract.Invoice;

import pl.usedcardealer.usedcardealer.Account.Client;
import pl.usedcardealer.usedcardealer.Account.Employee;
import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Contract.Contract;

import javax.persistence.Entity;

@Entity
public class Invoice extends Contract {
    private double amount;

    public Invoice() { }

    public Invoice(int id, Employee employee, Client client, Car car, double amount) {
        super(id, employee, client, car);
        this.amount = amount;
    }

    @Override
    public void displayDocument() {
        System.out.println("Faktura " + super.getId() + " o wartości " + amount + " złotych.");
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
