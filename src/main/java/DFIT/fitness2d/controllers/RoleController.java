package DFIT.fitness2d.controllers;

import DFIT.fitness2d.entity.Role;
import DFIT.fitness2d.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @PostMapping
    public Role addrole(@RequestParam String role ){
        Role newRole = new Role();
        newRole.setRolename(role);

        return roles.save(newRole);

    }
    @Autowired
    private RoleRepository roles;

    @GetMapping
    public Iterable<Role> getAll(){
        return roles.findAll();
    }
    // @GetMapping
    // public Iterable<Role> listRoles() {
   //     return roles.findAll();
    // }


}
