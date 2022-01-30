package pl.usedcardealer.usedcardealer.Document.Insurance;

import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Document;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Insurance implements Document {
    @Id
    @SequenceGenerator(
            name = "liabilityinsurance_sequence",
            sequenceName = "liabilityinsurance_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "liabilityinsurance_sequence"
    )
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate creationDate;
    @Transient
    private Car car;
    private int idCar;
    private double amountOfCompensation;

    protected Insurance() { }

    protected Insurance(int id, LocalDate startDate, LocalDate endDate, Car car) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.creationDate = LocalDate.now();
        this.car = car;
        this.idCar = car.getId();
    }

    public abstract double calculateAmountOfCompensation();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public double getAmountOfCompensation() {
        return amountOfCompensation;
    }

    public void setAmountOfCompensation(double amountOfCompensation) {
        this.amountOfCompensation = amountOfCompensation;
    }
}