package pl.usedcardealer.usedcardealer.Document.Insurance.LiabilityInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/LiabilityInsurance")
public class LiabilityInsuranceController {
    private final LiabilityInsuranceService liservice;

    @Autowired
    public LiabilityInsuranceController(LiabilityInsuranceService liservice) {
        this.liservice = liservice;
    }

    @GetMapping
    public List<LiabilityInsurance> getInsurances() {
        return liservice.getInsurances();
    }

    @PostMapping
    public void postInsurance(@RequestBody LiabilityInsurance insurance) {
        liservice.postInsurance(insurance);
    }

    @DeleteMapping(path = "{liId}")
    public void deleteInsurance(@PathVariable("liId") int id) {
        liservice.deleteInsurance(id);
    }
}
