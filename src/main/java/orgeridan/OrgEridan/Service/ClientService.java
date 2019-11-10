package orgeridan.OrgEridan.Service;
import orgeridan.OrgEridan.model.Client;

import java.util.List;


public interface ClientService {
    List<Client> allClient();
    void add(Client client);
    void delete(Client client);
    void edit(Client client);
    Client getById(int id);
}
