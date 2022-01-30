package pl.usedcardealer.usedcardealer.Account.Administrator;

import org.springframework.stereotype.Service;
import pl.usedcardealer.usedcardealer.Account.Account;
import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Car.CarRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class AdministratorService {
    private AdministratorRepository repository;

    public AdministratorService(AdministratorRepository repository) {
        this.repository = repository;
    }

    public List<Administrator> getAdministrators() {
        return repository.findAll();
    }

    public void postAdministrator(Administrator administrator) {
        repository.save(administrator);
    }

    @Transactional
    public void putAdministrator(int id, Account account) {
        if(repository.existsById(id)) {
            Administrator a = repository.findById(id).orElseThrow(() -> new IllegalStateException("Administrator o takim ID nie istnieje!"));

            if(!Objects.isNull(account)) {
                a.setAccount(account);
            }
        }
        else {
            throw new IllegalStateException("Administrator o takim ID nie istnieje!");
        }
    }

    public void deleteAdministrator(int id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
        else {
            throw new IllegalStateException("Administrator o takim ID nie istnieje!");
        }
    }
}
