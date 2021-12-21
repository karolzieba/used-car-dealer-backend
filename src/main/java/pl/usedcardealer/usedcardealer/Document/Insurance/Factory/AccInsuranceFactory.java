package pl.usedcardealer.usedcardealer.Document.Insurance.Factory;

import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Insurance.AccInsurance;

import java.util.Date;

public class AccInsuranceFactory implements InsuranceFactory <AccInsurance> {
    @Override
    public AccInsurance createInsurance(Date date, Car car, Date startDate, Date endDate, double price) {
        return new AccInsurance(date, car, startDate, endDate, price);
    }
}
