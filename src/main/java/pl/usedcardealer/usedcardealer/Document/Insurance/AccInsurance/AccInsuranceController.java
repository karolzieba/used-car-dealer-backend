package pl.usedcardealer.usedcardealer.Document.Insurance.AccInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/AccInsurance")
public class AccInsuranceController {
    private final AccInsuranceService accservice;

    @Autowired
    public AccInsuranceController(AccInsuranceService accservice) {
        this.accservice = accservice;
    }

    @GetMapping
    public List<AccInsurance> getInsurances() {
        return accservice.getInsurances();
    }

    @PostMapping
    public void postInsurance(@RequestBody AccInsurance insurance) {
        accservice.postInsurance(insurance);
    }

    @DeleteMapping(path = "{accId}")
    public void deleteInsurance(@PathVariable("accId") int id) {
        accservice.deleteInsurance(id);
    }
}