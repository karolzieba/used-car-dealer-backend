package pl.usedcardealer.usedcardealer.CarTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.usedcardealer.usedcardealer.Car.Car;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    @Test
    public void TestCar(){
        Car car = new Car(4, "666666", 2021, "Volkswagen", "Golf");

        Assertions.assertNotNull(car);

        Assertions.assertEquals(car.getId(), 4);
        Assertions.assertEquals(car.getVin(), "666666");
        Assertions.assertEquals(car.getYear(), 2021);
        Assertions.assertEquals(car.getManufacturer(), "Volkswagen");
        Assertions.assertEquals(car.getModel(), "Golf");
        Assertions.assertFalse(car.isStolen());
        Assertions.assertFalse(car.isReserved());
        Assertions.assertFalse(car.isCarIsDamaged());

        car.setId(5);
        Assertions.assertEquals(car.getId(), 5);

        car.setVin("444444");
        Assertions.assertEquals(car.getVin(), "444444");

        car.setYear(2018);
        Assertions.assertEquals(car.getYear(), 2018);

        car.setManufacturer("BMW");
        Assertions.assertEquals(car.getManufacturer(), "BMW");

        car.setModel("E90");
        Assertions.assertEquals(car. getModel(), "E90");

        car.setReserved(true);
        Assertions.assertTrue(car.isReserved());

        car.setStolen(true);
        Assertions.assertTrue(car.isStolen());

        List<String> carDamage = new ArrayList<>();
        carDamage.add("Zbite światła");

        car.setCarDamage(carDamage);

        Assertions.assertTrue(car.isCarIsDamaged());
    }
}
