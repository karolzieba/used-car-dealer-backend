package pl.usedcardealer.usedcardealer.Document.Contract.UsedCarDealerContract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/UsedCarDealerContract")
public class UsedCarDealerContractController {
    private final UsedCarDealerContractService ucdcservice;

    @Autowired
    public UsedCarDealerContractController(UsedCarDealerContractService ucdcservice) {
        this.ucdcservice = ucdcservice;
    }

    @GetMapping
    public List<UsedCarDealerContract> getUsedCarDealerContracts() {
        return ucdcservice.getUsedCarDealerContracts();
    }

    @PostMapping
    public void postUsedCarDealerContract(@RequestBody UsedCarDealerContract usedCarDealerContract) {
        ucdcservice.postUsedCarDealerContract(usedCarDealerContract);
    }

    @DeleteMapping(path = "{ucdcId}")
    public void deleteUsedCarDealerContract(@PathVariable("ucdcId") int id) {
        ucdcservice.deleteUsedCarDealerContract(id);
    }
}
