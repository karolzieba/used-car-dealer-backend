package pl.usedcardealer.usedcardealer.Document.Insurance.AccInsurance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.usedcardealer.usedcardealer.Car.Car;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class AccInsuranceConfig {

    @Bean
    CommandLineRunner clracc(AccInsuranceRepository lir) {
        return args -> {
            Car c1 = new Car(1, "1234", 2011, "Volkswagen", "Polo");
            Car c2 = new Car(2, "2345", 2018, "Toyota", "Yaris");
            Car c3 = new Car(3, "3456", 2014, "Fiat", "Panda");

            c1.addDamageToACar("Zbite światła");
            c2.addDamageToACar("Zbite światła");
            c2.addDamageToACar("Zniszczony zderzak");

            Map<String, Double> p1 = new HashMap<>();
            p1.put("Zbite światła", 200.0);

            Map<String, Double> p2 = new HashMap<>();
            p2.put("Zbite światła", 200.0);
            p2.put("Zniszczony zderzak", 300.0);

            Map<String, Double> p3 = new HashMap<>();
            p3.put("Przebita opona", 100.0);

            AccInsurance li1 = new AccInsurance(4, LocalDate.of(2022,01,01), LocalDate.of(2023,01,01), c1, p1);
            AccInsurance li2 = new AccInsurance(5, LocalDate.of(2022,01,01), LocalDate.of(2023,01,01), c2, p2);
            AccInsurance li3 = new AccInsurance(6, LocalDate.of(2022,01,01), LocalDate.of(2023,01,01), c3, p3);

            lir.saveAll(
                    List.of(li1, li2, li3)
            );
        };
    }
}