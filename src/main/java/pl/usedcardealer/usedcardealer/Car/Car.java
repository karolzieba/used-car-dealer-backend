package pl.usedcardealer.usedcardealer.Car;

import pl.usedcardealer.usedcardealer.Document.Insurance.*;
import pl.usedcardealer.usedcardealer.Document.Contract.Contract;

import java.util.List;

public class Car {
    private String vin;
    private int year;
    private String manufacturer;
    private List<Contract> contracts;
    private LiabilityInsurance liabilityInsurance;
    private AccInsurance accInsurance;

    public Car(String vin, int year, String manufacturer, List<Contract> contracts, LiabilityInsurance liabilityInsurance) {
        this.vin = vin;
        this.year = year;
        this.manufacturer = manufacturer;
        this.contracts = contracts;
        this.liabilityInsurance = liabilityInsurance;
    }

    public Car(String vin, int year, String manufacturer, List<Contract> contracts, LiabilityInsurance liabilityInsurance, AccInsurance accInsurance) {
        this.vin = vin;
        this.year = year;
        this.manufacturer = manufacturer;
        this.contracts = contracts;
        this.liabilityInsurance = liabilityInsurance;
        this.accInsurance = accInsurance;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public LiabilityInsurance getLiabilityInsurance() {
        return liabilityInsurance;
    }

    public void setLiabilityInsurance(LiabilityInsurance liabilityInsurance) {
        this.liabilityInsurance = liabilityInsurance;
    }

    public AccInsurance getAccInsurance() {
        return accInsurance;
    }

    public void setAccInsurance(AccInsurance accInsurance) {
        this.accInsurance = accInsurance;
    }
}