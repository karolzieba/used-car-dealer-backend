package pl.usedcardealer.usedcardealer.Car;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Car implements Serializable {
    @Id
    @SequenceGenerator(
            name = "car_sequence",
            sequenceName = "car_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "car_sequence"
    )
    private int id;
    private String vin;
    private int year;
    private String manufacturer;
    private String model;
    private boolean isStolen;
    private boolean isReserved;
    @ElementCollection
    @CollectionTable(name = "carDamageList", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "carDamage")
    private List<String> carDamage;

    public Car() {
        this.isStolen = false;
    }

    public Car(int id, String vin, int year, String manufacturer, String model) {
        this.id = id;
        this.vin = vin;
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.isStolen = false;
        this.isReserved = false;
        this.carDamage = new ArrayList<String>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isStolen() {
        return isStolen;
    }

    public void setStolen(boolean isStolen) {
        this.isStolen = isStolen;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public List<String> getCarDamage() {
        return carDamage;
    }

    public void setCarDamage(List<String> carDamage) {
        this.carDamage = carDamage;
    }

    public boolean isCarIsDamaged() {
        if(carDamage.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }

    private boolean correctDamageType(String damage) {
        if(damage.equals("Zbite światła") || damage.equals("Zniszczony zderzak") || damage.equals("Przebita opona")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void addDamageToACar(String damage) {
        if(correctDamageType(damage)) {
            carDamage.add(damage);
        }
    }

    public void repairCar(String damage) {
        if(correctDamageType(damage)) {
            carDamage.remove(damage);
        }
    }
}