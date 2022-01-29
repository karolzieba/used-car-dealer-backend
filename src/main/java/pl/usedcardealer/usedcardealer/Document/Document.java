package pl.usedcardealer.usedcardealer.Document;

import pl.usedcardealer.usedcardealer.Car.Car;

import java.io.Serializable;
import java.util.Date;

public class Document implements Serializable {
    private Date creationDate;
    private Car car;

    public Document(Date creationDate, Car car) {
        this.creationDate = creationDate;
        this.car = car;
    }

    public void display() {
        System.out.println("    " +  creationDate + "   ");
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

