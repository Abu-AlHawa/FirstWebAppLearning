package FirstWebApp.FirstWebApp.services;
import FirstWebApp.FirstWebApp.entities.user;
import FirstWebApp.FirstWebApp.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;



@Service
public class userServices {
    @Autowired
    userRepository repository;

    public user addUser(user u)
    {
        return repository.save(u);
    }
    public ArrayList<user> getAll()
    {
        return (ArrayList<user>) repository.findAll();
    }
    public Optional<user> findUserById(Long id)
    {
        return repository.findById(id);
    }
}
