package pl.usedcardealer.usedcardealer.Document.Contract.SaleAndPurchaseContract;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleAndPurchaseContractService {
    private SaleAndPurchaseContractRepository repository;

    public SaleAndPurchaseContractService(SaleAndPurchaseContractRepository repository) {
        this.repository = repository;
    }

    public List<SaleAndPurchaseContract> getSaleAndPurchaseContracts() {
        return repository.findAll();
    }

    public void postSaleAndPurchaseContract(SaleAndPurchaseContract sapc) {
        repository.save(sapc);
    }

    public void deleteSaleAndPurchaseContract(int id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
        else {
            throw new IllegalStateException("Umowa kupna - sprzedaży o takim ID nie istnieje!");
        }
    }
}
