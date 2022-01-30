package pl.usedcardealer.usedcardealer.Document.Contract.UsedCarDealerContract;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsedCarDealerContractRepository extends JpaRepository<UsedCarDealerContract, Integer> {
}
