package pl.usedcardealer.usedcardealer.Document.Insurance.AccInsurance;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccInsuranceService {
    private AccInsuranceRepository repository;

    public AccInsuranceService(AccInsuranceRepository repository) {
        this.repository = repository;
    }

    public List<AccInsurance> getInsurances() {
        return repository.findAll();
    }

    public void postInsurance(AccInsurance acc) {
        repository.save(acc);
    }

    public void deleteInsurance(int id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
        else {
            throw new IllegalStateException("Ubezpieczenie ACC o takim ID nie istnieje!");
        }
    }
}