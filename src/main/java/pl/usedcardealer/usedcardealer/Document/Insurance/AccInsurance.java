package pl.usedcardealer.usedcardealer.Document.Insurance;

import pl.usedcardealer.usedcardealer.Car.Car;

import java.util.Date;

public class AccInsurance extends Insurance {
    public AccInsurance(Date date, Car car, Date startDate, Date endDate, double price) {
        super(date, car, startDate, endDate, price);
    }
}