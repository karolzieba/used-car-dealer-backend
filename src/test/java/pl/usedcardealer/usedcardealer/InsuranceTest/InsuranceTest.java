package pl.usedcardealer.usedcardealer.InsuranceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Insurance.AccInsurance.AccInsurance;
import pl.usedcardealer.usedcardealer.Document.Insurance.LiabilityInsurance.LiabilityInsurance;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class InsuranceTest {
    @Test
    public void TestLiability() {
        Car car = new Car(1, "222222", 2012, "Kia", "Stinger");
        LiabilityInsurance li = new LiabilityInsurance(1, LocalDate.of(2021, 01, 01), LocalDate.of(2022, 01, 01), car, 5000);

        Assertions.assertEquals(li.getId(), 1);
        Assertions.assertEquals(li.getStartDate(), LocalDate.of(2021, 01, 01));
        Assertions.assertEquals(li.getEndDate(), LocalDate.of(2022, 01, 01));
        Assertions.assertEquals(li.getPrice(), 5000);

        li.setPrice(10000);

        Assertions.assertEquals(li.getPrice(), 10000);
    }

    @Test
    public void TestAcc() {
        Car car = new Car(2, "111111", 2011, "Hyundai", "Tucson");
        Map<String, Double> prices = new HashMap<>();

        prices.put("Price 1", 550.5);
        prices.put("Price 2", 560.5);
        prices.put("Price 3", 570.5);

        AccInsurance acc = new AccInsurance(1, LocalDate.of(2021, 01, 01), LocalDate.of(2022, 01, 01), car, prices);

        Assertions.assertEquals(acc.getId(), 1);
        Assertions.assertEquals(acc.getStartDate(), LocalDate.of(2021, 01, 01));
        Assertions.assertEquals(acc.getEndDate(), LocalDate.of(2022, 01, 01));

        acc.setId(2);

        Assertions.assertEquals(acc.getId(), 2);
    }
}
