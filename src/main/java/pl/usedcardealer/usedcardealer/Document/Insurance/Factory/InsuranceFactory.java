package pl.usedcardealer.usedcardealer.Document.Insurance.Factory;

import pl.usedcardealer.usedcardealer.Car.Car;

import java.util.Date;

public interface InsuranceFactory <T> {
    T createInsurance(Date date, Car car, Date startDate, Date endDate, double price);
}