package pl.usedcardealer.usedcardealer.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Car> getCars() {
        return carservice.getCars();
    }

    @PostMapping
    public void postCar(@RequestBody Car car) {
        carservice.postCar(car);
    }

    @PutMapping(path = "{carId}")
    public void putCar(@PathVariable("carId") int id,
                       @RequestParam(required = false) boolean isStolen,
                       @RequestParam(required = false) boolean isReserved,
                       @RequestParam(required = false) String damageToAdd,
                       @RequestParam(required = false) String damageToRemove) {
        carservice.putCar(id, isStolen, isReserved, damageToAdd, damageToRemove);
    }

    @DeleteMapping(path = "{carId}")
    public void deleteCar(@PathVariable("carId") int id) {
        carservice.deleteCar(id);
    }
}
