package pl.usedcardealer.usedcardealer.Branch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.usedcardealer.usedcardealer.Person.Address;

import java.util.List;

@Configuration
public class BranchConfig {
    @Bean
    CommandLineRunner clrbr(BranchRepository brr) {
        return args -> {
            Branch b1 = new Branch(1, "Oddział 1", 1, new Address("00-000", "Kielce", "IX Wieków", 20));
            Branch b2 = new Branch(2, "Oddział 2", 2, new Address("00-000", "Kielce", "Lipowa", 21));
            Branch b3 = new Branch(3, "Oddział 3", 3, new Address("00-000", "Kielce", "Kwiatowa", 22));

            brr.saveAll(
                    List.of(b1, b2, b3)
            );
        };
    }
}
