package pl.usedcardealer.usedcardealer.Account.Employee;

import org.springframework.stereotype.Service;
import pl.usedcardealer.usedcardealer.Account.Account;
import pl.usedcardealer.usedcardealer.Account.Administrator.Administrator;
import pl.usedcardealer.usedcardealer.Account.Administrator.AdministratorRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {
    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    public void postEmployee(Employee employee) {
        repository.save(employee);
    }

    @Transactional
    public void putEmployee(int id, Account account) {
        if(repository.existsById(id)) {
            Employee e = repository.findById(id).orElseThrow(() -> new IllegalStateException("Pracownik o takim ID nie istnieje!"));

            if(!Objects.isNull(account)) {
                e.setAccount(account);
            }
        }
        else {
            throw new IllegalStateException("Pracownik o takim ID nie istnieje!");
        }
    }

    public void deleteEmployee(int id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
        else {
            throw new IllegalStateException("Praocwnik o takim ID nie istnieje!");
        }
    }
}
