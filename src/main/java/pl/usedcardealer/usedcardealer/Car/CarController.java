package pl.usedcardealer.usedcardealer.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/Car")
public class CarController {
    private final CarService carservice;

    @Autowired
    public CarController(CarService carservice) {
        this.carservice = carservice;
    }

    @GetMapping
    public List<String> getListOfCars() {
        return carservice.displayCars();
    }
}
