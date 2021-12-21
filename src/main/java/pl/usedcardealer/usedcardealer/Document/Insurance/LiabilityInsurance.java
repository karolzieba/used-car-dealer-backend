package pl.usedcardealer.usedcardealer.Document.Insurance;

import pl.usedcardealer.usedcardealer.Car.Car;

import java.util.Date;

public class LiabilityInsurance extends Insurance {
    public LiabilityInsurance(Date date, Car car, Date startDate, Date endDate, double price) {
        super(date, car, startDate, endDate, price);
    }
}