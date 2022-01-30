package pl.usedcardealer.usedcardealer.Document.Contract.UsedCarDealerContract;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsedCarDealerContractService {
    private UsedCarDealerContractRepository repository;

    public UsedCarDealerContractService(UsedCarDealerContractRepository repository) {
        this.repository = repository;
    }

    public List<UsedCarDealerContract> getUsedCarDealerContracts() {
        return repository.findAll();
    }

    public void postUsedCarDealerContract(UsedCarDealerContract ucdc) {
        repository.save(ucdc);
    }

    public void deleteUsedCarDealerContract(int id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
        else {
            throw new IllegalStateException("Umowa komisowa o takim ID nie istnieje!");
        }
    }
}
