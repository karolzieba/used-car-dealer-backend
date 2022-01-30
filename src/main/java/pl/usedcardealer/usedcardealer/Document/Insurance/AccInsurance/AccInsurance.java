package pl.usedcardealer.usedcardealer.Document.Insurance.AccInsurance;

import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Insurance.Insurance;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

@Entity
public class AccInsurance extends Insurance {
    @ElementCollection
    @CollectionTable(name = "prices", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "pricesOfPartsOfInsurance")
    private Map<String, Double> pricesOfPartsOfInsurance;

    public AccInsurance() { }

    public AccInsurance(int id, LocalDate startDate, LocalDate endDate, Car car, Map<String, Double> pricesOfPartsOfInsurance) {
        super(id, startDate, endDate, car);
        this.pricesOfPartsOfInsurance = pricesOfPartsOfInsurance;
        super.setAmountOfCompensation(calculateAmountOfCompensation());
    }

    @Override
    public void displayDocument() {
        System.out.println("Ubezpieczenie " + super.getId() + " o wartości " + super.getAmountOfCompensation() + " złotych.");
    }

    @Override
    public double calculateAmountOfCompensation() {
        double amount = 0;
        Iterator it = super.getCar().getCarDamage().iterator();

        double part;
        while(it.hasNext()) {
            part = pricesOfPartsOfInsurance.get(it.next());

            if(!Objects.isNull(part)) {
                amount += (part * 10);
            }
            else {
                amount += 0;
            }
        }

        return amount;
    }

    public Map<String, Double> getPricesOfPartsOfInsurance() {
        return pricesOfPartsOfInsurance;
    }

    public void setPricesOfPartsOfInsurance(Map<String, Double> pricesOfPartsOfInsurance) {
        this.pricesOfPartsOfInsurance = pricesOfPartsOfInsurance;
    }
}