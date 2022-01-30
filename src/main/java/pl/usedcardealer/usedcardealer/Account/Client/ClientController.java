package pl.usedcardealer.usedcardealer.Account.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.usedcardealer.usedcardealer.Account.Account;

import java.util.List;

@RestController
@RequestMapping(path="/api/Client")
public class ClientController {
    private final ClientService cliservice;

    @Autowired
    public ClientController(ClientService cliservice) {
        this.cliservice = cliservice;
    }

    @GetMapping
    public List<Client> getClients() {
        return cliservice.getClients();
    }

    @PostMapping
    public void postClient(@RequestBody Client client) {
        cliservice.postClient(client);
    }

    @PutMapping(path = "{cliId}")
    public void putClient(@PathVariable("cliId") int id,
                                 @RequestParam(required = true) Account account) {
        cliservice.putClient(id, account);
    }

    @DeleteMapping(path = "{cliId}")
    public void deleteClient(@PathVariable("admId") int id) {
        cliservice.deleteClient(id);
    }
}
