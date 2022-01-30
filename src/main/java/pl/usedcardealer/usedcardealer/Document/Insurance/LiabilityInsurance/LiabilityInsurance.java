package pl.usedcardealer.usedcardealer.Document.Insurance.LiabilityInsurance;

import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Insurance.Insurance;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class LiabilityInsurance extends Insurance {
    private double price;

    public LiabilityInsurance() { }

    public LiabilityInsurance(int id, LocalDate startDate, LocalDate endDate, Car car, double price) {
        super(id, startDate, endDate, car.getId());
        this.price = price;
        super.setAmountOfCompensation(calculateAmountOfCompensation());
    }

    @Override
    public void displayDocument() {

    }

    @Override
    public double calculateAmountOfCompensation() {
        return (price * 10);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}