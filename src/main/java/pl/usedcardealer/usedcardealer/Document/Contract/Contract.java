package pl.usedcardealer.usedcardealer.Document.Contract;

import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Document;
import pl.usedcardealer.usedcardealer.Account.Client;
import pl.usedcardealer.usedcardealer.Account.Employee;

import java.util.Date;

public class Contract implements Document {
    private Employee employee;
    private Client client;

    public Contract(Date date, Car car, Employee employee, Client client) {
        //super(date, car);
        this.employee = employee;
        this.client = client;
    }

    @Override
    public void displayDocument() {

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}