package com.retail.walmart.Service;
import com.retail.walmart.Model.User;
import com.retail.walmart.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiddingService {

    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public void addUser(User user) {
        repository.save(user);
    }

    public Optional<User> getUserById(int id) {
        return repository.findById(id);
    }
    public void updateUser(int id, User user) {
        if (repository.existsById(id)) {
            user.setId(id);
            repository.save(user);
        }
    }
    public void deleteUser(int id) {
        repository.deleteById(id);
    }
}
