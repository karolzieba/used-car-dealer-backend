package pl.usedcardealer.usedcardealer.Account.Administrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.usedcardealer.usedcardealer.Account.Account;

import java.util.List;

@RestController
@RequestMapping(path="/api/Administrator")
public class AdministratorController {
    private final AdministratorService admservice;

    @Autowired
    public AdministratorController(AdministratorService admservice) {
        this.admservice = admservice;
    }

    @GetMapping
    public List<Administrator> getAdministrators() {
        return admservice.getAdministrators();
    }

    @PostMapping
    public void postAdministrator(@RequestBody Administrator administrator) {
        admservice.postAdministrator(administrator);
    }

    @PutMapping(path = "{admId}")
    public void putAdministrator(@PathVariable("admId") int id,
                       @RequestParam(required = true) Account account) {
        admservice.putAdministrator(id, account);
    }

    @DeleteMapping(path = "{admId}")
    public void deleteAdministrator(@PathVariable("admId") int id) {
        admservice.deleteAdministrator(id);
    }
}
