package pl.usedcardealer.usedcardealer.Document.Contract.Invoice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    private InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }

    public List<Invoice> getInvoices() {
        return repository.findAll();
    }

    public void postInvoice(Invoice i) {
        repository.save(i);
    }

    public void deleteInvoice(int id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
        else {
            throw new IllegalStateException("Faktura o takim ID nie istnieje!");
        }
    }
}
