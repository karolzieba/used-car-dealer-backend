package pl.usedcardealer.usedcardealer.Document.Insurance.LiabilityInsurance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.usedcardealer.usedcardealer.Car.Car;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class LiabilityInsuranceConfig {

    @Bean
    CommandLineRunner clrli(LiabilityInsuranceRepository lir) {
        return args -> {
            Car c1 = new Car(1, "1234", 2011, "Volkswagen", "Polo");
            Car c2 = new Car(2, "2345", 2018, "Toyota", "Yaris");
            Car c3 = new Car(3, "3456", 2014, "Fiat", "Panda");

            LiabilityInsurance li1 = new LiabilityInsurance(1, LocalDate.of(2022,01,01), LocalDate.of(2023,01,01), c1, 750);
            LiabilityInsurance li2 = new LiabilityInsurance(2, LocalDate.of(2022,01,01), LocalDate.of(2023,01,01), c2, 1000);
            LiabilityInsurance li3 = new LiabilityInsurance(3, LocalDate.of(2022,01,01), LocalDate.of(2023,01,01), c3, 1200);

            lir.saveAll(
                    List.of(li1, li2, li3)
            );
        };
    }
}