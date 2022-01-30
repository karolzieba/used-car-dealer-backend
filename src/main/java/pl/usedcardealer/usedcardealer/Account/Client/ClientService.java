package pl.usedcardealer.usedcardealer.Account.Client;

import org.springframework.stereotype.Service;
import pl.usedcardealer.usedcardealer.Account.Account;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class ClientService {
    private ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> getClients() {
        return repository.findAll();
    }

    public void postClient(Client client) {
        repository.save(client);
    }

    @Transactional
    public void putClient(int id, Account account) {
        if(repository.existsById(id)) {
            Client c = repository.findById(id).orElseThrow(() -> new IllegalStateException("Klient o takim ID nie istnieje!"));

            if(!Objects.isNull(account)) {
                c.setAccount(account);
            }
        }
        else {
            throw new IllegalStateException("Klient o takim ID nie istnieje!");
        }
    }

    public void deleteClient(int id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
        else {
            throw new IllegalStateException("Klient o takim ID nie istnieje!");
        }
    }
}
