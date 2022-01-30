package pl.usedcardealer.usedcardealer.Document.Contract.SaleAndPurchaseContract;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleAndPurchaseContractRepository extends JpaRepository<SaleAndPurchaseContract, Integer> {
}
