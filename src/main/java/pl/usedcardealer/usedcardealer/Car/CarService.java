package pl.usedcardealer.usedcardealer.Car;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    public List<String> displayCars() {
        return List.of("test1", "test2", "test3");
    }
}
