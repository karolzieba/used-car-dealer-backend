package pl.usedcardealer.usedcardealer.Branch;

import org.springframework.stereotype.Service;
import pl.usedcardealer.usedcardealer.Account.Employee.Employee;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class BranchService {
    private BranchRepository repository;

    public BranchService(BranchRepository repository) {
        this.repository = repository;
    }

    public List<Branch> getBranches() {
        return repository.findAll();
    }

    public void postBranch(Branch branch) {
        repository.save(branch);
    }

    @Transactional
    public void putBranch(int id, Employee employee, boolean action) {
        if(repository.existsById(id)) {
            Branch b = repository.findById(id).orElseThrow(() -> new IllegalStateException("Oddział o takim ID nie istnieje!"));

            if(!Objects.isNull(employee) && !Objects.isNull(action)) {
                if(action) {
                    b.addEmployee(employee);
                }
                else {
                    b.deleteEmployee(employee);
                }
            }
        }
        else {
            throw new IllegalStateException("Oddział o takim ID nie istnieje!");
        }
    }

    public void deleteBranch(int id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
        else {
            throw new IllegalStateException("Oddział o takim ID nie istnieje!");
        }
    }
}
