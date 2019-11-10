package orgeridan.OrgEridan.dao;
import orgeridan.OrgEridan.model.Client;

import java.util.List;
public interface ClientDAO {
    List<Client> allClient();
    void add(Client client);
    void delete(Client client);
    void edit(Client client);
    Client getById(int id);
}
