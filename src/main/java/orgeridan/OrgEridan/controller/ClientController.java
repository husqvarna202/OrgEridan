package orgeridan.OrgEridan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import orgeridan.OrgEridan.Service.ClientService;
import orgeridan.OrgEridan.model.Client;

import java.util.List;

@Controller
public class ClientController {

    private ClientService clientService;
        @Autowired
        public void setClientService(ClientService clientService) {
            this.clientService = clientService;
        }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allClient() {
        List<Client> Client = clientService.allClient();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Client");
        modelAndView.addObject("ClientList", Client);
        return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id) {
        Client client = clientService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("client", client);
        return modelAndView;
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editClient(@ModelAttribute("Client") Client client) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        clientService.edit(client);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addClient(@ModelAttribute("Client") Client client) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        clientService.add(client);
        return modelAndView;
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteClient(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        Client client = clientService.getById(id);
        clientService.delete(client);
        return modelAndView;
    }



}
