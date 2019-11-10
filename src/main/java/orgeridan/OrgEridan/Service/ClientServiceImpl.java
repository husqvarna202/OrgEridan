package orgeridan.OrgEridan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import orgeridan.OrgEridan.dao.ClientDAO;
import orgeridan.OrgEridan.model.Client;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private ClientDAO clientDAO;

    public ClientServiceImpl(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }


    @Autowired
    public void setClientDAO(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }
    //private ClientDAO clientDAO = new ClientDAOImpl();


    @Override
    @Transactional
    public List<Client> allClient() {
        return clientDAO.allClient();
    }



    @Override
    @Transactional
    public void add(Client client) {
        clientDAO.add(client);
    }

    @Override
    @Transactional
    public void delete(Client client) {
        clientDAO.delete(client);
    }

    @Override
    @Transactional
    public void edit(Client client) {
        clientDAO.edit(client);
    }

    @Override
    @Transactional
    public Client getById(int id) {
        return clientDAO.getById(id);
    }
}
