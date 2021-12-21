package pl.usedcardealer.usedcardealer.Document.Insurance;

import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Document;

import java.util.Date;

public class Insurance extends Document {
    private Date startDate;
    private Date endDate;
    private double price;

    public Insurance(Date date, Car car, Date startDate, Date endDate, double price) {
        super(date, car);
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }


}