package pl.usedcardealer.usedcardealer.Document.Insurance.AccInsurance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccInsuranceRepository extends JpaRepository<AccInsurance, Integer> {
}

