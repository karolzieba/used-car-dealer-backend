package pl.usedcardealer.usedcardealer.Document.Contract.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/Invoice")
public class InvoiceController {
    private final InvoiceService iservice;

    @Autowired
    public InvoiceController(InvoiceService iservice) {
        this.iservice = iservice;
    }

    @GetMapping
    public List<Invoice> getInvoices() {
        return iservice.getInvoices();
    }

    @PostMapping
    public void postInvoice(@RequestBody Invoice invoice) {
        iservice.postInvoice(invoice);
    }

    @DeleteMapping(path = "{iId}")
    public void deleteInvoice(@PathVariable("iId") int id) {
        iservice.deleteInvoice(id);
    }
}
