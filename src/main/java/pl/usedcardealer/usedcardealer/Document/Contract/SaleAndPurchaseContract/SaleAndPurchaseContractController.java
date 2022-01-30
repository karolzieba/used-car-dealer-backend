package pl.usedcardealer.usedcardealer.Document.Contract.SaleAndPurchaseContract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/SaleAndPurchaseContract")
public class SaleAndPurchaseContractController {
    private final SaleAndPurchaseContractService sapcservice;

    @Autowired
    public SaleAndPurchaseContractController(SaleAndPurchaseContractService sapcservice) {
        this.sapcservice = sapcservice;
    }

    @GetMapping
    public List<SaleAndPurchaseContract> getSaleAndPurchaseContracts() {
        return sapcservice.getSaleAndPurchaseContracts();
    }

    @PostMapping
    public void postSaleAndPurchaseContract(@RequestBody SaleAndPurchaseContract saleAndPurchaseContract) {
        sapcservice.postSaleAndPurchaseContract(saleAndPurchaseContract);
    }

    @DeleteMapping(path = "{sapcId}")
    public void deleteSaleAndPurchaseContract(@PathVariable("sapcId") int id) {
        sapcservice.deleteSaleAndPurchaseContract(id);
    }
}
