package pl.usedcardealer.usedcardealer.Document.Insurance.LiabilityInsurance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiabilityInsuranceRepository extends JpaRepository<LiabilityInsurance, Integer> {
}
