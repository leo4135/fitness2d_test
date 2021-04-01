package DFIT.fitness2d.controllers;

import DFIT.fitness2d.entity.Abonements;
import DFIT.fitness2d.entity.Client;
import DFIT.fitness2d.entity.ClientAbon;
import DFIT.fitness2d.repository.AbonementsRepository;
import DFIT.fitness2d.repository.ClientRepository;
import DFIT.fitness2d.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientRepository clients;
    @Autowired
    private AbonementsRepository abonementsRepository;
    private RoleRepository roleRepository;


// @GetMapping
    // public Iterable<Client> listClients(){
    //     return clients.findAll();
    //}

    @PostMapping
    public Client addClient( @RequestParam(value = "name") String name,
                             @RequestParam(value = "telephone") String telephone,
                             @RequestParam(value = "surname") String surname,
                             @RequestParam(value = "id") int id
    ){
        Client newClient = new Client();
        newClient.setName(name);
        newClient.setPhone(telephone);
        newClient.setPassword(telephone);
        newClient.setSurname(surname);
        Abonements abonement = abonementsRepository.findById(id).get();
        ClientAbon clientAbon = new ClientAbon();
        clientAbon.setClient(newClient);
        clientAbon.setAbonement(abonement);
        
        return newClient;
    }


     @GetMapping
    public Iterable<Client> getAll(){
        return clients.findAll();
    }

    @GetMapping
    public Page<Client> getByPage(@RequestParam int Page,
                                  @RequestParam int Size){
        Pageable pageable = PageRequest.of(Page, Size);
        Page<Client> client = clients.findAll(pageable);
        return client;
    }

}
