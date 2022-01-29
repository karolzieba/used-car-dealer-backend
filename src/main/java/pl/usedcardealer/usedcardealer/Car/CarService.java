package pl.usedcardealer.usedcardealer.Car;

import org.springframework.stereotype.Service;
import pl.usedcardealer.usedcardealer.Document.Insurance.AccInsurance;
import pl.usedcardealer.usedcardealer.Document.Insurance.LiabilityInsurance;

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
    public void putCar(int id, LiabilityInsurance liabilityInsurance, AccInsurance accInsurance,
                       boolean isStolen, String damageToAdd, String damageToRemove) {

        if(repository.existsById(id)) {
            Car c = repository.findById(id).orElseThrow(() -> new IllegalStateException("Auto o takim ID nie istnieje!"));

            if(!Objects.isNull(liabilityInsurance)) {
                c.setLiabilityInsurance(liabilityInsurance);
            }

            if(!Objects.isNull(accInsurance)) {
                c.setAccInsurance(accInsurance);
            }

            if(!Objects.isNull(isStolen)) {
                c.setStolen(isStolen);
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
