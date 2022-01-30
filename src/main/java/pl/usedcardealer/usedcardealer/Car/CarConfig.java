package pl.usedcardealer.usedcardealer.Car;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CarConfig {

    @Bean
    CommandLineRunner clrcar(CarRepository cr) {
        return args -> {
            Car c1 = new Car(1, "1234", 2011, "Volkswagen", "Polo");
            Car c2 = new Car(2, "2345", 2018, "Toyota", "Yaris");
            Car c3 = new Car(3, "3456", 2014, "Fiat", "Panda");

            cr.saveAll(
                    List.of(c1, c2, c3)
            );
        };
    }
}
