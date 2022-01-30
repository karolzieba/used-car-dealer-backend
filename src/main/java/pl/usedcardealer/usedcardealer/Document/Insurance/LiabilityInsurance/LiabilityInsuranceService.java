package pl.usedcardealer.usedcardealer.Document.Insurance.LiabilityInsurance;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiabilityInsuranceService {
    private LiabilityInsuranceRepository repository;

    public LiabilityInsuranceService(LiabilityInsuranceRepository repository) {
        this.repository = repository;
    }

    public List<LiabilityInsurance> getInsurances() {
        return repository.findAll();
    }

    public void postInsurance(LiabilityInsurance li) {
        repository.save(li);
    }

    public void deleteInsurance(int id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
        else {
            throw new IllegalStateException("Ubezpieczenie OC o takim ID nie istnieje!");
        }
    }
}