package pl.usedcardealer.usedcardealer.Car;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class CarService {
    private CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<Car> getCars() {
        return repository.findAll();
    }

    public void postCar(Car car) {
        repository.save(car);
    }

    @Transactional
    public void putCar(int id, boolean isStolen, boolean isReserved, String damageToAdd, String damageToRemove) {
        if(repository.existsById(id)) {
            Car c = repository.findById(id).orElseThrow(() -> new IllegalStateException("Auto o takim ID nie istnieje!"));

            if(!Objects.isNull(isStolen)) {
                c.setStolen(isStolen);
            }

            if(!Objects.isNull(isReserved)) {
                c.setStolen(isReserved);
            }

            if(!Objects.isNull(damageToAdd)) {
                c.addDamageToACar(damageToAdd);
            }

            if(!Objects.isNull(damageToRemove)) {
                c.repairCar(damageToRemove);
            }
        }
        else {
            throw new IllegalStateException("Auto o takim ID nie istnieje!");
        }
    }

    public void deleteCar(int id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
        else {
            throw new IllegalStateException("Auto o takim ID nie istnieje!");
        }
    }
}
