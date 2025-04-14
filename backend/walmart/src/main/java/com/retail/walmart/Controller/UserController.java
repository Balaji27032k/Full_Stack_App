package com.retail.walmart.Controller;
import com.retail.walmart.Model.User;
import com.retail.walmart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        service.addUser(user);
        return "User added!";
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable int id) {
        return service.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        service.deleteUser(id);
        return "User deleted!";
    }
    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User user) {
        service.updateUser(id, user);
        return "User updated!";
    }
}

